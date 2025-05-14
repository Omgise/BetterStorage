package net.mcft.betterstorage.addon.armourersworkshop;

import net.mcft.betterstorage.addon.Addon;
import net.mcft.betterstorage.api.stand.BetterStorageArmorStand;

import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import riskyken.armourersWorkshop.api.client.render.ISkinRenderHandler;
import riskyken.armourersWorkshop.api.common.skin.ISkinDataHandler;
import riskyken.armourersWorkshop.api.common.skin.type.ISkinTypeRegistry;

public class AWAddon extends Addon {

    public static ISkinDataHandler dataHandler;
    public static ISkinRenderHandler renderHandler;
    public static ISkinTypeRegistry skinRegistry;
    public static AWEquipmentHandler eqHandlerHead;
    public static AWEquipmentHandler eqHandlerChest;
    public static AWEquipmentHandler eqHandlerSkirt;
    public static AWEquipmentHandler eqHandlerLegs;
    public static AWEquipmentHandler eqHandlerFeet;

    public AWAddon() {
        super("armourersWorkshop");
    }

    @Override
    public void setupConfig() {
        FMLInterModComms.sendMessage(
            "armourersWorkshop",
            "register",
            "armourersworkshop.addon.net.mcft.betterstorage.AWDataManager");
    }

    public static void registerSkinTypes() {
        eqHandlerHead = new AWEquipmentHandler(skinRegistry.getSkinTypeHead(), 1);
        eqHandlerChest = new AWEquipmentHandler(skinRegistry.getSkinTypeChest(), 1);
        eqHandlerSkirt = new AWEquipmentHandler(skinRegistry.getSkinTypeSkirt(), 2);
        eqHandlerLegs = new AWEquipmentHandler(skinRegistry.getSkinTypeLegs(), 1);
        eqHandlerFeet = new AWEquipmentHandler(skinRegistry.getSkinTypeFeet(), 1);

        BetterStorageArmorStand.registerEquipHandler(eqHandlerHead);
        BetterStorageArmorStand.registerEquipHandler(eqHandlerChest);
        BetterStorageArmorStand.registerEquipHandler(eqHandlerSkirt);
        BetterStorageArmorStand.registerEquipHandler(eqHandlerLegs);
        BetterStorageArmorStand.registerEquipHandler(eqHandlerFeet);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerRenderers() {
        BetterStorageArmorStand.registerRenderHandler(new AWRenderHandler());
    }

}
