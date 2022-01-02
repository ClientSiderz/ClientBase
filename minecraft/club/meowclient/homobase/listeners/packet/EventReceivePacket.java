package club.meowclient.homobase.listeners.packet;

import club.meowclient.homobase.listeners.Event;
import net.minecraft.network.Packet;

public class EventReceivePacket extends Event {
    private Packet packet;

    public EventReceivePacket(Packet packet) {
        this.packet = packet;
    }

    public Packet getPacket() {
        return packet;
    }
}
