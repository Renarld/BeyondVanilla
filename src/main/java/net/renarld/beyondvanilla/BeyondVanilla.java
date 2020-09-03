package net.renarld.beyondvanilla;

import net.fabricmc.api.ModInitializer;
import net.renarld.beyondvanilla.client.ItemGroup;
import net.renarld.beyondvanilla.config.Config;
import net.renarld.beyondvanilla.registry.*;

public class BeyondVanilla implements ModInitializer {

	@Override
	public void onInitialize() {
		// Create the config file if it does not exists
		Config.createConfig();

		// Load the config file
		Config.loadConfig();

		// Item Registration
		new ItemRegistration();

		// Block Registration
		new BlockRegistration();

		// Entity Registration
		new EntityRegistration();

		// Biome Registration
		new BiomeRegistration();

		// ItemGroup Registration
		new ItemGroup();
	}
}
