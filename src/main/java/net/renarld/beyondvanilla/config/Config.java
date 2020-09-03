package net.renarld.beyondvanilla.config;

import com.google.gson.Gson;
import net.fabricmc.loader.api.FabricLoader;
import java.io.*;
import java.util.ArrayList;

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
