package net.renarld.beyondvanilla.item;

import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.mob.ElderGuardianEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.text.LiteralText;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.renarld.beyondvanilla.config.Config;
import net.renarld.beyondvanilla.registry.ItemRegistration;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

public class ShulkerCapturePodItem extends Item {

    public ShulkerCapturePodItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (!user.world.isClient() && stack.getTag() == null) {
            if (!(entity instanceof PlayerEntity || entity instanceof EnderDragonEntity)) {
                String entityId = this.getEntityId(entity);
                if (entityId != null && !Config.getConfig().getBlacklist().contains(entityId)) {
                    CompoundTag entityTag = new CompoundTag();
                    entity.writeCustomDataToTag(entityTag);
                    entityTag.putString("id", entityId);

                    if (entity.hasCustomName() && entity.getCustomName() != null) {
                        entityTag.putString("Name", Text.Serializer.toJson(entity.getCustomName()));
                    }

                    ItemStack entityPod = new ItemStack(ItemRegistration.SHULKER_CAPTURE_POD);
                    entityPod.setTag(entityTag);

                    if (entity.hasCustomName() && entity.getCustomName() != null) {
                        entityPod.setCustomName(entity.getCustomName());
                    }

                    if (!user.isCreative()) {
                        stack.decrement(1);
                    }

                    entity.remove();
                    user.giveItemStack(entityPod);

                    return ActionResult.CONSUME;
                }
            }
            return ActionResult.PASS;
        }
        return ActionResult.PASS;
    }

    @Nullable
    private String getEntityId(LivingEntity entity) {
        EntityType<?> entityType = entity.getType();
        Identifier identifier = EntityType.getId(entityType);
        return entityType.isSaveable() && identifier != null ? identifier.toString() : null;
    }

    public EntityType<?> getEntityType(@Nullable CompoundTag tag) {
        if (tag != null && tag.contains("id", 8)) {
            return EntityType.get(tag.getString("id")).orElse(null);
        }
        return null;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        if (world.isClient) {
            return ActionResult.SUCCESS;
        } else {
            ItemStack itemStack = context.getStack();
            EntityType<?> entityType = this.getEntityType(itemStack.getTag());
            if (entityType != null) {

                BlockPos blockPos = context.getBlockPos();
                Direction direction = context.getSide();
                BlockState blockState = world.getBlockState(blockPos);

                BlockPos blockPosCS;
                if (blockState.getCollisionShape(world, blockPos).isEmpty()) {
                    blockPosCS = blockPos;
                } else {
                    blockPosCS = blockPos.offset(direction);
                }

                LivingEntity livingEntity = (LivingEntity) entityType.create(world, itemStack.getTag(), null, context.getPlayer(), blockPosCS, SpawnReason.SPAWNER, true, !Objects.equals(blockPos, blockPosCS) && direction == Direction.UP);

                if (livingEntity != null && itemStack.getTag() != null) {
                    livingEntity.readCustomDataFromTag(itemStack.getTag());
                    if (itemStack.getTag().contains("Name") && itemStack.getTag().getString("Name") != null) {
                        livingEntity.setCustomName(Text.Serializer.fromJson(itemStack.getTag().getString("Name")));
                    }
                }

                world.spawnEntity(livingEntity);
                itemStack.decrement(1);

                return ActionResult.CONSUME;
            }
            return ActionResult.PASS;
        }
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        if (itemStack.getTag() != null && itemStack.getTag().contains("id")) {
            MutableText mutableText = this.getEntityType(itemStack.getTag()).getName().shallowCopy();
            if (itemStack.getTag().contains("Age") && itemStack.getTag().getInt("Age") < 0) {
                MutableTextAppendFormatted(mutableText, new TranslatableText("tooltip.beyondvanilla.info.shulker_capture_pod.baby"));
            }

            if (this.getEntityType(itemStack.getTag()) == EntityType.SHEEP) {
                MutableTextAppendFormatted(mutableText, new TranslatableText(this.getColor(itemStack.getTag())));
            }
            tooltip.add(mutableText);
        }
    }

    private void MutableTextAppendFormatted(MutableText mutableText, Text text) {
        mutableText.append(" (");
        mutableText.append(text);
        mutableText.append(")");
    }

    private String getColor(CompoundTag tag) {
        if (tag.contains("Color")) {
            DyeColor color = DyeColor.byId(tag.getByte("Color"));
            switch (color) {
                case WHITE:
                    return "color.minecraft.white";
                case ORANGE:
                    return "color.minecraft.orange";
                case MAGENTA:
                    return "color.minecraft.magenta";
                case LIGHT_BLUE:
                    return "color.minecraft.light_blue";
                case YELLOW:
                    return "color.minecraft.yellow";
                case LIME:
                    return "color.minecraft.lime";
                case PINK:
                    return "color.minecraft.pink";
                case GRAY:
                    return "color.minecraft.gray";
                case LIGHT_GRAY:
                    return "color.minecraft.light_gray";
                case CYAN:
                    return "color.minecraft.cyan";
                case PURPLE:
                    return "color.minecraft.purple";
                case BLUE:
                    return "color.minecraft.blue";
                case BROWN:
                    return "color.minecraft.brown";
                case GREEN:
                    return "color.minecraft.green";
                case RED:
                    return "color.minecraft.red";
                case BLACK:
                    return "color.minecraft.black";
                default:
                    return "tooltip.beyondvanilla.info.shulker_capture_pod.error";
            }
        }
        return "tooltip.beyondvanilla.info.shulker_capture_pod.error";
    }
}
