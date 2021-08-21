package me.clientsiders.clientbase.listeners.packet;

import me.clientsiders.clientbase.listeners.Event;
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
