package net.renarld.beyondvanilla.registry;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.renarld.beyondvanilla.block.*;

import java.util.Set;
import java.util.function.ToIntFunction;

public class BlockRegistration {
    private static final Set<Block> plantable_blocks = ImmutableSet.of(Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.COARSE_DIRT, Blocks.PODZOL, Blocks.FARMLAND);

    // CONTAINERS
    public static final Block SHULKER_TAPE_BOX_BLOCK;

    // LIGHT BLOCKS
    public static final Block SOUL_REDSTONE_TORCH;
    public static final Block WALL_SOUL_REDSTONE_TORCH;
    public static final Block SOUL_REDSTONE_LAMP;
    public static final Block IRON_LANTERN;
    public static final Block IRON_SOUL_LANTERN;
    public static final Block GOLD_LANTERN;
    public static final Block GOLD_SOUL_LANTERN;

    // POTTED PLANTS
    public static final Block POTTED_WHEAT;
    public static final Block POTTED_PUMPKIN;
    public static final Block POTTED_MELON;
    public static final Block POTTED_LILAC;
    public static final Block POTTED_ROSE_BUSH;
    public static final Block POTTED_PEONY;
    public static final Block POTTED_SUNFLOWER;
    public static final Block POTTED_GRASS;
    public static final Block POTTED_TALL_GRASS;
    public static final Block POTTED_LARGE_FERN;
    public static final Block POTTED_NETHER_SPROUTS;
    public static final Block POTTED_SEA_PICKLE;
    public static final Block POTTED_SUGAR_CANE;
    public static final Block POTTED_CARROT;
    public static final Block POTTED_POTATO;
    public static final Block POTTED_BEETROOT;

    // DECORATION
    public static final Block GOLD_CHAIN;
    public static final Block IRON_FENCE;
    public static final Block IRON_FENCE_GATE;
    public static final Block GOLD_FENCE;
    public static final Block GOLD_FENCE_GATE;

    // BERRIES
    public static final Block POTTED_SWEET_BERRY_BUSH;
    public static final BerryBushBlock GREEN_SWEET_BERRY_BUSH;
    public static final Block POTTED_GREEN_SWEET_BERRY_BUSH;
    public static final BerryBushBlock PURPLE_SWEET_BERRY_BUSH;
    public static final Block POTTED_PURPLE_SWEET_BERRY_BUSH;
    public static final BerryBushBlock CYAN_SWEET_BERRY_BUSH;
    public static final Block POTTED_CYAN_SWEET_BERRY_BUSH;
    public static final BerryBushBlock LIGHT_GRAY_SWEET_BERRY_BUSH;
    public static final Block POTTED_LIGHT_GRAY_SWEET_BERRY_BUSH;
    public static final BerryBushBlock GRAY_SWEET_BERRY_BUSH;
    public static final Block POTTED_GRAY_SWEET_BERRY_BUSH;
    public static final BerryBushBlock PINK_SWEET_BERRY_BUSH;
    public static final Block POTTED_PINK_SWEET_BERRY_BUSH;
    public static final BerryBushBlock LIME_SWEET_BERRY_BUSH;
    public static final Block POTTED_LIME_SWEET_BERRY_BUSH;
    public static final BerryBushBlock YELLOW_SWEET_BERRY_BUSH;
    public static final Block POTTED_YELLOW_SWEET_BERRY_BUSH;
    public static final BerryBushBlock LIGHT_BLUE_SWEET_BERRY_BUSH;
    public static final Block POTTED_LIGHT_BLUE_SWEET_BERRY_BUSH;
    public static final BerryBushBlock MAGENTA_SWEET_BERRY_BUSH;
    public static final Block POTTED_MAGENTA_SWEET_BERRY_BUSH;
    public static final BerryBushBlock ORANGE_SWEET_BERRY_BUSH;
    public static final Block POTTED_ORANGE_SWEET_BERRY_BUSH;
    public static final BerryBushBlock BLUE_SWEET_BERRY_BUSH;
    public static final Block POTTED_BLUE_SWEET_BERRY_BUSH;
    public static final BerryBushBlock BROWN_SWEET_BERRY_BUSH;
    public static final Block POTTED_BROWN_SWEET_BERRY_BUSH;
    public static final BerryBushBlock BLACK_SWEET_BERRY_BUSH;
    public static final Block POTTED_BLACK_SWEET_BERRY_BUSH;
    public static final BerryBushBlock WHITE_SWEET_BERRY_BUSH;
    public static final Block POTTED_WHITE_SWEET_BERRY_BUSH;
    public static final BerryBushBlock PERFECT_SWEET_BERRY_BUSH;
    public static final Block POTTED_PERFECT_SWEET_BERRY_BUSH;

    private static ToIntFunction<BlockState> createLightLevelFromBlockState(int litLevel) {
        return (blockState) -> (Boolean)blockState.get(Properties.LIT) ? litLevel : 0;
    }

    private static Block register(Identifier id, Block block) {
        return Registry.register(Registry.BLOCK, id, block);
    }

    static {
        // CONTAINERS
        SHULKER_TAPE_BOX_BLOCK = register(new Identifier("beyondvanilla", "shulker_tape_box_block"), new ShulkerTapeBoxBlock(FabricBlockSettings.copyOf(Blocks.SHULKER_BOX)));

        // LIGHT BLOCKS
        SOUL_REDSTONE_TORCH = register(new Identifier("beyondvanilla", "soul_redstone_torch"), new SoulRedstoneTorchBlock(FabricBlockSettings.of(Material.SUPPORTED).noCollision().breakInstantly().lightLevel(createLightLevelFromBlockState(7)).sounds(BlockSoundGroup.WOOD)));
        SOUL_REDSTONE_LAMP = register(new Identifier("beyondvanilla", "soul_redstone_lamp"), new RedstoneLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).lightLevel(createLightLevelFromBlockState(7)).strength(0.3F).sounds(BlockSoundGroup.GLASS)));
        WALL_SOUL_REDSTONE_TORCH = register(new Identifier("beyondvanilla", "soul_redstone_wall_torch"), new WallSoulRedstoneTorchBlock(FabricBlockSettings.of(Material.SUPPORTED).noCollision().breakInstantly().lightLevel(createLightLevelFromBlockState(7)).sounds(BlockSoundGroup.WOOD).dropsLike(SOUL_REDSTONE_TORCH)));
        IRON_LANTERN = register(new Identifier("beyondvanilla", "iron_lantern"), new ToggableLanternBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).lightLevel(createLightLevelFromBlockState(15))));
        IRON_SOUL_LANTERN = register(new Identifier("beyondvanilla", "iron_soul_lantern"), new ToggableLanternBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).lightLevel(createLightLevelFromBlockState(10))));
        GOLD_LANTERN = register(new Identifier("beyondvanilla", "gold_lantern"), new ToggableLanternBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).lightLevel(createLightLevelFromBlockState(15))));
        GOLD_SOUL_LANTERN = register(new Identifier("beyondvanilla", "gold_soul_lantern"), new ToggableLanternBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).lightLevel(createLightLevelFromBlockState(10))));

        // POTTED PLANTS
        POTTED_WHEAT = register(new Identifier("beyondvanilla", "potted_wheat"), new FlowerPotBlock(Blocks.WHEAT, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        POTTED_PUMPKIN = register(new Identifier("beyondvanilla", "potted_pumpkin"), new FlowerPotBlock(Blocks.PUMPKIN_STEM, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        POTTED_MELON = register(new Identifier("beyondvanilla", "potted_melon"), new FlowerPotBlock(Blocks.MELON_STEM, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        POTTED_LILAC = register(new Identifier("beyondvanilla", "potted_lilac"), new FlowerPotBlock(Blocks.LILAC, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        POTTED_ROSE_BUSH = register(new Identifier("beyondvanilla", "potted_rose_bush"), new FlowerPotBlock(Blocks.ROSE_BUSH, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        POTTED_PEONY = register(new Identifier("beyondvanilla", "potted_peony"), new FlowerPotBlock(Blocks.PEONY, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        POTTED_SUNFLOWER = register(new Identifier("beyondvanilla", "potted_sunflower"), new FlowerPotBlock(Blocks.SUNFLOWER, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        POTTED_GRASS = register(new Identifier("beyondvanilla", "potted_grass"), new FlowerPotBlock(Blocks.GRASS, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        POTTED_TALL_GRASS = register(new Identifier("beyondvanilla", "potted_tall_grass"), new FlowerPotBlock(Blocks.TALL_GRASS, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        POTTED_LARGE_FERN = register(new Identifier("beyondvanilla", "potted_large_fern"), new FlowerPotBlock(Blocks.LARGE_FERN, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        POTTED_NETHER_SPROUTS = register(new Identifier("beyondvanilla", "potted_nether_sprouts"), new FlowerPotBlock(Blocks.NETHER_SPROUTS, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        POTTED_SEA_PICKLE = register(new Identifier("beyondvanilla", "potted_sea_pickle"), new FlowerPotBlock(Blocks.SEA_PICKLE, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque().lightLevel(6)));
        POTTED_SUGAR_CANE = register(new Identifier("beyondvanilla", "potted_sugar_cane"), new FlowerPotBlock(Blocks.SUGAR_CANE, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        POTTED_CARROT = register(new Identifier("beyondvanilla", "potted_carrot"), new FlowerPotBlock(Blocks.CARROTS, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        POTTED_POTATO = register(new Identifier("beyondvanilla", "potted_potato"), new FlowerPotBlock(Blocks.POTATOES, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        POTTED_BEETROOT = register(new Identifier("beyondvanilla", "potted_beetroot"), new FlowerPotBlock(Blocks.BEETROOTS, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));

        // DECORATION
        GOLD_CHAIN = register(new Identifier("beyondvanilla", "gold_chain"), new ChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN)));
        IRON_FENCE = register(new Identifier("beyondvanilla", "iron_fence"), new CustomFenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
        IRON_FENCE_GATE = register(new Identifier("beyondvanilla", "iron_fence_gate"), new CustomFenceGateBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR)));
        GOLD_FENCE = register(new Identifier("beyondvanilla", "gold_fence"), new CustomFenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS)));
        GOLD_FENCE_GATE = register(new Identifier("beyondvanilla", "gold_fence_gate"), new CustomFenceGateBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR)));

        // BERRIES
        POTTED_SWEET_BERRY_BUSH = register(new Identifier("beyondvanilla", "potted_red_sweet_berry"), new FlowerPotBlock(Blocks.SWEET_BERRY_BUSH, AbstractBlock.Settings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        GREEN_SWEET_BERRY_BUSH = (BerryBushBlock) register(new Identifier("beyondvanilla", "green_sweet_berry_bush"), new BerryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), plantable_blocks));
        POTTED_GREEN_SWEET_BERRY_BUSH = register(new Identifier("beyondvanilla", "potted_green_sweet_berry"), new FlowerPotBlock(GREEN_SWEET_BERRY_BUSH, AbstractBlock.Settings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        PURPLE_SWEET_BERRY_BUSH = (BerryBushBlock) register(new Identifier("beyondvanilla", "purple_sweet_berry_bush"), new BerryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), plantable_blocks));
        POTTED_PURPLE_SWEET_BERRY_BUSH = register(new Identifier("beyondvanilla", "potted_purple_sweet_berry"), new FlowerPotBlock(PURPLE_SWEET_BERRY_BUSH, AbstractBlock.Settings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        CYAN_SWEET_BERRY_BUSH = (BerryBushBlock) register(new Identifier("beyondvanilla", "cyan_sweet_berry_bush"), new BerryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), plantable_blocks));
        POTTED_CYAN_SWEET_BERRY_BUSH = register(new Identifier("beyondvanilla", "potted_cyan_sweet_berry"), new FlowerPotBlock(CYAN_SWEET_BERRY_BUSH, AbstractBlock.Settings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        LIGHT_GRAY_SWEET_BERRY_BUSH = (BerryBushBlock) register(new Identifier("beyondvanilla", "light_gray_sweet_berry_bush"), new BerryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), plantable_blocks));
        POTTED_LIGHT_GRAY_SWEET_BERRY_BUSH = register(new Identifier("beyondvanilla", "potted_light_gray_sweet_berry"), new FlowerPotBlock(LIGHT_GRAY_SWEET_BERRY_BUSH, AbstractBlock.Settings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        GRAY_SWEET_BERRY_BUSH = (BerryBushBlock) register(new Identifier("beyondvanilla", "gray_sweet_berry_bush"), new BerryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), plantable_blocks));
        POTTED_GRAY_SWEET_BERRY_BUSH = register(new Identifier("beyondvanilla", "potted_gray_sweet_berry"), new FlowerPotBlock(GRAY_SWEET_BERRY_BUSH, AbstractBlock.Settings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        PINK_SWEET_BERRY_BUSH = (BerryBushBlock) register(new Identifier("beyondvanilla", "pink_sweet_berry_bush"), new BerryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), plantable_blocks));
        POTTED_PINK_SWEET_BERRY_BUSH = register(new Identifier("beyondvanilla", "potted_pink_sweet_berry"), new FlowerPotBlock(PINK_SWEET_BERRY_BUSH, AbstractBlock.Settings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        LIME_SWEET_BERRY_BUSH = (BerryBushBlock) register(new Identifier("beyondvanilla", "lime_sweet_berry_bush"), new BerryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), plantable_blocks));
        POTTED_LIME_SWEET_BERRY_BUSH = register(new Identifier("beyondvanilla", "potted_lime_sweet_berry"), new FlowerPotBlock(LIME_SWEET_BERRY_BUSH, AbstractBlock.Settings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        YELLOW_SWEET_BERRY_BUSH = (BerryBushBlock) register(new Identifier("beyondvanilla", "yellow_sweet_berry_bush"), new BerryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), plantable_blocks));
        POTTED_YELLOW_SWEET_BERRY_BUSH = register(new Identifier("beyondvanilla", "potted_yellow_sweet_berry"), new FlowerPotBlock(YELLOW_SWEET_BERRY_BUSH, AbstractBlock.Settings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        LIGHT_BLUE_SWEET_BERRY_BUSH = (BerryBushBlock) register(new Identifier("beyondvanilla", "light_blue_sweet_berry_bush"), new BerryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), plantable_blocks));
        POTTED_LIGHT_BLUE_SWEET_BERRY_BUSH = register(new Identifier("beyondvanilla", "potted_light_blue_sweet_berry"), new FlowerPotBlock(LIGHT_BLUE_SWEET_BERRY_BUSH, AbstractBlock.Settings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        MAGENTA_SWEET_BERRY_BUSH = (BerryBushBlock) register(new Identifier("beyondvanilla", "magenta_sweet_berry_bush"), new BerryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), plantable_blocks));
        POTTED_MAGENTA_SWEET_BERRY_BUSH = register(new Identifier("beyondvanilla", "potted_magenta_sweet_berry"), new FlowerPotBlock(MAGENTA_SWEET_BERRY_BUSH, AbstractBlock.Settings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        ORANGE_SWEET_BERRY_BUSH = (BerryBushBlock) register(new Identifier("beyondvanilla", "orange_sweet_berry_bush"), new BerryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), plantable_blocks));
        POTTED_ORANGE_SWEET_BERRY_BUSH = register(new Identifier("beyondvanilla", "potted_orange_sweet_berry"), new FlowerPotBlock(ORANGE_SWEET_BERRY_BUSH, AbstractBlock.Settings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        BLUE_SWEET_BERRY_BUSH = (BerryBushBlock) register(new Identifier("beyondvanilla", "blue_sweet_berry_bush"), new BerryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), plantable_blocks));
        POTTED_BLUE_SWEET_BERRY_BUSH = register(new Identifier("beyondvanilla", "potted_blue_sweet_berry"), new FlowerPotBlock(BLUE_SWEET_BERRY_BUSH, AbstractBlock.Settings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        BROWN_SWEET_BERRY_BUSH = (BerryBushBlock) register(new Identifier("beyondvanilla", "brown_sweet_berry_bush"), new BerryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), plantable_blocks));
        POTTED_BROWN_SWEET_BERRY_BUSH = register(new Identifier("beyondvanilla", "potted_brown_sweet_berry"), new FlowerPotBlock(BROWN_SWEET_BERRY_BUSH, AbstractBlock.Settings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        BLACK_SWEET_BERRY_BUSH = (BerryBushBlock) register(new Identifier("beyondvanilla", "black_sweet_berry_bush"), new BerryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), plantable_blocks));
        POTTED_BLACK_SWEET_BERRY_BUSH = register(new Identifier("beyondvanilla", "potted_black_sweet_berry"), new FlowerPotBlock(BLACK_SWEET_BERRY_BUSH, AbstractBlock.Settings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        WHITE_SWEET_BERRY_BUSH = (BerryBushBlock) register(new Identifier("beyondvanilla", "white_sweet_berry_bush"), new BerryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), plantable_blocks));
        POTTED_WHITE_SWEET_BERRY_BUSH = register(new Identifier("beyondvanilla", "potted_white_sweet_berry"), new FlowerPotBlock(WHITE_SWEET_BERRY_BUSH, AbstractBlock.Settings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
        PERFECT_SWEET_BERRY_BUSH = (BerryBushBlock) register(new Identifier("beyondvanilla", "perfect_sweet_berry_bush"), new PerfectBerryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), plantable_blocks));
        POTTED_PERFECT_SWEET_BERRY_BUSH = register(new Identifier("beyondvanilla", "potted_perfect_sweet_berry"), new FlowerPotBlock(PERFECT_SWEET_BERRY_BUSH, AbstractBlock.Settings.of(Material.SUPPORTED).breakInstantly().nonOpaque()));
    }
}
