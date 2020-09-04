package net.renarld.beyondvanilla.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.FoxEntityModel;
import net.minecraft.client.render.entity.model.SlimeEntityModel;
import net.minecraft.client.render.model.json.ModelTransformation.Mode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.Vector3f;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.item.ItemStack;
import net.renarld.beyondvanilla.mobentities.LootSlimeEntity;

@Environment(EnvType.CLIENT)
public class LootSlimeHeldItemFeatureRenderer extends FeatureRenderer<LootSlimeEntity, LootSlimeEntityModel<LootSlimeEntity>> {

    public LootSlimeHeldItemFeatureRenderer(FeatureRendererContext<LootSlimeEntity, LootSlimeEntityModel<LootSlimeEntity>> featureRendererContext) {
        super(featureRendererContext);
    }

    public void render(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, LootSlimeEntity lootSlimeEntity, float f, float g, float h, float j, float k, float l) {
        matrixStack.push();
        matrixStack.translate(0.0F, 1.0F, 0.0F);
        matrixStack.multiply(Vector3f.POSITIVE_X.getDegreesQuaternion(180.0F));
        matrixStack.scale(0.5F, 0.5F, 0.5F);
        ItemStack itemStack = lootSlimeEntity.getEquippedStack(EquipmentSlot.MAINHAND);
        MinecraftClient.getInstance().getHeldItemRenderer().renderItem(lootSlimeEntity, itemStack, Mode.GROUND, false, matrixStack, vertexConsumerProvider, i);
        matrixStack.pop();
    }
}
