package net.renarld.beyondvanilla.mobentities;

import net.minecraft.entity.*;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.*;
import net.renarld.beyondvanilla.config.Config;
import net.renarld.beyondvanilla.registry.ItemRegistration;
import javax.annotation.Nullable;
import java.util.Random;

public class LootSlimeEntity extends SlimeEntity {

    public LootSlimeEntity(EntityType<? extends LootSlimeEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    @Nullable
    public EntityData initialize(WorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData, @Nullable CompoundTag entityTag) {
        this.setSize(2, true);
        this.initEquipment(difficulty);
        this.handDropChances[EquipmentSlot.MAINHAND.getEntitySlotId()] = 1.0F;
        return entityData;
    }

    @Override
    public void remove() {
        this.removed = true;
    }

    @Override
    protected void initEquipment(LocalDifficulty difficulty) {
        float drop_chance = this.random.nextFloat();
        float drop_amount_chance = this.random.nextFloat();

        ItemStack drop_item;
        int drop_amount;

        if (drop_amount_chance < 0.05F) {
            drop_amount = 4;
        } else if (drop_amount_chance < 0.1F) {
            drop_amount = 3;
        } else if (drop_amount_chance < 0.2F) {
            drop_amount = 2;
        } else {
            drop_amount = 1;
        }

        int saved_drop_amount;

        if (drop_chance < 0.16F && Config.getConfig().getDrop(Registry.ITEM.getId(Items.DIAMOND).toString())) {
            saved_drop_amount = Config.getConfig().getDroprate(Registry.ITEM.getId(Items.DIAMOND).toString());
            drop_item = new ItemStack(Items.DIAMOND, drop_amount);

            if (saved_drop_amount < drop_amount) {
                drop_item = new ItemStack(Items.DIAMOND, saved_drop_amount);
            }
        } else if (drop_chance < 0.32F && Config.getConfig().getDrop(Registry.ITEM.getId(Items.EMERALD).toString())) {
            saved_drop_amount = Config.getConfig().getDroprate(Registry.ITEM.getId(Items.EMERALD).toString());
            drop_item = new ItemStack(Items.EMERALD, drop_amount);

            if (saved_drop_amount < drop_amount) {
                drop_item = new ItemStack(Items.EMERALD, saved_drop_amount);
            }
        } else if (drop_chance < 0.48F && Config.getConfig().getDrop(Registry.ITEM.getId(ItemRegistration.PERFECT_SWEET_BERRIES).toString())) {
            saved_drop_amount = Config.getConfig().getDroprate(Registry.ITEM.getId(ItemRegistration.PERFECT_SWEET_BERRIES).toString());
            drop_item = new ItemStack(ItemRegistration.PERFECT_SWEET_BERRIES, drop_amount);

            if (saved_drop_amount < drop_amount) {
                drop_item = new ItemStack(ItemRegistration.PERFECT_SWEET_BERRIES, saved_drop_amount);
            }
        } else if (drop_chance < 0.64F && Config.getConfig().getDrop(Registry.ITEM.getId(Items.EXPERIENCE_BOTTLE).toString())) {
            saved_drop_amount = Config.getConfig().getDroprate(Registry.ITEM.getId(Items.EXPERIENCE_BOTTLE).toString());
            drop_item = new ItemStack(Items.EXPERIENCE_BOTTLE, drop_amount);

            if (saved_drop_amount < drop_amount) {
                drop_item = new ItemStack(Items.EXPERIENCE_BOTTLE, saved_drop_amount);
            }
        } else if (drop_chance < 0.80F && Config.getConfig().getDrop(Registry.ITEM.getId(Items.MUSIC_DISC_11).toString())) {
            drop_item = new ItemStack(ItemTags.CREEPER_DROP_MUSIC_DISCS.getRandom(new Random()));
        } else if (drop_chance < 1.0F && Config.getConfig().getDrop(Registry.ITEM.getId(Items.ENDER_PEARL).toString())) {
            saved_drop_amount = Config.getConfig().getDroprate(Registry.ITEM.getId(Items.ENDER_PEARL).toString());
            drop_item = new ItemStack(Items.ENDER_PEARL, drop_amount);

            if (saved_drop_amount < drop_amount) {
                drop_item = new ItemStack(Items.ENDER_PEARL, saved_drop_amount);
            }
        } else {
            drop_item = new ItemStack(Items.SLIME_BALL, 2);
        }

        this.equipStack(EquipmentSlot.MAINHAND, drop_item);
        super.initEquipment(difficulty);
    }

    @Override
    public boolean canSpawn(WorldAccess world, SpawnReason spawnReason) {
        if (world.getDifficulty() != Difficulty.PEACEFUL) {
            if (!(world instanceof ServerWorldAccess)) {
                return false;
            }

            BlockPos pos = getBlockPos();

            if (random.nextInt(10) == 0 && pos.getY() < 40) {
                return canMobSpawn(this.getType(), world, spawnReason, pos, random);
            }
        }
        return false;
    }

    public Item getItemStack() {
        return getEquippedStack(EquipmentSlot.MAINHAND).getItem();
    }
}
