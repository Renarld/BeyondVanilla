package net.renarld.beyondvanilla.init;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.renarld.beyondvanilla.mobentities.LootSlimeEntity;
import net.renarld.beyondvanilla.registry.EntityRegistration;

public class MobEntityInit {

    public MobEntityInit() {
        FabricDefaultAttributeRegistry.register(EntityRegistration.LOOT_SLIME_ENTITY, MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_ATTACK_DAMAGE));
    }

}
