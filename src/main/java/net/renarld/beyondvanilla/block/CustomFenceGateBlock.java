package net.renarld.beyondvanilla.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class CustomFenceGateBlock extends HorizontalFacingBlock {
    public static final BooleanProperty OPEN;
    public static final BooleanProperty POWERED;
    public static final BooleanProperty IN_WALL;
    protected static final VoxelShape Z_AXIS_SHAPE;
    protected static final VoxelShape X_AXIS_SHAPE;
    protected static final VoxelShape IN_WALL_Z_AXIS_SHAPE;
    protected static final VoxelShape IN_WALL_X_AXIS_SHAPE;
    protected static final VoxelShape Z_AXIS_COLLISION_SHAPE;
    protected static final VoxelShape X_AXIS_COLLISION_SHAPE;
    protected static final VoxelShape Z_AXIS_CULL_SHAPE;
    protected static final VoxelShape X_AXIS_CULL_SHAPE;
    protected static final VoxelShape IN_WALL_Z_AXIS_CULL_SHAPE;
    protected static final VoxelShape IN_WALL_X_AXIS_CULL_SHAPE;

    public CustomFenceGateBlock(Settings settings) {
        super(settings);
        this.setDefaultState(((( this.stateManager.getDefaultState()).with(OPEN, false)).with(POWERED, false)).with(IN_WALL, false));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (state.get(IN_WALL)) {
            return (state.get(FACING)).getAxis() == Direction.Axis.X ? IN_WALL_X_AXIS_SHAPE : IN_WALL_Z_AXIS_SHAPE;
        } else {
            return (state.get(FACING)).getAxis() == Direction.Axis.X ? X_AXIS_SHAPE : Z_AXIS_SHAPE;
        }
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {
        Direction.Axis axis = direction.getAxis();
        if ((state.get(FACING)).rotateYClockwise().getAxis() != axis) {
            return super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
        } else {
            boolean bl = this.isWall(newState) || this.isWall(world.getBlockState(pos.offset(direction.getOpposite())));
            return state.with(IN_WALL, bl);
        }
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (state.get(OPEN)) {
            return VoxelShapes.empty();
        } else {
            return (state.get(FACING)).getAxis() == Direction.Axis.Z ? Z_AXIS_COLLISION_SHAPE : X_AXIS_COLLISION_SHAPE;
        }
    }

    @Override
    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        if (state.get(IN_WALL)) {
            return (state.get(FACING)).getAxis() == Direction.Axis.X ? IN_WALL_X_AXIS_CULL_SHAPE : IN_WALL_Z_AXIS_CULL_SHAPE;
        } else {
            return (state.get(FACING)).getAxis() == Direction.Axis.X ? X_AXIS_CULL_SHAPE : Z_AXIS_CULL_SHAPE;
        }
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        switch (type) {
            case LAND:
            case AIR:
                return state.get(OPEN);
            default:
                return false;
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        World world = ctx.getWorld();
        BlockPos blockPos = ctx.getBlockPos();
        boolean bl = world.isReceivingRedstonePower(blockPos);
        Direction direction = ctx.getPlayerFacing();
        Direction.Axis axis = direction.getAxis();
        boolean bl2 = axis == Direction.Axis.Z && (this.isWall(world.getBlockState(blockPos.west())) || this.isWall(world.getBlockState(blockPos.east()))) || axis == Direction.Axis.X && (this.isWall(world.getBlockState(blockPos.north())) || this.isWall(world.getBlockState(blockPos.south())));
        return (((this.getDefaultState().with(FACING, direction)).with(OPEN, bl)).with(POWERED, bl)).with(IN_WALL, bl2);
    }

    private boolean isWall(BlockState state) {
        return state.getBlock().isIn(BlockTags.WALLS);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (state.get(OPEN)) {
            state = state.with(OPEN, false);
            world.setBlockState(pos, state, 10);
        } else {
            Direction direction = player.getHorizontalFacing();
            if (state.get(FACING) == direction.getOpposite()) {
                state = state.with(FACING, direction);
            }

            state = state.with(OPEN, true);
            world.setBlockState(pos, state, 10);
        }

        world.syncWorldEvent(player, state.get(OPEN) ? 1008 : 1014, pos, 0);
        return ActionResult.success(world.isClient);
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        if (!world.isClient) {
            boolean bl = world.isReceivingRedstonePower(pos);
            if (state.get(POWERED) != bl) {
                world.setBlockState(pos,(state.with(POWERED, bl)).with(OPEN, bl), 2);
                if (state.get(OPEN) != bl) {
                    world.syncWorldEvent(null, bl ? 1008 : 1014, pos, 0);
                }
            }

        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, OPEN, POWERED, IN_WALL);
    }

    public static boolean canWallConnect(BlockState state, Direction side) {
        return (state.get(FACING)).getAxis() == side.rotateYClockwise().getAxis();
    }

    static {
        OPEN = Properties.OPEN;
        POWERED = Properties.POWERED;
        IN_WALL = Properties.IN_WALL;
        Z_AXIS_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 6.0D, 16.0D, 16.0D, 10.0D);
        X_AXIS_SHAPE = Block.createCuboidShape(6.0D, 0.0D, 0.0D, 10.0D, 16.0D, 16.0D);
        IN_WALL_Z_AXIS_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 6.0D, 16.0D, 13.0D, 10.0D);
        IN_WALL_X_AXIS_SHAPE = Block.createCuboidShape(6.0D, 0.0D, 0.0D, 10.0D, 13.0D, 16.0D);
        Z_AXIS_COLLISION_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 6.0D, 16.0D, 24.0D, 10.0D);
        X_AXIS_COLLISION_SHAPE = Block.createCuboidShape(6.0D, 0.0D, 0.0D, 10.0D, 24.0D, 16.0D);
        Z_AXIS_CULL_SHAPE = VoxelShapes.union(Block.createCuboidShape(0.0D, 5.0D, 7.0D, 2.0D, 16.0D, 9.0D), Block.createCuboidShape(14.0D, 5.0D, 7.0D, 16.0D, 16.0D, 9.0D));
        X_AXIS_CULL_SHAPE = VoxelShapes.union(Block.createCuboidShape(7.0D, 5.0D, 0.0D, 9.0D, 16.0D, 2.0D), Block.createCuboidShape(7.0D, 5.0D, 14.0D, 9.0D, 16.0D, 16.0D));
        IN_WALL_Z_AXIS_CULL_SHAPE = VoxelShapes.union(Block.createCuboidShape(0.0D, 2.0D, 7.0D, 2.0D, 13.0D, 9.0D), Block.createCuboidShape(14.0D, 2.0D, 7.0D, 16.0D, 13.0D, 9.0D));
        IN_WALL_X_AXIS_CULL_SHAPE = VoxelShapes.union(Block.createCuboidShape(7.0D, 2.0D, 0.0D, 9.0D, 13.0D, 2.0D), Block.createCuboidShape(7.0D, 2.0D, 14.0D, 9.0D, 13.0D, 16.0D));
    }
}
