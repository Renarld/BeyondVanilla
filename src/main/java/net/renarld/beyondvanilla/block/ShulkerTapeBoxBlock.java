package net.renarld.beyondvanilla.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.block.enums.ChestType;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.text.LiteralText;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.renarld.beyondvanilla.block.blockentity.ShulkerTapeBoxBlockEntity;
import net.renarld.beyondvanilla.registry.ItemRegistration;

import javax.annotation.Nullable;
import java.util.Iterator;
import java.util.List;

import static net.minecraft.block.ChestBlock.CHEST_TYPE;
import static net.minecraft.block.ChestBlock.getFacing;

public class ShulkerTapeBoxBlock extends Block implements BlockEntityProvider {

    public ShulkerTapeBoxBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockView blockView) {
        return new ShulkerTapeBoxBlockEntity();
    }

    @Override
    @Environment(EnvType.CLIENT)
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(ItemRegistration.SHULKER_TAPE_BOX_ITEM);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        if (placer instanceof PlayerEntity) {
            ShulkerTapeBoxBlockEntity shulkerTapeBoxBlockEntity = (ShulkerTapeBoxBlockEntity) world.getBlockEntity(pos);

            if (shulkerTapeBoxBlockEntity != null) {
                shulkerTapeBoxBlockEntity.setDataFromItemStack(itemStack);
            }
        }
        super.onPlaced(world, pos, state, placer, itemStack);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof ShulkerTapeBoxBlockEntity) {
            ShulkerTapeBoxBlockEntity shulkerTapeBoxBlockEntity = (ShulkerTapeBoxBlockEntity) blockEntity;
            if (!world.isClient() && !shulkerTapeBoxBlockEntity.isEmpty()) {
                dropStack(world, pos, shulkerTapeBoxBlockEntity.createShulkerTapeBox());
            }
        }
        super.onBreak(world, pos, state, player);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.SUCCESS;
        } else if (player.isSpectator()) {
            return ActionResult.CONSUME;
        } else {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof ShulkerTapeBoxBlockEntity) {
                ShulkerTapeBoxBlockEntity shulkerTapeBoxBlockEntity = (ShulkerTapeBoxBlockEntity) blockEntity;

                BlockState blockState = shulkerTapeBoxBlockEntity.getBlockState();
                CompoundTag compoundTag = shulkerTapeBoxBlockEntity.getCompoundTag();

                if (blockState != null && compoundTag != null) {
                    compoundTag.putInt("x", pos.getX());
                    compoundTag.putInt("y", pos.getY());
                    compoundTag.putInt("z", pos.getZ());

                    DirectionProperty FACING = Properties.FACING;
                    DirectionProperty HORIZONTAL_FACING = Properties.HORIZONTAL_FACING;
                    Direction direction = player.getHorizontalFacing().getOpposite();

                    if (blockState.getProperties().contains(HORIZONTAL_FACING)) {
                        blockState = blockState.with(HORIZONTAL_FACING, direction);

                        if (blockState.getBlock() == Blocks.CHEST) {
                            BlockState neighborChest = world.getBlockState(pos.offset(direction.rotateYClockwise()));

                            if (neighborChest.isOf(Blocks.CHEST) && direction.getAxis().isHorizontal()) {
                                if (neighborChest.get(CHEST_TYPE) == ChestType.SINGLE && neighborChest.get(HORIZONTAL_FACING) == blockState.get(HORIZONTAL_FACING)) {
                                    world.setBlockState(pos.offset(direction.rotateYClockwise()), neighborChest.with(CHEST_TYPE, ChestType.RIGHT));
                                    blockState = blockState.with(CHEST_TYPE, ChestType.LEFT);
                                }
                            }

                            neighborChest = world.getBlockState(pos.offset(direction.rotateYCounterclockwise()));
                            if (neighborChest.isOf(Blocks.CHEST) && direction.getAxis().isHorizontal()) {
                                if (neighborChest.get(CHEST_TYPE) == ChestType.SINGLE && neighborChest.get(HORIZONTAL_FACING) == blockState.get(HORIZONTAL_FACING)) {
                                    world.setBlockState(pos.offset(direction.rotateYCounterclockwise()), neighborChest.with(CHEST_TYPE, ChestType.LEFT));
                                    blockState = blockState.with(CHEST_TYPE, ChestType.RIGHT);
                                }
                            }
                        }
                    } else if (blockState.getProperties().contains(FACING)) {
                        blockState = blockState.with(FACING, direction);
                    }

                    world.removeBlockEntity(pos);
                    world.setBlockState(pos, blockState);

                    LootableContainerBlockEntity lootableContainerBlockEntity = (LootableContainerBlockEntity) world.getBlockEntity(pos);

                    if (lootableContainerBlockEntity != null) {
                        lootableContainerBlockEntity.fromTag(blockState, compoundTag);
                        lootableContainerBlockEntity.markDirty();

                        dropStack(world, pos, new ItemStack(ItemRegistration.SHULKER_TAPE_BOX_ITEM));
                    } else {
                        return ActionResult.FAIL;
                    }
                } else {
                    return ActionResult.FAIL;
                }

                return ActionResult.CONSUME;
            } else {
                return ActionResult.PASS;
            }
        }
    }

    @Environment(EnvType.CLIENT)
    public void buildTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        super.buildTooltip(stack, world, tooltip, options);
        CompoundTag compoundTag = stack.getSubTag("BlockContent");
        if (compoundTag != null) {
            if (compoundTag.contains("Items", 9)) {
                DefaultedList<ItemStack> defaultedList = DefaultedList.ofSize(27, ItemStack.EMPTY);
                Inventories.fromTag(compoundTag, defaultedList);
                int i = 0;
                int j = 0;

                for (ItemStack itemStack : defaultedList) {
                    if (!itemStack.isEmpty()) {
                        ++j;
                        if (i <= 4) {
                            ++i;
                            MutableText mutableText = itemStack.getName().shallowCopy();
                            mutableText.append(" x").append(String.valueOf(itemStack.getCount()));
                            tooltip.add(mutableText);
                        }
                    }
                }

                if (j - i > 0) {
                    tooltip.add((new TranslatableText("container.shulkerBox.more", j - i)).formatted(Formatting.ITALIC));
                }
            }
        }

    }
}
