package net.renarld.beyondvanilla.block.blockentity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.util.math.Direction;
import net.renarld.beyondvanilla.registry.BlockRegistration;
import net.renarld.beyondvanilla.registry.EntityRegistration;

public class ShulkerTapeBoxBlockEntity extends BlockEntity {
    private BlockState blockState;
    private CompoundTag compoundTag;

    public ShulkerTapeBoxBlockEntity() {
        super(EntityRegistration.SHULKER_TAPE_BOX_BLOCK_ENTITY);
    }

    public void storeData(BlockState blockState, CompoundTag compoundTag) {
        this.blockState = blockState;
        this.compoundTag = compoundTag;
    }

    public void setDataFromItemStack(ItemStack itemStack) {
        CompoundTag compoundTag = itemStack.getTag();

        if (compoundTag != null) {
            this.blockState = NbtHelper.toBlockState(compoundTag.getCompound("BlockState"));
            this.compoundTag = compoundTag.getCompound("BlockContent");
        }
    }

    public BlockState getBlockState() {
        return this.blockState;
    }

    public CompoundTag getCompoundTag() {
        return this.compoundTag;
    }

    @Override
    public CompoundTag toTag(CompoundTag tag) {
        super.toTag(tag);
        writeIdentifyingData(tag);
        return tag;
    }

    private void writeIdentifyingData(CompoundTag tag) {
        if (this.blockState != null) {
            tag.put("BlockState", NbtHelper.fromBlockState(this.blockState).copy());
            tag.put("BlockContent", this.compoundTag.copy());
        }
    }

    @Override
    public void fromTag(BlockState state, CompoundTag tag) {
        super.fromTag(state, tag);
        readIdentifyingData(tag);
    }

    private void readIdentifyingData(CompoundTag tag) {
        this.blockState = NbtHelper.toBlockState(tag.getCompound("BlockState").copy());
        this.compoundTag = tag.getCompound("BlockContent").copy();
    }

    public ItemStack createShulkerTapeBox() {
        ItemStack itemStack = new ItemStack(BlockRegistration.SHULKER_TAPE_BOX_BLOCK);

        CompoundTag compoundTag = new CompoundTag();
        this.toTag(compoundTag);

        itemStack.setTag(compoundTag);
        return itemStack;
    }

    public boolean isEmpty() {
        return this.blockState == null;
    }
}
