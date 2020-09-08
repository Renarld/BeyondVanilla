package net.renarld.beyondvanilla.gui;

import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.registry.Registry;
import net.renarld.beyondvanilla.config.Config;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Environment(EnvType.CLIENT)
public class ConfigGui {
    private static final ArrayList<String> DEFUALT_BLACKLIST = new ArrayList<>();

    public static ConfigBuilder screenBuilder(Screen parent) {
        ConfigBuilder builder = ConfigBuilder.create().setParentScreen(parent);

        ConfigCategory general_category = builder.getOrCreateCategory(new TranslatableText("category.beyondvanilla.general_settings"));
        ConfigCategory biome_category = builder.getOrCreateCategory(new TranslatableText("category.beyondvanilla.biome_settings"));
        ConfigCategory slime_category = builder.getOrCreateCategory(new TranslatableText("category.beyondvanilla.slime_settings"));

        ConfigEntryBuilder entry_builder = builder.entryBuilder();
        general_category.addEntry(entry_builder.startStrList(new TranslatableText("option.beyondvanilla.blacklist"), Config.getConfig().getBlacklist()).setSaveConsumer(value -> Config.getConfig().setBlacklist(new ArrayList<>(value))).setDefaultValue(DEFUALT_BLACKLIST).setTooltip(new TranslatableText("option.beyondvanilla.blacklist.tooltip")).build());
        biome_category.addEntry(entry_builder.startIntSlider(new TranslatableText("option.beyondvanilla.bush_spawn_chance"), Config.getConfig().getBushSpawnChance(), 0, 3).setSaveConsumer(value -> Config.getConfig().setBushSpawnChance(value)).setDefaultValue(1).setTooltip(new TranslatableText("option.beyondvanilla.bush_spawn_chance.tooltip")).build());

        for (Map.Entry<String, Boolean> entry : Config.getConfig().getDrop().entrySet()) {
            slime_category.addEntry(entry_builder.startBooleanToggle(new TranslatableText(String.format("option.beyondvanilla.%s.enabled", entry.getKey())), entry.getValue()).setSaveConsumer(value -> Config.getConfig().setDrop(entry.getKey(), value)).setDefaultValue(true).build());
        }

        for (Map.Entry<String, Integer> entry : Config.getConfig().getDroplist().entrySet()) {
            slime_category.addEntry(entry_builder.startIntSlider(new TranslatableText(String.format("option.beyondvanilla.%s.droprate", entry.getKey())), entry.getValue(), 1, 3).setSaveConsumer(value -> Config.getConfig().saveDroprate(entry.getKey(), value)).setDefaultValue(1).build());
        }

        builder.setSavingRunnable(Config::saveConfig);

        return builder;
    }

    static {
        DEFUALT_BLACKLIST.add("minecraft:shulker");
        DEFUALT_BLACKLIST.add("minecraft:wither");
        DEFUALT_BLACKLIST.add("minecraft:elder_guardian");
    }
}