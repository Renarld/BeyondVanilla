package net.renarld.beyondvanilla;

import io.github.prospector.modmenu.api.ConfigScreenFactory;
import io.github.prospector.modmenu.api.ModMenuApi;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.renarld.beyondvanilla.gui.ConfigGui;

@Environment(EnvType.CLIENT)
public class ModMenu implements ModMenuApi {

    @Override
    public String getModId() {
        return "beyondvanilla";
    }

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> ConfigGui.screenBuilder(parent).build();
    }
}
