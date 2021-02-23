package me.clientsiders.clientbase.listeners.packet;

import com.darkmagician6.eventapi.events.callables.EventCancellable;
import net.minecraft.network.Packet;

public class EventSendPacket extends EventCancellable {
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
