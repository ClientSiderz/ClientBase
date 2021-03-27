package me.clientsiders.clientbase;

import lemongui.settings.SettingsManager;
import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;
import me.clientsiders.clientbase.listeners.EventKeyboard;
import me.clientsiders.clientbase.module.Module;
import me.clientsiders.clientbase.module.ModuleManager;
import org.lwjgl.opengl.Display;

public class Client {

    //NAME AND VERSION VARIABLES
    public static String name = "ClientBase", version = "1.0.0";

    //INSTANCE
    public static Client INSTANCE = new Client();

    //MODULE MANAGER VARIABLE
    public ModuleManager moduleManager;

    //SETTINGS MANAGER VARIABLE
    public SettingsManager settingsManager;

    //EVENT MANAGER VARIABLE
    public EventManager eventManager;

    //ON STARTUP
    public void startClient() {
        //SET TITLE
        Display.setTitle(name + " " + version);
        //INITIALIZES THE SETTINGS MANAGER
        settingsManager = new SettingsManager();
        //INITIALIZES THE MODULE MANAGER
        moduleManager = new ModuleManager();
        //REGISTER THE EVENT MANAGER
        eventManager.register(this);
    }

    //ON SHUTDOWN
    public void stopClient() {
        //UNREGISTER THE EVENT MANAGER
        eventManager.unregister(this);
    }

    //WHEN YOU PRESS ON THE MODULE IT WILL ENABLE IT
    @EventTarget
    public void onKey(EventKeyboard event) {
        for(Module m : moduleManager.getModules()) {
            if(event.getKeyCode() == m.getKey()) {
                m.toggle();
            }
        }
    }
}
