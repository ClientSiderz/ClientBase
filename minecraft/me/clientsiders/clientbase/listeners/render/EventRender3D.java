package me.clientsiders.clientbase.listeners.render;

import com.darkmagician6.eventapi.events.Event;

public final class EventRender3D implements Event {
    private final float partialTicks;

    public EventRender3D(float partialTicks) {
        this.partialTicks = partialTicks;
    }

    public float getPartialTicks() {
        return partialTicks;
    }
}
