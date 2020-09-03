package net.renarld.beyondvanilla.config;

import java.util.ArrayList;

public class ConfigObject {
    private int bush_spawn_chance;
    private ArrayList<String> blacklist;

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
}
