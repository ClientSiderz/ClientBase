package club.meowclient.homobase.listeners;

public class EventKeyboard extends Event {
    public int keyCode;

    public EventKeyboard(int keyCode) {
        this.keyCode = keyCode;
    }

    public int getKeyCode() {
        return keyCode;
    }
}
