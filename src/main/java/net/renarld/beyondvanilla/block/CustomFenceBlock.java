package net.renarld.beyondvanilla.block;

import com.google.common.collect.Maps;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Util;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import java.util.Map;

public class CustomFenceBlock extends FenceBlock {
    private final VoxelShape[] cullingShapes;
    private final VoxelShape[] collisionShapes;
    private final VoxelShape[] boundingShapes;
    public static final BooleanProperty UP;
    public static final BooleanProperty WATERLOGGED;
    protected static final Map<Direction, BooleanProperty> FACING_PROPERTIES;

    public CustomFenceBlock(Settings settings) {
        super(settings);
        this.collisionShapes = this.createShapes(1.0F, 1.0F, 16.0F, 16.0F, 24.0F);
        this.boundingShapes = this.createShapes(1.0F, 1.0F, 16.0F, 0.0F, 16.0F);
        this.cullingShapes = this.createShapes(1.0F, 1.0F, 16.0F, 6.0F, 15.0F);
        this.setDefaultState((((((this.stateManager.getDefaultState()).with(NORTH, false)).with(EAST, false)).with(SOUTH, false)).with(WEST, false)).with(UP, false).with(WATERLOGGED, false));
    }

    @Override
    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        return this.cullingShapes[this.getShapeIndex(state)];
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return this.boundingShapes[this.getShapeIndex(state)];
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return this.getOutlineShape(state, world, pos, context);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return this.collisionShapes[this.getShapeIndex(state)];
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    public boolean canConnect(BlockState state, boolean neighborIsFullSquare, Direction dir) {
        Block block = state.getBlock();
        return !cannotConnect(block) && neighborIsFullSquare || this.isFence(block) || block instanceof CustomFenceGateBlock && CustomFenceGateBlock.canWallConnect(state, dir) || (block instanceof LanternBlock && dir == Direction.DOWN) || (block instanceof ToggableLanternBlock && dir == Direction.DOWN);
    }

    private boolean isFence(Block block) {
        return block instanceof CustomFenceBlock;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        return ActionResult.PASS;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockView blockView = ctx.getWorld();
        BlockPos blockPos = ctx.getBlockPos();
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        BlockPos north = blockPos.north();
        BlockPos east = blockPos.east();
        BlockPos south = blockPos.south();
        BlockPos west = blockPos.west();
        BlockPos up = blockPos.up();
        BlockState blockStateNorth = blockView.getBlockState(north);
        BlockState blockStateEast = blockView.getBlockState(east);
        BlockState blockStateSouth = blockView.getBlockState(south);
        BlockState blockStateWest = blockView.getBlockState(west);
        BlockState blockStateUp = blockView.getBlockState(up);
        return ((((super.getPlacementState(ctx).with(NORTH, this.canConnect(blockStateNorth, blockStateNorth.isSideSolidFullSquare(blockView, north, Direction.SOUTH), Direction.SOUTH))).with(EAST, this.canConnect(blockStateEast, blockStateEast.isSideSolidFullSquare(blockView, east, Direction.WEST), Direction.WEST))).with(SOUTH, this.canConnect(blockStateSouth, blockStateSouth.isSideSolidFullSquare(blockView, south, Direction.NORTH), Direction.NORTH))).with(WEST, this.canConnect(blockStateWest, blockStateWest.isSideSolidFullSquare(blockView, west, Direction.EAST), Direction.EAST))).with(UP, this.canConnect(blockStateUp, blockStateUp.isSideSolidFullSquare(blockView, up, Direction.DOWN), Direction.DOWN)).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {
        if (state.get(WATERLOGGED)) {
            world.getFluidTickScheduler().schedule(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return direction != Direction.DOWN ? state.with(FACING_PROPERTIES.get(direction), this.canConnect(newState, newState.isSideSolidFullSquare(world, posFrom, direction.getOpposite()), direction.getOpposite())) : super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(NORTH, EAST, WEST, SOUTH, UP, WATERLOGGED);
    }

    static {
        UP = ConnectingBlock.UP;
        WATERLOGGED = Properties.WATERLOGGED;
        FACING_PROPERTIES = Util.make(Maps.newEnumMap(Direction.class), (enumMap) -> {
            enumMap.put(Direction.NORTH, NORTH);
            enumMap.put(Direction.EAST, EAST);
            enumMap.put(Direction.SOUTH, SOUTH);
            enumMap.put(Direction.WEST, WEST);
            enumMap.put(Direction.UP, UP);
        });
    }
}
