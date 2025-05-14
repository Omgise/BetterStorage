package net.mcft.betterstorage.network.packet;

import java.io.IOException;

import net.mcft.betterstorage.BetterStorage;
import net.mcft.betterstorage.config.GlobalConfig;
import net.mcft.betterstorage.item.ItemBackpack;
import net.mcft.betterstorage.network.AbstractPacket;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;

/** Sent when the player presses the button to open eir backpack. */
public class PacketBackpackOpen extends AbstractPacket<PacketBackpackOpen> {

    public PacketBackpackOpen() {}

    @Override
    public void encode(PacketBuffer buffer) throws IOException {
        // No additional data.
    }

    @Override
    public void decode(PacketBuffer buffer) throws IOException {
        // No additional data.
    }

    @Override
    public void handle(EntityPlayer player) {
        if (BetterStorage.globalConfig.getBoolean(GlobalConfig.enableBackpackOpen))
            ItemBackpack.openBackpack(player, player);
    }

}
