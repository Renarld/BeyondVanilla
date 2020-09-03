package net.renarld.beyondvanilla.registry;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;
import net.renarld.beyondvanilla.block.blockentity.ShulkerTapeBoxBlockEntity;

public class EntityRegistration {
    public static BlockEntityType<ShulkerTapeBoxBlockEntity> SHULKER_TAPE_BOX_BLOCK_ENTITY = BlockEntityType.Builder.create(ShulkerTapeBoxBlockEntity::new, BlockRegistration.SHULKER_TAPE_BOX_BLOCK).build(null);

    public EntityRegistration() {
        Registry.register(Registry.BLOCK_ENTITY_TYPE, "beyondvanilla:shulker_tape_box_block_entity", SHULKER_TAPE_BOX_BLOCK_ENTITY);
    }
}
