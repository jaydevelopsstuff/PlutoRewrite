package net.guardiandev.pluto.network.packet.server;

import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import net.guardiandev.pluto.data.NetworkText;
import net.guardiandev.pluto.network.packet.PacketType;

@AllArgsConstructor
public class Disconnect implements ServerPacket {
    public NetworkText reason;

    @Override
    public void writePacket(ByteBuf buf) {
        reason.serialize(buf);
    }

    @Override
    public PacketType getType() {
        return PacketType.Disconnect;
    }
}
