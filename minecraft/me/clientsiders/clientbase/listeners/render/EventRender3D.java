package me.clientsiders.clientbase.listeners.render;

import me.clientsiders.clientbase.listeners.Event;

public final class EventRender3D extends Event {
    private final float partialTicks;

    public EventRender3D(float partialTicks) {
        this.partialTicks = partialTicks;
    }

    public float getPartialTicks() {
        return partialTicks;
    }
}
