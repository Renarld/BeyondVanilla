package net.renarld.beyondvanilla.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallRedstoneTorchBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import javax.annotation.Nullable;
import java.util.Random;

public class WallSoulRedstoneTorchBlock extends WallRedstoneTorchBlock {

    public WallSoulRedstoneTorchBlock(Settings settings) {
        super(settings);
    }

    @Environment(EnvType.CLIENT)
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (state.get(LIT)) {
            Direction direction = (state.get(FACING)).getOpposite();
            double d = 0.27D;
            double e = (double)pos.getX() + 0.5D + (random.nextDouble() - 0.5D) * 0.2D + 0.27D * (double)direction.getOffsetX();
            double f = (double)pos.getY() + 0.7D + (random.nextDouble() - 0.5D) * 0.2D + 0.22D;
            double g = (double)pos.getZ() + 0.5D + (random.nextDouble() - 0.5D) * 0.2D + 0.27D * (double)direction.getOffsetZ();
            world.addParticle(new DustParticleEffect(0.2f, 0.9f, 0.9f, 1.0f), e, f, g, 0.0D, 0.0D, 0.0D);
        }
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = Blocks.WALL_TORCH.getPlacementState(ctx);
        return blockState == null ? null : this.getDefaultState().with(FACING, blockState.get(FACING));
    }
}
