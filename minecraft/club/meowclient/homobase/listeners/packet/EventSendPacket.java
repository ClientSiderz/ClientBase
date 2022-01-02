package club.meowclient.homobase.listeners.packet;

import club.meowclient.homobase.listeners.Event;
import net.minecraft.network.Packet;

public class EventSendPacket extends Event {
    private Packet packet;

    public EventSendPacket(final Packet packet) {
        this.packet = packet;
    }

    public Packet getPacket() {
        return packet;
    }
    public void setPacket(final Packet packet) {
        this.packet = packet;
    }
}
