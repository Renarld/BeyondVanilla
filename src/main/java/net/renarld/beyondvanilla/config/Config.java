package net.renarld.beyondvanilla.config;

import com.google.gson.Gson;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tag.ItemTags;
import net.renarld.beyondvanilla.registry.ItemRegistration;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Config {
    private static ConfigObject config = new ConfigObject();
    private static File file = new File(FabricLoader.getInstance().getConfigDir().toFile(), "BeyondVanilla.json");

    public static void createConfig() {
        if (!file.exists()) {
            config.setBushSpawnChance(1);

            ArrayList<String> default_blacklist = new ArrayList<>();
            default_blacklist.add("minecraft:shulker");
            default_blacklist.add("minecraft:wither");
            default_blacklist.add("minecraft:elder_guardian");
            config.setBlacklist(default_blacklist);

            Map<String, Boolean> default_drop = new HashMap<>();
            default_drop.put("minecraft:diamond", true);
            default_drop.put("minecraft:emerald", true);
            default_drop.put("beyondvanilla:perfect_sweet_berries", true);
            default_drop.put("minecraft:experience_bottle", true);
            default_drop.put("minecraft:music_disc_11", true);
            default_drop.put("minecraft:ender_pearl", true);
            config.setDrop(default_drop);

            Map<String, Integer> default_droplist = new HashMap<>();
            default_droplist.put("minecraft:diamond", 1);
            default_droplist.put("minecraft:emerald", 1);
            default_droplist.put("beyondvanilla:perfect_sweet_berries", 1);
            default_droplist.put("minecraft:experience_bottle", 1);
            default_droplist.put("minecraft:ender_pearl", 1);
            config.setDroplist(default_droplist);

            saveConfig();
        }
    }

    public static void saveConfig() {
        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter(file)) {
            gson.toJson(config, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadConfig() {
        Gson gson = new Gson();

        try (Reader reader = new FileReader(file)) {
            config = gson.fromJson(reader, ConfigObject.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ConfigObject getConfig() {
        return config;
    }
}
