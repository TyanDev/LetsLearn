package net.tyan.letslearn;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.tyan.letslearn.handler.ConfigurationHandler;
import net.tyan.letslearn.proxy.IProxy;
import net.tyan.letslearn.reference.Reference;
import net.tyan.letslearn.utility.LogUtils;

/**
 * by Tyan on 05.04.2015.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsLearn {

    @Mod.Instance(Reference.MOD_ID)
    public static LetsLearn instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        LogUtils.info("Pre Initialization complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        LogUtils.info("Initialization complete!");

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogUtils.info("Post Initialization complete!");

    }


}