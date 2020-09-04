package net.renarld.beyondvanilla;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.render.RenderLayer;
import net.renarld.beyondvanilla.registry.BlockRegistration;
import net.renarld.beyondvanilla.registry.EntityRegistration;
import net.renarld.beyondvanilla.renderer.LootSlimeEntityRenderer;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // BERRIES
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), Blocks.SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.POTTED_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GREEN_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.GREEN_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_GREEN_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.POTTED_GREEN_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PURPLE_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.PURPLE_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_PURPLE_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.POTTED_PURPLE_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CYAN_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.CYAN_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_CYAN_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.POTTED_CYAN_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.LIGHT_GRAY_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.LIGHT_GRAY_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_LIGHT_GRAY_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.POTTED_LIGHT_GRAY_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GRAY_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.GRAY_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_GRAY_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.POTTED_GRAY_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PINK_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.PINK_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_PINK_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.POTTED_PINK_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.LIME_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.LIME_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_LIME_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.POTTED_LIME_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.YELLOW_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.YELLOW_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_YELLOW_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.POTTED_YELLOW_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.LIGHT_BLUE_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.LIGHT_BLUE_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_LIGHT_BLUE_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.POTTED_LIGHT_BLUE_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MAGENTA_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.MAGENTA_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_MAGENTA_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.POTTED_MAGENTA_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ORANGE_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.ORANGE_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_ORANGE_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.POTTED_ORANGE_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BLUE_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.BLUE_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_BLUE_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.POTTED_BLUE_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BROWN_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.BROWN_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_BROWN_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.POTTED_BROWN_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BLACK_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.BLACK_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_BLACK_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.POTTED_BLACK_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WHITE_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.WHITE_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_WHITE_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.POTTED_WHITE_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PERFECT_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.PERFECT_SWEET_BERRY_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_PERFECT_SWEET_BERRY_BUSH, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.POTTED_PERFECT_SWEET_BERRY_BUSH);

        // LIGHT BLOCKS
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SOUL_REDSTONE_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WALL_SOUL_REDSTONE_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.IRON_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GOLD_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.IRON_SOUL_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GOLD_SOUL_LANTERN, RenderLayer.getCutout());

        // POTTED PLANTS
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_WHEAT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_PUMPKIN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_MELON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_LILAC, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_ROSE_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_PEONY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_SUNFLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_GRASS, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.POTTED_GRASS);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_TALL_GRASS, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.POTTED_TALL_GRASS);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_LARGE_FERN, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D), BlockRegistration.POTTED_LARGE_FERN);
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_NETHER_SPROUTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_SEA_PICKLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_SUGAR_CANE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_CARROT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_POTATO, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_BEETROOT, RenderLayer.getCutout());

        // DECORATION
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GOLD_CHAIN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.IRON_FENCE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GOLD_FENCE, RenderLayer.getCutout());

        // MOB ENTITIES
        EntityRendererRegistry.INSTANCE.register(EntityRegistration.LOOT_SLIME_ENTITY, ((entityRenderDispatcher, context) -> new LootSlimeEntityRenderer(entityRenderDispatcher)));
    }
}