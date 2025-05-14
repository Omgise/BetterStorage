package net.mcft.betterstorage.tile.stand;

import net.mcft.betterstorage.api.stand.BetterStorageArmorStand;
import net.mcft.betterstorage.api.stand.ClientArmorStandPlayer;
import net.mcft.betterstorage.api.stand.IArmorStand;
import net.mcft.betterstorage.api.stand.IArmorStandRenderHandler;
import net.mcft.betterstorage.misc.EquipmentSlot;
import net.minecraft.tileentity.TileEntity;

public class VanillaArmorStandRenderHandler implements IArmorStandRenderHandler {

    @Override
    public <T extends TileEntity & IArmorStand> void onPreRender(T armorStand, ClientArmorStandPlayer player) {
        player.setCurrentItemOrArmor(EquipmentSlot.HEAD, armorStand.getItem(BetterStorageArmorStand.helmet));
        player.setCurrentItemOrArmor(EquipmentSlot.CHEST, armorStand.getItem(BetterStorageArmorStand.chestplate));
        player.setCurrentItemOrArmor(EquipmentSlot.LEGS, armorStand.getItem(BetterStorageArmorStand.leggins));
        player.setCurrentItemOrArmor(EquipmentSlot.FEET, armorStand.getItem(BetterStorageArmorStand.boots));
    }

    @Override
    public <T extends TileEntity & IArmorStand> void onPostRender(T armorStand, ClientArmorStandPlayer player) {}

}
