package club.meowclient.homobase;

import club.meowclient.homobase.listeners.EventKeyboard;
import club.meowclient.homobase.module.Module;
import club.meowclient.homobase.module.ModuleManager;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import lemongui.settings.SettingsManager;
import org.lwjgl.opengl.Display;

public class Client {

    //Name and Version
    public static String name = "ClientBase", version = "9.6";

    //Instance
    public static Client INSTANCE = new Client();

    //Module Manager Variable
    public ModuleManager moduleManager;

    //Settings Manager Variable
    public SettingsManager settingsManager;

    //Event Bus Variable
    public EventBus eventBus;

    //On startup
    public void startClient() {
        eventBus = new EventBus();
        //Set game title
        Display.setTitle(name + " " + version);
        //Initializes Setting Manager
        settingsManager = new SettingsManager();
        //Initializes Module Manager
        moduleManager = new ModuleManager();
        //Registers the Event Bus
        eventBus.register(this);
    }

    //On shutdown
    public void stopClient() {
        //Unregisters the event bus
        eventBus.unregister(this);
    }

    //Module Keybind Reaction Event
    @Subscribe
    public void onKeyboard(EventKeyboard event) {
        for(Module m : moduleManager.getModules()) {
            if(event.getKeyCode() == m.getKey()) {
                m.toggle();
            }
        }
    }
}
