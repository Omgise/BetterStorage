package net.mcft.betterstorage.content;

import net.mcft.betterstorage.BetterStorage;
import net.mcft.betterstorage.addon.Addon;
import net.mcft.betterstorage.entity.EntityCluckington;
import net.mcft.betterstorage.entity.EntityFrienderman;

import cpw.mods.fml.common.registry.EntityRegistry;

public final class BetterStorageEntities {

    private BetterStorageEntities() {}

    public static void register() {

        EntityRegistry
            .registerModEntity(EntityFrienderman.class, "Frienderman", 1, BetterStorage.instance, 64, 4, true);
        EntityRegistry
            .registerModEntity(EntityCluckington.class, "Cluckington", 2, BetterStorage.instance, 64, 4, true);

        Addon.registerEntitesAll();

    }

}
