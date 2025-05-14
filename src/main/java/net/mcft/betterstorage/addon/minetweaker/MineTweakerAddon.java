package net.mcft.betterstorage.addon.minetweaker;

import net.mcft.betterstorage.addon.Addon;

import minetweaker.MineTweakerAPI;

public class MineTweakerAddon extends Addon {

    public MineTweakerAddon() {
        super("MineTweaker3");
    }

    @Override
    public void setupConfig() {
        MineTweakerAPI.registerClass(MTCraftingStation.class);
    }

}
