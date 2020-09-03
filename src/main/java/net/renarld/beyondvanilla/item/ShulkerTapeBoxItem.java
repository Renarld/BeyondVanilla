package net.renarld.beyondvanilla.item;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.enums.ChestType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.renarld.beyondvanilla.block.blockentity.ShulkerTapeBoxBlockEntity;
import net.renarld.beyondvanilla.registry.BlockRegistration;

public class ShulkerTapeBoxItem extends Item {

    public ShulkerTapeBoxItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        PlayerEntity playerEntity = context.getPlayer();

        if (!world.isClient && playerEntity != null) {
            BlockEntity blockEntity = world.getBlockEntity(blockPos);

            if (blockEntity instanceof ChestBlockEntity) {
                BlockState blockState = world.getBlockState(blockPos).getBlock().getDefaultState();
                CompoundTag compoundTag = blockEntity.toTag(new CompoundTag());

                world.removeBlockEntity(blockPos);
                world.setBlockState(blockPos, BlockRegistration.SHULKER_TAPE_BOX_BLOCK.getDefaultState());

                BlockEntity worldBlockEntity = world.getBlockEntity(blockPos);

                if (worldBlockEntity instanceof ShulkerTapeBoxBlockEntity) {
                    ShulkerTapeBoxBlockEntity shulkerTapeBoxBlockEntity = (ShulkerTapeBoxBlockEntity) worldBlockEntity;
                    shulkerTapeBoxBlockEntity.storeData(blockState, compoundTag);
                    shulkerTapeBoxBlockEntity.markDirty();

                    if (!playerEntity.isCreative()) {
                        context.getStack().decrement(1);
                    }
                }
            }
        }

        return ActionResult.success(world.isClient);
    }
}
