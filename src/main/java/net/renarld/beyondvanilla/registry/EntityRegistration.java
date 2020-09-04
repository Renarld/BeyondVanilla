package net.renarld.beyondvanilla.registry;

import com.mojang.datafixers.types.Type;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.datafixer.TypeReferences;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Util;
import net.minecraft.util.registry.Registry;
import net.renarld.beyondvanilla.block.blockentity.ShulkerTapeBoxBlockEntity;
import net.renarld.beyondvanilla.mobentities.LootSlimeEntity;

public class EntityRegistration {
    public static final BlockEntityType<ShulkerTapeBoxBlockEntity> SHULKER_TAPE_BOX_BLOCK_ENTITY;
    public static final EntityType<LootSlimeEntity> LOOT_SLIME_ENTITY;

    static {
        // BLOCK ENTITIES
        SHULKER_TAPE_BOX_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "beyondvanilla:shulker_tape_box_block_entity", BlockEntityType.Builder.create(ShulkerTapeBoxBlockEntity::new, BlockRegistration.SHULKER_TAPE_BOX_BLOCK).build(null));

        // MOB ENTITIES
        LOOT_SLIME_ENTITY = Registry.register(Registry.ENTITY_TYPE, "beyondvanilla:loot_slime", EntityType.Builder.create(LootSlimeEntity::new, SpawnGroup.MONSTER).setDimensions(2.04F, 2.04F).maxTrackingRange(10).build("beyondvanilla:loot_slime"));
    }
}
