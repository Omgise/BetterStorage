package net.mcft.betterstorage;

import net.mcft.betterstorage.addon.Addon;
import net.mcft.betterstorage.config.Config;
import net.mcft.betterstorage.config.GlobalConfig;
import net.mcft.betterstorage.content.BetterStorageEntities;
import net.mcft.betterstorage.content.BetterStorageItems;
import net.mcft.betterstorage.content.BetterStorageTileEntities;
import net.mcft.betterstorage.content.BetterStorageTiles;
import net.mcft.betterstorage.item.EnchantmentBetterStorage;
import net.mcft.betterstorage.misc.Constants;
import net.mcft.betterstorage.misc.CreativeTabBetterStorage;
import net.mcft.betterstorage.misc.DungeonLoot;
import net.mcft.betterstorage.misc.Recipes;
import net.mcft.betterstorage.network.ChannelHandler;
import net.mcft.betterstorage.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;

import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(
    modid = BetterStorage.MODID,
    name = BetterStorage.MODNAME,
    dependencies = "required-after:Forge; after:Thaumcraft; after:NotEnoughItems;",
    guiFactory = "gui.client.net.mcft.betterstorage.BetterStorageGuiFactory")
public class BetterStorage {

    public static final String MODID = "betterstorage";
    public static final String MODNAME = "BetterStorage";

    @Instance(BetterStorage.MODID)
    public static BetterStorage instance;

    @SidedProxy(serverSide = Constants.commonProxy, clientSide = Constants.clientProxy)
    public static CommonProxy proxy;

    public static ChannelHandler networkChannel;

    public static Logger log;

    public static CreativeTabs creativeTab;

    public static Config globalConfig;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        networkChannel = new ChannelHandler();
        log = event.getModLog();
        creativeTab = new CreativeTabBetterStorage();

        Addon.initialize();

        globalConfig = new GlobalConfig(event.getSuggestedConfigurationFile());
        Addon.setupConfigsAll();
        globalConfig.load();
        globalConfig.save();

        BetterStorageTiles.initialize();
        BetterStorageItems.initialize();

        EnchantmentBetterStorage.initialize();

        BetterStorageTileEntities.register();
        BetterStorageEntities.register();
        DungeonLoot.add();

    }

    @EventHandler
    public void load(FMLInitializationEvent event) {

        Recipes.add();
        proxy.initialize();

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        Addon.postInitializeAll();
    }

}
