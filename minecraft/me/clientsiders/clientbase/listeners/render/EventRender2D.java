package me.clientsiders.clientbase.listeners.render;

import me.clientsiders.clientbase.listeners.Event;

public final class EventRender2D extends Event {
    private final float width, height;
    public EventRender2D(float width, float height) {
        this.width = width;
        this.height = height;
    }
    public float getWidth() {
        return width;
    }
    public float getHeight() {
        return height;
    }
}
