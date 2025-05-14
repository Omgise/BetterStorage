package net.mcft.betterstorage.tile;

import net.mcft.betterstorage.BetterStorage;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileFlintBlock extends TileBetterStorage {

    public TileFlintBlock() {
        super(Material.rock);

        setHardness(3.0F);
        setResistance(6.0F);
        setStepSound(soundTypeStone);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(BetterStorage.MODID + ":" + getTileName());
    }

}
