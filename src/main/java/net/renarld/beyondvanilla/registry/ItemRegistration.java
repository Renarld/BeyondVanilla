package net.renarld.beyondvanilla.registry;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.renarld.beyondvanilla.client.ItemGroup;
import net.renarld.beyondvanilla.item.*;

public class ItemRegistration {
    // CONTAINERS
    public static final Item SHULKER_TAPE_BOX_ITEM;
    public static final Item SHULKER_TAPE_BOX_BLOCK;
    public static final Item CHEST_TO_SHULKER_ITEM;
    public static final Item SHULKER_CAPTURE_POD;

    // LIGHT BLOCKS
    public static final Item SOUL_REDSTONE_TORCH;
    public static final Item SOUL_REDSTONE_LAMP;
    public static final Item IRON_LANTERN;
    public static final Item IRON_SOUL_LANTERN;
    public static final Item GOLD_LANTERN;
    public static final Item GOLD_SOUL_LANTERN;

    // DECORATION
    public static final Item GOLD_CHAIN;
    public static final Item IRON_FENCE;
    public static final Item IRON_FENCE_GATE;
    public static final Item GOLD_FENCE;
    public static final Item GOLD_FENCE_GATE;

    // BERRIES
    public static final Item BERRY_GRINDER;
    public static final Item RED_PULVERIZED_BERRIES;
    public static final Item RED_BERRY_JUICE;
    public static final Item RED_BERRY_JAM;
    public static final Item RED_BERRY_SANDWICH;
    public static final Item GREEN_SWEET_BERRIES;
    public static final Item GREEN_PULVERIZED_BERRIES;
    public static final Item GREEN_BERRY_JUICE;
    public static final Item GREEN_BERRY_JAM;
    public static final Item GREEN_BERRY_SANDWICH;
    public static final Item PURPLE_SWEET_BERRIES;
    public static final Item PURPLE_PULVERIZED_BERRIES;
    public static final Item PURPLE_BERRY_JUICE;
    public static final Item PURPLE_BERRY_JAM;
    public static final Item PURPLE_BERRY_SANDWICH;
    public static final Item CYAN_SWEET_BERRIES;
    public static final Item CYAN_PULVERIZED_BERRIES;
    public static final Item CYAN_BERRY_JUICE;
    public static final Item CYAN_BERRY_JAM;
    public static final Item CYAN_BERRY_SANDWICH;
    public static final Item LIGHT_GRAY_SWEET_BERRIES;
    public static final Item LIGHT_GRAY_PULVERIZED_BERRIES;
    public static final Item LIGHT_GRAY_BERRY_JUICE;
    public static final Item LIGHT_GRAY_BERRY_JAM;
    public static final Item LIGHT_GRAY_BERRY_SANDWICH;
    public static final Item GRAY_SWEET_BERRIES;
    public static final Item GRAY_PULVERIZED_BERRIES;
    public static final Item GRAY_BERRY_JUICE;
    public static final Item GRAY_BERRY_JAM;
    public static final Item GRAY_BERRY_SANDWICH;
    public static final Item PINK_SWEET_BERRIES;
    public static final Item PINK_PULVERIZED_BERRIES;
    public static final Item PINK_BERRY_JUICE;
    public static final Item PINK_BERRY_JAM;
    public static final Item PINK_BERRY_SANDWICH;
    public static final Item LIME_SWEET_BERRIES;
    public static final Item LIME_PULVERIZED_BERRIES;
    public static final Item LIME_BERRY_JUICE;
    public static final Item LIME_BERRY_JAM;
    public static final Item LIME_BERRY_SANDWICH;
    public static final Item YELLOW_SWEET_BERRIES;
    public static final Item YELLOW_PULVERIZED_BERRIES;
    public static final Item YELLOW_BERRY_JUICE;
    public static final Item YELLOW_BERRY_JAM;
    public static final Item YELLOW_BERRY_SANDWICH;
    public static final Item LIGHT_BLUE_SWEET_BERRIES;
    public static final Item LIGHT_BLUE_PULVERIZED_BERRIES;
    public static final Item LIGHT_BLUE_BERRY_JUICE;
    public static final Item LIGHT_BLUE_BERRY_JAM;
    public static final Item LIGHT_BLUE_BERRY_SANDWICH;
    public static final Item MAGENTA_SWEET_BERRIES;
    public static final Item MAGENTA_PULVERIZED_BERRIES;
    public static final Item MAGENTA_BERRY_JUICE;
    public static final Item MAGENTA_BERRY_JAM;
    public static final Item MAGENTA_BERRY_SANDWICH;
    public static final Item ORANGE_SWEET_BERRIES;
    public static final Item ORANGE_PULVERIZED_BERRIES;
    public static final Item ORANGE_BERRY_JUICE;
    public static final Item ORANGE_BERRY_JAM;
    public static final Item ORANGE_BERRY_SANDWICH;
    public static final Item BLUE_SWEET_BERRIES;
    public static final Item BLUE_PULVERIZED_BERRIES;
    public static final Item BLUE_BERRY_JUICE;
    public static final Item BLUE_BERRY_JAM;
    public static final Item BLUE_BERRY_SANDWICH;
    public static final Item BROWN_SWEET_BERRIES;
    public static final Item BROWN_PULVERIZED_BERRIES;
    public static final Item BROWN_BERRY_JUICE;
    public static final Item BROWN_BERRY_JAM;
    public static final Item BROWN_BERRY_SANDWICH;
    public static final Item BLACK_SWEET_BERRIES;
    public static final Item BLACK_PULVERIZED_BERRIES;
    public static final Item BLACK_BERRY_JUICE;
    public static final Item BLACK_BERRY_JAM;
    public static final Item BLACK_BERRY_SANDWICH;
    public static final Item WHITE_SWEET_BERRIES;
    public static final Item WHITE_PULVERIZED_BERRIES;
    public static final Item WHITE_BERRY_JUICE;
    public static final Item WHITE_BERRY_JAM;
    public static final Item WHITE_BERRY_SANDWICH;
    public static final Item PERFECT_SWEET_BERRIES;
    public static final Item PERFECT_PULVERIZED_BERRIES;
    public static final Item PERFECT_BERRY_JUICE;
    public static final Item PERFECT_BERRY_JAM;
    public static final Item PERFECT_BERRY_SANDWICH;

    // SPAWN EGGS
    public static final Item LOOT_SLIME_SPAWN_EGG;

    static {
        // CONTAINERS
        SHULKER_TAPE_BOX_ITEM = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "shulker_tape_box_item"), new ShulkerTapeBoxItem(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_ITEMGROUP)));
        SHULKER_TAPE_BOX_BLOCK = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "shulker_tape_box_block"), new BlockItem(BlockRegistration.SHULKER_TAPE_BOX_BLOCK, new Item.Settings().group(ItemGroup.BEYOND_VANILLA_ITEMGROUP)));
        CHEST_TO_SHULKER_ITEM = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "chest_to_shulker_item"), new ChestToShulkerItem(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_ITEMGROUP)));
        SHULKER_CAPTURE_POD = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "shulker_capture_pod"), new ShulkerCapturePodItem(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_ITEMGROUP)));

        // LIGHT BLOCKS
        SOUL_REDSTONE_TORCH = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "soul_redstone_torch"), new WallStandingBlockItem(BlockRegistration.SOUL_REDSTONE_TORCH, BlockRegistration.WALL_SOUL_REDSTONE_TORCH, (new Item.Settings().group(ItemGroup.BEYOND_VANILLA_ITEMGROUP))));
        SOUL_REDSTONE_LAMP = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "soul_redstone_lamp"), new BlockItem(BlockRegistration.SOUL_REDSTONE_LAMP, new Item.Settings().group(ItemGroup.BEYOND_VANILLA_ITEMGROUP)));
        IRON_LANTERN = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "iron_lantern"), new BlockItem(BlockRegistration.IRON_LANTERN, new Item.Settings().group(ItemGroup.BEYOND_VANILLA_ITEMGROUP)));
        IRON_SOUL_LANTERN = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "iron_soul_lantern"), new BlockItem(BlockRegistration.IRON_SOUL_LANTERN, new Item.Settings().group(ItemGroup.BEYOND_VANILLA_ITEMGROUP)));
        GOLD_LANTERN = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "gold_lantern"), new BlockItem(BlockRegistration.GOLD_LANTERN, new Item.Settings().group(ItemGroup.BEYOND_VANILLA_ITEMGROUP)));
        GOLD_SOUL_LANTERN = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "gold_soul_lantern"), new BlockItem(BlockRegistration.GOLD_SOUL_LANTERN, new Item.Settings().group(ItemGroup.BEYOND_VANILLA_ITEMGROUP)));

        // DECORATION
        GOLD_CHAIN = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "gold_chain"), new BlockItem(BlockRegistration.GOLD_CHAIN, new Item.Settings().group(ItemGroup.BEYOND_VANILLA_ITEMGROUP)));
        IRON_FENCE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "iron_fence"), new BlockItem(BlockRegistration.IRON_FENCE, new Item.Settings().group(ItemGroup.BEYOND_VANILLA_ITEMGROUP)));
        IRON_FENCE_GATE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "iron_fence_gate"), new BlockItem(BlockRegistration.IRON_FENCE_GATE, new Item.Settings().group(ItemGroup.BEYOND_VANILLA_ITEMGROUP)));
        GOLD_FENCE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "gold_fence"), new BlockItem(BlockRegistration.GOLD_FENCE, new Item.Settings().group(ItemGroup.BEYOND_VANILLA_ITEMGROUP)));
        GOLD_FENCE_GATE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "gold_fence_gate"), new BlockItem(BlockRegistration.GOLD_FENCE_GATE, new Item.Settings().group(ItemGroup.BEYOND_VANILLA_ITEMGROUP)));

        // BERRIES
        BERRY_GRINDER = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "berry_grinder"), new BerryGrinder(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)));
        RED_PULVERIZED_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "red_pulverized_berries"), new Item(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)));
        RED_BERRY_JUICE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "red_berry_juice"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).build())));
        RED_BERRY_JAM = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "red_berry_jam"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
        RED_BERRY_SANDWICH = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "red_jam_sandwich"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
        GREEN_SWEET_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "green_sweet_berries"), new AliasedBlockItem(BlockRegistration.GREEN_SWEET_BERRY_BUSH, (new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        GREEN_PULVERIZED_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "green_pulverized_berries"), new Item(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)));
        GREEN_BERRY_JUICE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "green_berry_juice"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).build())));
        GREEN_BERRY_JAM = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "green_berry_jam"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
        GREEN_BERRY_SANDWICH = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "green_jam_sandwich"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
        PURPLE_SWEET_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "purple_sweet_berries"), new AliasedBlockItem(BlockRegistration.PURPLE_SWEET_BERRY_BUSH, (new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        PURPLE_PULVERIZED_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "purple_pulverized_berries"), new Item(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)));
        PURPLE_BERRY_JUICE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "purple_berry_juice"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).build())));
        PURPLE_BERRY_JAM = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "purple_berry_jam"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
        PURPLE_BERRY_SANDWICH = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "purple_jam_sandwich"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
        CYAN_SWEET_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "cyan_sweet_berries"), new AliasedBlockItem(BlockRegistration.CYAN_SWEET_BERRY_BUSH, (new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        CYAN_PULVERIZED_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "cyan_pulverized_berries"), new Item(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)));
        CYAN_BERRY_JUICE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "cyan_berry_juice"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).build())));
        CYAN_BERRY_JAM = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "cyan_berry_jam"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
        CYAN_BERRY_SANDWICH = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "cyan_jam_sandwich"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
        LIGHT_GRAY_SWEET_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "light_gray_sweet_berries"), new AliasedBlockItem(BlockRegistration.LIGHT_GRAY_SWEET_BERRY_BUSH, (new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        LIGHT_GRAY_PULVERIZED_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "light_gray_pulverized_berries"), new Item(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)));
        LIGHT_GRAY_BERRY_JUICE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "light_gray_berry_juice"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).build())));
        LIGHT_GRAY_BERRY_JAM = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "light_gray_berry_jam"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
        LIGHT_GRAY_BERRY_SANDWICH = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "light_gray_jam_sandwich"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
        GRAY_SWEET_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "gray_sweet_berries"), new AliasedBlockItem(BlockRegistration.GRAY_SWEET_BERRY_BUSH, (new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        GRAY_PULVERIZED_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "gray_pulverized_berries"), new Item(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)));
        GRAY_BERRY_JUICE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "gray_berry_juice"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).build())));
        GRAY_BERRY_JAM = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "gray_berry_jam"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
        GRAY_BERRY_SANDWICH = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "gray_jam_sandwich"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
        PINK_SWEET_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "pink_sweet_berries"), new AliasedBlockItem(BlockRegistration.PINK_SWEET_BERRY_BUSH, (new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        PINK_PULVERIZED_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "pink_pulverized_berries"), new Item(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)));
        PINK_BERRY_JUICE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "pink_berry_juice"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).build())));
        PINK_BERRY_JAM = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "pink_berry_jam"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
        PINK_BERRY_SANDWICH = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "pink_jam_sandwich"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
        LIME_SWEET_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "lime_sweet_berries"), new AliasedBlockItem(BlockRegistration.LIME_SWEET_BERRY_BUSH, (new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        LIME_PULVERIZED_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "lime_pulverized_berries"), new Item(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)));
        LIME_BERRY_JUICE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "lime_berry_juice"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).build())));
        LIME_BERRY_JAM = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "lime_berry_jam"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
        LIME_BERRY_SANDWICH = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "lime_jam_sandwich"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
        YELLOW_SWEET_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "yellow_sweet_berries"), new AliasedBlockItem(BlockRegistration.YELLOW_SWEET_BERRY_BUSH, (new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        YELLOW_PULVERIZED_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "yellow_pulverized_berries"), new Item(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)));
        YELLOW_BERRY_JUICE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "yellow_berry_juice"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).build())));
        YELLOW_BERRY_JAM = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "yellow_berry_jam"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
        YELLOW_BERRY_SANDWICH = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "yellow_jam_sandwich"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
        LIGHT_BLUE_SWEET_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "light_blue_sweet_berries"), new AliasedBlockItem(BlockRegistration.LIGHT_BLUE_SWEET_BERRY_BUSH, (new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        LIGHT_BLUE_PULVERIZED_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "light_blue_pulverized_berries"), new Item(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)));
        LIGHT_BLUE_BERRY_JUICE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "light_blue_berry_juice"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).build())));
        LIGHT_BLUE_BERRY_JAM = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "light_blue_berry_jam"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
        LIGHT_BLUE_BERRY_SANDWICH = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "light_blue_jam_sandwich"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
        MAGENTA_SWEET_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "magenta_sweet_berries"), new AliasedBlockItem(BlockRegistration.MAGENTA_SWEET_BERRY_BUSH, (new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        MAGENTA_PULVERIZED_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "magenta_pulverized_berries"), new Item(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)));
        MAGENTA_BERRY_JUICE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "magenta_berry_juice"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).build())));
        MAGENTA_BERRY_JAM = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "magenta_berry_jam"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
        MAGENTA_BERRY_SANDWICH = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "magenta_jam_sandwich"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
        ORANGE_SWEET_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "orange_sweet_berries"), new AliasedBlockItem(BlockRegistration.ORANGE_SWEET_BERRY_BUSH, (new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        ORANGE_PULVERIZED_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "orange_pulverized_berries"), new Item(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)));
        ORANGE_BERRY_JUICE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "orange_berry_juice"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).build())));
        ORANGE_BERRY_JAM = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "orange_berry_jam"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
        ORANGE_BERRY_SANDWICH = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "orange_jam_sandwich"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
        BLUE_SWEET_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "blue_sweet_berries"), new AliasedBlockItem(BlockRegistration.BLUE_SWEET_BERRY_BUSH, (new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        BLUE_PULVERIZED_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "blue_pulverized_berries"), new Item(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)));
        BLUE_BERRY_JUICE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "blue_berry_juice"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).build())));
        BLUE_BERRY_JAM = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "blue_berry_jam"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
        BLUE_BERRY_SANDWICH = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "blue_jam_sandwich"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
        BROWN_SWEET_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "brown_sweet_berries"), new AliasedBlockItem(BlockRegistration.BROWN_SWEET_BERRY_BUSH, (new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        BROWN_PULVERIZED_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "brown_pulverized_berries"), new Item(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)));
        BROWN_BERRY_JUICE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "brown_berry_juice"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).build())));
        BROWN_BERRY_JAM = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "brown_berry_jam"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
        BROWN_BERRY_SANDWICH = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "brown_jam_sandwich"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
        BLACK_SWEET_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "black_sweet_berries"), new AliasedBlockItem(BlockRegistration.BLACK_SWEET_BERRY_BUSH, (new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        BLACK_PULVERIZED_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "black_pulverized_berries"), new Item(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)));
        BLACK_BERRY_JUICE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "black_berry_juice"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).build())));
        BLACK_BERRY_JAM = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "black_berry_jam"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
        BLACK_BERRY_SANDWICH = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "black_jam_sandwich"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
        WHITE_SWEET_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "white_sweet_berries"), new AliasedBlockItem(BlockRegistration.WHITE_SWEET_BERRY_BUSH, (new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        WHITE_PULVERIZED_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "white_pulverized_berries"), new Item(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)));
        WHITE_BERRY_JUICE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "white_berry_juice"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).build())));
        WHITE_BERRY_JAM = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "white_berry_jam"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
        WHITE_BERRY_SANDWICH = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "white_jam_sandwich"), new Item((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
        PERFECT_SWEET_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "perfect_sweet_berries"), new GlintAliasedBlockItem(BlockRegistration.PERFECT_SWEET_BERRY_BUSH, (new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0), 1.0F).build())));
        PERFECT_PULVERIZED_BERRIES = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "perfect_pulverized_berries"), new GlintItem(new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)));
        PERFECT_BERRY_JUICE = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "perfect_berry_juice"), new GlintItem((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0), 1.0F).build())));
        PERFECT_BERRY_JAM = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "perfect_berry_jam"), new GlintItem((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0), 1.0F).build())));
        PERFECT_BERRY_SANDWICH = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "perfect_jam_sandwich"), new GlintItem((new Item.Settings().group(ItemGroup.BEYOND_VANILLA_BERRY_ITEMGROUP)).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0), 1.0F).build())));

        // SPAWN EGGS
        LOOT_SLIME_SPAWN_EGG = Registry.register(Registry.ITEM, new Identifier("beyondvanilla", "loot_slime_spawn_egg"), new SpawnEggItem(EntityRegistration.LOOT_SLIME_ENTITY, 0xFAFAD2, 0x996515, new Item.Settings().group(ItemGroup.BEYOND_VANILLA_ITEMGROUP)));
    }
}
