package net.renarld.beyondvanilla.client;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.renarld.beyondvanilla.registry.ItemRegistration;

public class ItemGroup {

    public static final net.minecraft.item.ItemGroup BEYOND_VANILLA_ITEMGROUP;
    public static final net.minecraft.item.ItemGroup BEYOND_VANILLA_BERRY_ITEMGROUP;

    static {
        BEYOND_VANILLA_ITEMGROUP = FabricItemGroupBuilder.create(
                new Identifier("beyondvanilla", "beyondvanilla_category"))
                .icon(() -> new ItemStack(ItemRegistration.IRON_LANTERN))
                .appendItems(stacks -> {
                    stacks.add(new ItemStack(ItemRegistration.SHULKER_TAPE_BOX_ITEM));
                    stacks.add(new ItemStack(ItemRegistration.SHULKER_TAPE_BOX_BLOCK));
                    stacks.add(new ItemStack(ItemRegistration.CHEST_TO_SHULKER_ITEM));
                    stacks.add(new ItemStack(ItemRegistration.SHULKER_CAPTURE_POD));
                    stacks.add(new ItemStack(ItemRegistration.SOUL_REDSTONE_TORCH));
                    stacks.add(new ItemStack(ItemRegistration.SOUL_REDSTONE_LAMP));
                    stacks.add(new ItemStack(ItemRegistration.IRON_LANTERN));
                    stacks.add(new ItemStack(ItemRegistration.IRON_SOUL_LANTERN));
                    stacks.add(new ItemStack(ItemRegistration.GOLD_LANTERN));
                    stacks.add(new ItemStack(ItemRegistration.GOLD_SOUL_LANTERN));
                    stacks.add(new ItemStack(ItemRegistration.GOLD_CHAIN));
                    stacks.add(new ItemStack(ItemRegistration.IRON_FENCE));
                    stacks.add(new ItemStack(ItemRegistration.IRON_FENCE_GATE));
                    stacks.add(new ItemStack(ItemRegistration.GOLD_FENCE));
                    stacks.add(new ItemStack(ItemRegistration.GOLD_FENCE_GATE));
                })
                .build();

        BEYOND_VANILLA_BERRY_ITEMGROUP = FabricItemGroupBuilder.create(
                new Identifier("beyondvanilla", "beyondvanilla_berry_category"))
                .icon(() -> new ItemStack(Items.SWEET_BERRIES))
                .appendItems(stacks -> {
                    stacks.add(new ItemStack(ItemRegistration.BERRY_GRINDER));
                    stacks.add(new ItemStack(Items.SWEET_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.RED_PULVERIZED_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.RED_BERRY_JUICE));
                    stacks.add(new ItemStack(ItemRegistration.RED_BERRY_JAM));
                    stacks.add(new ItemStack(ItemRegistration.RED_BERRY_SANDWICH));
                    stacks.add(new ItemStack(ItemRegistration.GREEN_SWEET_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.GREEN_PULVERIZED_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.GREEN_BERRY_JUICE));
                    stacks.add(new ItemStack(ItemRegistration.GREEN_BERRY_JAM));
                    stacks.add(new ItemStack(ItemRegistration.GREEN_BERRY_SANDWICH));
                    stacks.add(new ItemStack(ItemRegistration.PURPLE_SWEET_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.PURPLE_PULVERIZED_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.PURPLE_BERRY_JUICE));
                    stacks.add(new ItemStack(ItemRegistration.PURPLE_BERRY_JAM));
                    stacks.add(new ItemStack(ItemRegistration.PURPLE_BERRY_SANDWICH));
                    stacks.add(new ItemStack(ItemRegistration.CYAN_SWEET_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.CYAN_PULVERIZED_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.CYAN_BERRY_JUICE));
                    stacks.add(new ItemStack(ItemRegistration.CYAN_BERRY_JAM));
                    stacks.add(new ItemStack(ItemRegistration.CYAN_BERRY_SANDWICH));
                    stacks.add(new ItemStack(ItemRegistration.LIGHT_GRAY_SWEET_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.LIGHT_GRAY_PULVERIZED_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.LIGHT_GRAY_BERRY_JUICE));
                    stacks.add(new ItemStack(ItemRegistration.LIGHT_GRAY_BERRY_JAM));
                    stacks.add(new ItemStack(ItemRegistration.LIGHT_GRAY_BERRY_SANDWICH));
                    stacks.add(new ItemStack(ItemRegistration.GRAY_SWEET_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.GRAY_PULVERIZED_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.GRAY_BERRY_JUICE));
                    stacks.add(new ItemStack(ItemRegistration.GRAY_BERRY_JAM));
                    stacks.add(new ItemStack(ItemRegistration.GRAY_BERRY_SANDWICH));
                    stacks.add(new ItemStack(ItemRegistration.PINK_SWEET_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.PINK_PULVERIZED_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.PINK_BERRY_JUICE));
                    stacks.add(new ItemStack(ItemRegistration.PINK_BERRY_JAM));
                    stacks.add(new ItemStack(ItemRegistration.PINK_BERRY_SANDWICH));
                    stacks.add(new ItemStack(ItemRegistration.LIME_SWEET_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.LIME_PULVERIZED_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.LIME_BERRY_JUICE));
                    stacks.add(new ItemStack(ItemRegistration.LIME_BERRY_JAM));
                    stacks.add(new ItemStack(ItemRegistration.LIME_BERRY_SANDWICH));
                    stacks.add(new ItemStack(ItemRegistration.YELLOW_SWEET_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.YELLOW_PULVERIZED_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.YELLOW_BERRY_JUICE));
                    stacks.add(new ItemStack(ItemRegistration.YELLOW_BERRY_JAM));
                    stacks.add(new ItemStack(ItemRegistration.YELLOW_BERRY_SANDWICH));
                    stacks.add(new ItemStack(ItemRegistration.LIGHT_BLUE_SWEET_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.LIGHT_BLUE_PULVERIZED_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.LIGHT_BLUE_BERRY_JUICE));
                    stacks.add(new ItemStack(ItemRegistration.LIGHT_BLUE_BERRY_JAM));
                    stacks.add(new ItemStack(ItemRegistration.LIGHT_BLUE_BERRY_SANDWICH));
                    stacks.add(new ItemStack(ItemRegistration.MAGENTA_SWEET_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.MAGENTA_PULVERIZED_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.MAGENTA_BERRY_JUICE));
                    stacks.add(new ItemStack(ItemRegistration.MAGENTA_BERRY_JAM));
                    stacks.add(new ItemStack(ItemRegistration.MAGENTA_BERRY_SANDWICH));
                    stacks.add(new ItemStack(ItemRegistration.ORANGE_SWEET_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.ORANGE_PULVERIZED_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.ORANGE_BERRY_JUICE));
                    stacks.add(new ItemStack(ItemRegistration.ORANGE_BERRY_JAM));
                    stacks.add(new ItemStack(ItemRegistration.ORANGE_BERRY_SANDWICH));
                    stacks.add(new ItemStack(ItemRegistration.BLUE_SWEET_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.BLUE_PULVERIZED_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.BLUE_BERRY_JUICE));
                    stacks.add(new ItemStack(ItemRegistration.BLUE_BERRY_JAM));
                    stacks.add(new ItemStack(ItemRegistration.BLUE_BERRY_SANDWICH));
                    stacks.add(new ItemStack(ItemRegistration.BROWN_SWEET_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.BROWN_PULVERIZED_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.BROWN_BERRY_JUICE));
                    stacks.add(new ItemStack(ItemRegistration.BROWN_BERRY_JAM));
                    stacks.add(new ItemStack(ItemRegistration.BROWN_BERRY_SANDWICH));
                    stacks.add(new ItemStack(ItemRegistration.BLACK_SWEET_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.BLACK_PULVERIZED_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.BLACK_BERRY_JUICE));
                    stacks.add(new ItemStack(ItemRegistration.BLACK_BERRY_JAM));
                    stacks.add(new ItemStack(ItemRegistration.BLACK_BERRY_SANDWICH));
                    stacks.add(new ItemStack(ItemRegistration.WHITE_SWEET_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.WHITE_PULVERIZED_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.WHITE_BERRY_JUICE));
                    stacks.add(new ItemStack(ItemRegistration.WHITE_BERRY_JAM));
                    stacks.add(new ItemStack(ItemRegistration.WHITE_BERRY_SANDWICH));
                    stacks.add(new ItemStack(ItemRegistration.PERFECT_SWEET_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.PERFECT_PULVERIZED_BERRIES));
                    stacks.add(new ItemStack(ItemRegistration.PERFECT_BERRY_JUICE));
                    stacks.add(new ItemStack(ItemRegistration.PERFECT_BERRY_JAM));
                    stacks.add(new ItemStack(ItemRegistration.PERFECT_BERRY_SANDWICH));
                })
                .build();
    }
}
