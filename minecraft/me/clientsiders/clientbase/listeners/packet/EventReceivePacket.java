package me.clientsiders.clientbase.listeners.packet;

import com.darkmagician6.eventapi.events.callables.EventCancellable;
import net.minecraft.network.Packet;

public class EventReceivePacket extends EventCancellable {
    private Packet packet;

    public EventReceivePacket(final Packet packet) {
        this.packet = packet;
    }

    public Packet getPacket() {
        return packet;
    }
    public void setPacket(final Packet packet) {
        this.packet = packet;
    }
}
