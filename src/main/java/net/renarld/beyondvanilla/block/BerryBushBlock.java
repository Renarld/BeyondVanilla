package net.renarld.beyondvanilla.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.renarld.beyondvanilla.registry.ItemRegistration;
import java.util.Set;

public class BerryBushBlock extends SweetBerryBushBlock {
	private Set<Block> plantable_blocks;

	public BerryBushBlock(Settings settings, Set<Block> plantable_blocks) {
		super(settings);
		this.plantable_blocks = plantable_blocks;
	}

	@Override
	protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
		return this.plantable_blocks.contains(floor.getBlock());
	}

	@Override
	@Environment(EnvType.CLIENT)
	public ItemStack getPickStack(BlockView blockView, BlockPos blockPos, BlockState blockState) {
		return new ItemStack(this);
	}

	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		int age = state.get(AGE);
		boolean max_age = age == 3;

		if (!max_age && player.getStackInHand(hand).getItem() == Items.BONE_MEAL) {
			return ActionResult.PASS;
		} else if (age > 1) {
			int golden_sweet_berry = world.random.nextInt(300);

			if (golden_sweet_berry > 298) {
				dropStack(world, pos, new ItemStack(ItemRegistration.PERFECT_SWEET_BERRIES, 1));
			} else {
				int drop_amount = 1 + world.random.nextInt(2);
				dropStack(world, pos, new ItemStack(this, drop_amount + (max_age ? 1 : 0)));
			}

			world.playSound(null, pos, SoundEvents.ITEM_SWEET_BERRIES_PICK_FROM_BUSH, SoundCategory.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
			world.setBlockState(pos, state.with(AGE, 1), 2);
			return ActionResult.success(world.isClient);
		} else {
			return ActionResult.PASS;
		}
	}
}
