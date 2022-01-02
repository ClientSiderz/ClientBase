package club.meowclient.homobase.listeners.render;

import club.meowclient.homobase.listeners.Event;

public final class EventRender3D extends Event {
    private final float partialTicks;

    public EventRender3D(float partialTicks) {
        this.partialTicks = partialTicks;
    }

    public float getPartialTicks() {
        return partialTicks;
    }
}
