package net.mcft.betterstorage.addon.thaumcraft;

import net.mcft.betterstorage.misc.Constants;
import net.mcft.betterstorage.tile.entity.TileEntityBackpack;

public class TileEntityThaumcraftBackpack extends TileEntityBackpack {

    @Override
    public String getName() {
        return Constants.containerThaumcraftBackpack;
    }

    @Override
    public int getColumns() {
        return 13;
    }

}
