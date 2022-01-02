package club.meowclient.homobase.listeners.render;

import club.meowclient.homobase.listeners.Event;

public final class EventRender2D extends Event {
    private final int width, height;
    public EventRender2D(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}
