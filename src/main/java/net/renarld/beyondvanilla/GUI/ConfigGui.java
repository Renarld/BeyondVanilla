package net.renarld.beyondvanilla.gui;

import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.TranslatableText;
import net.renarld.beyondvanilla.config.Config;
import java.util.ArrayList;
import java.util.Arrays;

@Environment(EnvType.CLIENT)
public class ConfigGui {

    private static final ArrayList<String> DEFUALT_BLACKLIST = new ArrayList<>();

    public static ConfigBuilder screenBuilder(Screen parent) {
        ConfigBuilder builder = ConfigBuilder.create().setParentScreen(parent);

        ConfigCategory general_category = builder.getOrCreateCategory(new TranslatableText("category.beyondvanilla.general_settings"));
        ConfigCategory biome_category = builder.getOrCreateCategory(new TranslatableText("category.beyondvanilla.biome_settings"));

        ConfigEntryBuilder entry_builder = builder.entryBuilder();
        general_category.addEntry(entry_builder.startStrList(new TranslatableText("option.beyondvanilla.blacklist"), Config.getConfig().getBlacklist()).setSaveConsumer(value -> Config.getConfig().setBlacklist(new ArrayList<>(value))).setDefaultValue(DEFUALT_BLACKLIST).setTooltip(new TranslatableText("option.beyondvanilla.blacklist.tooltip")).build());
        biome_category.addEntry(entry_builder.startIntSlider(new TranslatableText("option.beyondvanilla.bush_spawn_chance"), Config.getConfig().getBushSpawnChance(), 0, 3).setSaveConsumer(value -> Config.getConfig().setBushSpawnChance(value)).setDefaultValue(1).setTooltip(new TranslatableText("option.beyondvanilla.bush_spawn_chance.tooltip")).build());

        builder.setSavingRunnable(Config::saveConfig);

        return builder;
    }

    static {
        DEFUALT_BLACKLIST.add("minecraft:shulker");
        DEFUALT_BLACKLIST.add("minecraft:wither");
        DEFUALT_BLACKLIST.add("minecraft:elder_guardian");
    }
}