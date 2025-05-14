package net.mcft.betterstorage.content;

import net.mcft.betterstorage.addon.Addon;
import net.mcft.betterstorage.misc.Constants;
import net.mcft.betterstorage.tile.crate.TileEntityCrate;
import net.mcft.betterstorage.tile.entity.TileEntityBackpack;
import net.mcft.betterstorage.tile.entity.TileEntityCardboardBox;
import net.mcft.betterstorage.tile.entity.TileEntityCraftingStation;
import net.mcft.betterstorage.tile.entity.TileEntityLockableDoor;
import net.mcft.betterstorage.tile.entity.TileEntityLocker;
import net.mcft.betterstorage.tile.entity.TileEntityPresent;
import net.mcft.betterstorage.tile.entity.TileEntityReinforcedChest;
import net.mcft.betterstorage.tile.entity.TileEntityReinforcedLocker;
import net.mcft.betterstorage.tile.stand.TileEntityArmorStand;

import cpw.mods.fml.common.registry.GameRegistry;

public final class BetterStorageTileEntities {

    private BetterStorageTileEntities() {}

    public static void register() {

        GameRegistry.registerTileEntity(TileEntityCrate.class, Constants.containerCrate);
        GameRegistry.registerTileEntity(TileEntityReinforcedChest.class, Constants.containerReinforcedChest);
        GameRegistry.registerTileEntity(TileEntityLocker.class, Constants.containerLocker);
        GameRegistry.registerTileEntity(TileEntityArmorStand.class, Constants.containerArmorStand);
        GameRegistry.registerTileEntity(TileEntityBackpack.class, Constants.containerBackpack);
        GameRegistry.registerTileEntity(TileEntityCardboardBox.class, Constants.containerCardboardBox);
        GameRegistry.registerTileEntity(TileEntityReinforcedLocker.class, Constants.containerReinforcedLocker);
        GameRegistry.registerTileEntity(TileEntityCraftingStation.class, Constants.containerCraftingStation);
        GameRegistry.registerTileEntity(TileEntityPresent.class, Constants.containerPresent);
        GameRegistry.registerTileEntity(TileEntityLockableDoor.class, Constants.lockableDoor);

        Addon.registerTileEntitesAll();

    }

}
