package club.meowclient.homobase.listeners.motion;

import club.meowclient.homobase.listeners.Event;
import club.meowclient.homobase.listeners.EventType;

public class EventMotionUpdate extends Event {
    private double x;
    private double y;
    private double z;

    private float yaw;
    private float pitch;

    public boolean onGround;

    public EventType eventType;

    public EventMotionUpdate(double x, double y, double z, float yaw, float pitch, boolean onGround, EventType eventType) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.yaw = yaw;
        this.pitch = pitch;
        this.onGround = onGround;
        this.eventType = eventType;
    }

    public EventMotionUpdate(EventType eventType) {
        this.eventType = eventType;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public float getYaw() {
        return yaw;
    }

    public void setYaw(float yaw) {
        this.yaw = yaw;
    }

    public float getPitch() {
        return pitch;
    }

    public void setPitch(float pitch) {
        this.pitch = pitch;
    }

    public EventType getEventType() {
        return eventType;
    }
}
