package net.renarld.beyondvanilla.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.feature.SlimeOverlayFeatureRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.item.Items;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.renarld.beyondvanilla.mobentities.LootSlimeEntity;
import net.renarld.beyondvanilla.registry.ItemRegistration;

@Environment(EnvType.CLIENT)
public class LootSlimeEntityRenderer extends MobEntityRenderer<LootSlimeEntity, LootSlimeEntityModel<LootSlimeEntity>> {

    public LootSlimeEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new LootSlimeEntityModel<>(16), 0.25F);
        this.addFeature(new LootSlimeOverlayFeatureRenderer<>(this));
    }

    @Override
    public void render(LootSlimeEntity lootSlimeEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        this.shadowRadius = 0.25F * (float)lootSlimeEntity.getSize();
        super.render(lootSlimeEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    protected void scale(LootSlimeEntity lootSlimeEntity, MatrixStack matrixStack, float f) {
        matrixStack.scale(0.999F, 0.999F, 0.999F);
        matrixStack.translate(0.0D, 0.0D, 0.0D);
        float h = (float)lootSlimeEntity.getSize();
        float i = MathHelper.lerp(f, lootSlimeEntity.lastStretch, lootSlimeEntity.stretch) / (h * 0.5F + 1.0F);
        float j = 1.0F / (i + 1.0F);
        matrixStack.scale(j * h, 1.0F / j * h, j * h);
    }

    public Identifier getTexture(LootSlimeEntity lootSlimeEntity) {
        if (lootSlimeEntity.getItemStack() == Items.DIAMOND) {
            return new Identifier("beyondvanilla", "textures/entity/slime/loot_slime_diamond.png");
        } else if (lootSlimeEntity.getItemStack() == Items.EMERALD) {
            return new Identifier("beyondvanilla", "textures/entity/slime/loot_slime_emerald.png");
        } else if (lootSlimeEntity.getItemStack() == ItemRegistration.PERFECT_SWEET_BERRIES) {
            return new Identifier("beyondvanilla", "textures/entity/slime/loot_slime_sweet_berries.png");
        } else if (lootSlimeEntity.getItemStack() == Items.EXPERIENCE_BOTTLE) {
            return new Identifier("beyondvanilla", "textures/entity/slime/loot_slime_exp_bottle.png");
        } else if (ItemTags.CREEPER_DROP_MUSIC_DISCS.contains(lootSlimeEntity.getItemStack())) {
            return new Identifier("beyondvanilla", "textures/entity/slime/loot_slime_music_disc.png");
        } else if (lootSlimeEntity.getItemStack() == Items.ENDER_PEARL) {
            return new Identifier("beyondvanilla", "textures/entity/slime/loot_slime_ender_pearl.png");
        } else {
            return new Identifier("beyondvanilla", "textures/entity/slime/loot_slime.png");
        }
    }
}
