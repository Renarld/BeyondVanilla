package net.renarld.beyondvanilla.registry;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.CountDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.renarld.beyondvanilla.config.Config;

import java.rmi.registry.Registry;
import java.util.*;

import static net.minecraft.world.gen.surfacebuilder.SurfaceBuilder.GRASS_BLOCK;

public class BiomeRegistration {
    private static Set<Biome> jungle_set = ImmutableSet.of(Biomes.JUNGLE, Biomes.JUNGLE_EDGE, Biomes.JUNGLE_HILLS, Biomes.BAMBOO_JUNGLE, Biomes.BAMBOO_JUNGLE_HILLS);
    private static Set<Biome> dark_forest_set = ImmutableSet.of(Biomes.DARK_FOREST, Biomes.DARK_FOREST_HILLS);
    private static Set<Biome> mountain_set = ImmutableSet.of(Biomes.MOUNTAINS, Biomes.MOUNTAIN_EDGE);
    private static Set<Biome> badlands_set = ImmutableSet.of(Biomes.BADLANDS, Biomes.BADLANDS_PLATEAU, Biomes.WOODED_BADLANDS_PLATEAU);
    private static Set<Biome> savanna_set = ImmutableSet.of(Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU);
    private static Set<Biome> forest_set = ImmutableSet.of(Biomes.FOREST, Biomes.WOODED_HILLS, Biomes.WOODED_MOUNTAINS);
    private static Set<Biome> swamp_set = ImmutableSet.of(Biomes.SWAMP, Biomes.SWAMP_HILLS);
    private static Set<Biome> plains_set = ImmutableSet.of(Biomes.PLAINS, Biomes.SUNFLOWER_PLAINS);
    private static Set<Biome> birch_forest_set = ImmutableSet.of(Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.TALL_BIRCH_FOREST, Biomes.TALL_BIRCH_HILLS);
    private static Set<Biome> snow_tundra_set = ImmutableSet.of(Biomes.SNOWY_TUNDRA);

    public static final RandomPatchFeatureConfig GREEN_BERRY_BUSH_CONFIG;
    public static final RandomPatchFeatureConfig PURPLE_BERRY_BUSH_CONFIG;
    public static final RandomPatchFeatureConfig CYAN_BERRY_BUSH_CONFIG;
    public static final RandomPatchFeatureConfig LIGHT_GRAY_BERRY_BUSH_CONFIG;
    public static final RandomPatchFeatureConfig GRAY_BERRY_BUSH_CONFIG;
    public static final RandomPatchFeatureConfig PINK_BERRY_BUSH_CONFIG;
    public static final RandomPatchFeatureConfig LIME_BERRY_BUSH_CONFIG;
    public static final RandomPatchFeatureConfig YELLOW_BERRY_BUSH_CONFIG;
    public static final RandomPatchFeatureConfig LIGHT_BLUE_BERRY_BUSH_CONFIG;
    public static final RandomPatchFeatureConfig MAGENTA_BERRY_BUSH_CONFIG;
    public static final RandomPatchFeatureConfig ORANGE_BERRY_BUSH_CONFIG;
    public static final RandomPatchFeatureConfig BLUE_BERRY_BUSH_CONFIG;
    public static final RandomPatchFeatureConfig BROWN_BERRY_BUSH_CONFIG;
    public static final RandomPatchFeatureConfig BLACK_BERRY_BUSH_CONFIG;
    public static final RandomPatchFeatureConfig WHITE_BERRY_BUSH_CONFIG;

    static {
        GREEN_BERRY_BUSH_CONFIG = (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistration.GREEN_SWEET_BERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, 3)), SimpleBlockPlacer.field_24871)).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).cannotProject().build();
        PURPLE_BERRY_BUSH_CONFIG = (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistration.PURPLE_SWEET_BERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, 3)), SimpleBlockPlacer.field_24871)).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).cannotProject().build();
        CYAN_BERRY_BUSH_CONFIG = (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistration.CYAN_SWEET_BERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, 3)), SimpleBlockPlacer.field_24871)).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).cannotProject().build();
        LIGHT_GRAY_BERRY_BUSH_CONFIG = (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistration.LIGHT_GRAY_SWEET_BERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, 3)), SimpleBlockPlacer.field_24871)).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).cannotProject().build();
        GRAY_BERRY_BUSH_CONFIG = (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistration.GRAY_SWEET_BERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, 3)), SimpleBlockPlacer.field_24871)).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).cannotProject().build();
        PINK_BERRY_BUSH_CONFIG = (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistration.PINK_SWEET_BERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, 3)), SimpleBlockPlacer.field_24871)).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).cannotProject().build();
        LIME_BERRY_BUSH_CONFIG = (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistration.LIME_SWEET_BERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, 3)), SimpleBlockPlacer.field_24871)).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).cannotProject().build();
        YELLOW_BERRY_BUSH_CONFIG = (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistration.YELLOW_SWEET_BERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, 3)), SimpleBlockPlacer.field_24871)).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).cannotProject().build();
        LIGHT_BLUE_BERRY_BUSH_CONFIG = (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistration.LIGHT_BLUE_SWEET_BERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, 3)), SimpleBlockPlacer.field_24871)).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).cannotProject().build();
        MAGENTA_BERRY_BUSH_CONFIG = (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistration.MAGENTA_SWEET_BERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, 3)), SimpleBlockPlacer.field_24871)).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).cannotProject().build();
        ORANGE_BERRY_BUSH_CONFIG = (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistration.ORANGE_SWEET_BERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, 3)), SimpleBlockPlacer.field_24871)).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).cannotProject().build();
        BLUE_BERRY_BUSH_CONFIG = (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistration.BLUE_SWEET_BERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, 3)), SimpleBlockPlacer.field_24871)).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).cannotProject().build();
        BROWN_BERRY_BUSH_CONFIG = (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistration.BROWN_SWEET_BERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, 3)), SimpleBlockPlacer.field_24871)).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).cannotProject().build();
        BLACK_BERRY_BUSH_CONFIG = (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistration.BLACK_SWEET_BERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, 3)), SimpleBlockPlacer.field_24871)).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).cannotProject().build();
        WHITE_BERRY_BUSH_CONFIG = (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistration.WHITE_SWEET_BERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, 3)), SimpleBlockPlacer.field_24871)).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).cannotProject().build();

        jungle_set.forEach(biome -> {
            biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(GREEN_BERRY_BUSH_CONFIG).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(Config.getConfig().getBushSpawnChance()))));
            biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(LIME_BERRY_BUSH_CONFIG).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(Config.getConfig().getBushSpawnChance()))));
        });

        dark_forest_set.forEach(biome -> biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BLACK_BERRY_BUSH_CONFIG).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(Config.getConfig().getBushSpawnChance())))));

        mountain_set.forEach(biome -> {
            biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(GRAY_BERRY_BUSH_CONFIG).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(Config.getConfig().getBushSpawnChance()))));
            biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(LIGHT_GRAY_BERRY_BUSH_CONFIG).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(Config.getConfig().getBushSpawnChance()))));
        });

        badlands_set.forEach(biome -> biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BROWN_BERRY_BUSH_CONFIG).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(Config.getConfig().getBushSpawnChance())))));

        savanna_set.forEach(biome -> biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(YELLOW_BERRY_BUSH_CONFIG).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(Config.getConfig().getBushSpawnChance())))));

        forest_set.forEach(biome -> biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(CYAN_BERRY_BUSH_CONFIG).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(Config.getConfig().getBushSpawnChance())))));

        swamp_set.forEach(biome -> {
            biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(PURPLE_BERRY_BUSH_CONFIG).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(Config.getConfig().getBushSpawnChance()))));
            biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(MAGENTA_BERRY_BUSH_CONFIG).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(Config.getConfig().getBushSpawnChance()))));
        });

        plains_set.forEach(biome -> {
            biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BLUE_BERRY_BUSH_CONFIG).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(Config.getConfig().getBushSpawnChance()))));
            biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(LIGHT_BLUE_BERRY_BUSH_CONFIG).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(Config.getConfig().getBushSpawnChance()))));
        });

        birch_forest_set.forEach(biome -> {
            biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(PINK_BERRY_BUSH_CONFIG).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(Config.getConfig().getBushSpawnChance()))));
            biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(ORANGE_BERRY_BUSH_CONFIG).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(Config.getConfig().getBushSpawnChance()))));
        });

        snow_tundra_set.forEach(biome -> biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(WHITE_BERRY_BUSH_CONFIG).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(Config.getConfig().getBushSpawnChance())))));

        Biome.BIOMES.forEach(biome -> {
            biome.getEntitySpawnList(SpawnGroup.MONSTER).add(new Biome.SpawnEntry(EntityRegistration.LOOT_SLIME_ENTITY, 1, 1, 1));
        });
    }
}
