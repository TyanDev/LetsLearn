package net.tyan.letslearn.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.tyan.letslearn.handler.ConfigurationHandler;
import net.tyan.letslearn.reference.Reference;

/**
 * by Tyan on 05.04.2015.
 */

public class ModGuiConfig extends GuiConfig {


    public ModGuiConfig(GuiScreen parentScreen) {

        super(parentScreen, new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), Reference.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
