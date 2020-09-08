package net.renarld.beyondvanilla.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConfigObject {
    private int bush_spawn_chance;
    private ArrayList<String> blacklist;
    private Map<String, Boolean> drop_map = new HashMap<>();
    private Map<String, Integer> droplist = new HashMap<>();

    public void setBushSpawnChance(int new_spawn_chance) {
        this.bush_spawn_chance = new_spawn_chance;
    }

    public int getBushSpawnChance() {
        return this.bush_spawn_chance;
    }

    public void setBlacklist(ArrayList<String> blacklist) {
        this.blacklist = blacklist;
    }

    public ArrayList<String> getBlacklist() {
        return this.blacklist;
    }

    public Map<String, Boolean> getDrop() {
        return this.drop_map;
    }

    public boolean getDrop(String entry) {
        return this.drop_map.getOrDefault(entry, false);
    }

    public void setDrop(Map<String, Boolean> drop_map) {
        this.drop_map = drop_map;
    }

    public void setDrop(String entry, boolean bool) {
        drop_map.replace(entry, bool);
    }

    public void setDroplist(Map<String, Integer> droplist) {
        this.droplist = droplist;
    }

    public void saveDroprate(String entry, int value) {
        droplist.replace(entry, value);
    }

    public Map<String, Integer> getDroplist() {
        return this.droplist;
    }

    public int getDroprate(String entry) {
        return this.droplist.getOrDefault(entry, 1);
    }
}
