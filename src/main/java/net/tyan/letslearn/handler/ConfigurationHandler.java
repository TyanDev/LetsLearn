package net.tyan.letslearn.handler;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.tyan.letslearn.reference.Reference;

import java.io.File;

/**
 * by Tyan on 05.04.2015.
 */

public class ConfigurationHandler {

    public static Configuration configuration;

    public static boolean testValue = false;

    public static void init(File configFile) {
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }

    }


    @SubscribeEvent
    public void onConfigurationChanged(ConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            loadConfiguration();
        }

    }

    private static void loadConfiguration() {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "Example value");

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }

}
