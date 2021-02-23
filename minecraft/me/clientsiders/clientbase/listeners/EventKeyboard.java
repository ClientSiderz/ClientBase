package me.clientsiders.clientbase.listeners;

import com.darkmagician6.eventapi.events.Event;

public class EventKeyboard implements Event {
    public int keyCode;

    public EventKeyboard(int keyCode) {
        this.keyCode = keyCode;
    }

    public int getKeyCode() {
        return keyCode;
    }
}
