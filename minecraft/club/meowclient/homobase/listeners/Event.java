package club.meowclient.homobase.listeners;

public class Event {
    private boolean cancelled;

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public void setCancelled() {
        this.cancelled = true;
    }
}
