package net.tyan.letslearn.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * by Tyan on 05.04.2015.
 */

public class ConfigurationHandler {

    public static void init(File configFile) {
        Configuration configuration = new Configuration(configFile);

        boolean configValue = false;
        try {
            //load config
            configuration.load();

            //Read in properties form config file
            configValue = configuration.get("General Values", "configValue", true, "Example configuration value").getBoolean(true);

        } catch (Exception ex) {
            // Log exception
        } finally {
            //Save config
            configuration.save();
        }
        System.out.println(configValue);
    }

}
