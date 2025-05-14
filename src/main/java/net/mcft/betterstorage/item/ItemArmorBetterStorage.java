package net.mcft.betterstorage.item;

import net.mcft.betterstorage.BetterStorage;
import net.mcft.betterstorage.utils.MiscUtils;
import net.minecraft.item.ItemArmor;

import cpw.mods.fml.common.registry.GameRegistry;

public abstract class ItemArmorBetterStorage extends ItemArmor {

    private String name;

    public ItemArmorBetterStorage(ArmorMaterial material, int renderSlot, int slot) {

        super(material, renderSlot, slot);

        setCreativeTab(BetterStorage.creativeTab);

        setUnlocalizedName(BetterStorage.MODID + "." + getItemName());
        GameRegistry.registerItem(this, getItemName());
    }

    /** Returns the name of this item, for example "drinkingHelmet". */
    public String getItemName() {
        return ((name != null) ? name : (name = MiscUtils.getName(this)));
    }
}
