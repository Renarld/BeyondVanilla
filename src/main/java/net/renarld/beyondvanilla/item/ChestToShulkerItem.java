package net.renarld.beyondvanilla.item;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.block.enums.ChestType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ChestToShulkerItem extends Item {

    public ChestToShulkerItem(Settings settings) {
        super(settings);
    }

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        System.out.println(stack);
        System.out.println(world);
        System.out.println(player);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        PlayerEntity playerEntity = context.getPlayer();

        if (!world.isClient && playerEntity != null) {
            BlockState blockState = world.getBlockState(blockPos);

            if (blockState.getBlock() instanceof ChestBlock) {
                if (blockState.getProperties().contains(ChestBlock.CHEST_TYPE) && blockState.get(ChestBlock.CHEST_TYPE) != ChestType.SINGLE) {
                    blockState = blockState.with(ChestBlock.CHEST_TYPE, ChestType.SINGLE);
                }
            }

            BlockEntity blockEntity = world.getBlockEntity(blockPos);

            if (blockEntity instanceof ChestBlockEntity) {
                CompoundTag compoundTag = blockEntity.toTag(new CompoundTag());

                world.removeBlockEntity(blockPos);
                world.setBlockState(blockPos, Blocks.SHULKER_BOX.getDefaultState());

                BlockEntity worldBlockEntity = world.getBlockEntity(blockPos);

                if (worldBlockEntity instanceof ShulkerBoxBlockEntity) {
                    ShulkerBoxBlockEntity shulkerBoxBlockEntity = (ShulkerBoxBlockEntity) worldBlockEntity;
                    shulkerBoxBlockEntity.fromTag(blockState, compoundTag);
                    shulkerBoxBlockEntity.markDirty();

                    if (!playerEntity.isCreative()) {
                        context.getStack().decrement(1);
                    }
                }
            }
        }

        return ActionResult.success(world.isClient);
    }

}
