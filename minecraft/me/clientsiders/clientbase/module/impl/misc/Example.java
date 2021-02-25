package me.clientsiders.clientbase.module.impl.misc;

import com.darkmagician6.eventapi.EventTarget;
import lemongui.settings.Setting;
import me.clientsiders.clientbase.Client;
import me.clientsiders.clientbase.listeners.EventKeyboard;
import me.clientsiders.clientbase.listeners.EventType;
import me.clientsiders.clientbase.listeners.motion.EventMotionUpdate;
import me.clientsiders.clientbase.listeners.motion.EventUpdate;
import me.clientsiders.clientbase.listeners.packet.EventReceivePacket;
import me.clientsiders.clientbase.listeners.packet.EventSendPacket;
import me.clientsiders.clientbase.listeners.render.EventRender2D;
import me.clientsiders.clientbase.listeners.render.EventRender3D;
import me.clientsiders.clientbase.module.Category;
import me.clientsiders.clientbase.module.Module;
import org.lwjgl.input.Keyboard;

import java.util.ArrayList;

public class Example extends Module {
    public Example() {
        super("Example", Keyboard.KEY_F, Category.MISC);
        //SETTINGS
        ArrayList<String> options = new ArrayList<>();
        options.add("DefaultOption");
        options.add("Option2");
        options.add("Option3");
        Client.INSTANCE.settingsManager.rSetting(new Setting("OptionSelector", this, "DefaultOption", options));
        Client.INSTANCE.settingsManager.rSetting(new Setting("BooleanOption", this, false));
        Client.INSTANCE.settingsManager.rSetting(new Setting("SliderOptionInt", this, 255, 0, 255, true));
        Client.INSTANCE.settingsManager.rSetting(new Setting("SliderOptionDouble", this, 10, 0, 20, false));

    }

    //UPDATE EVENT
    @EventTarget
    public void onUpdate(EventUpdate event) {}

    //MOTION UPDATE
    @EventTarget
    public void onMotion(EventMotionUpdate event) {
        // PRE MOTION
        if(event.getEventType() == EventType.PRE) {

            //PUT SHIT HERE
        }
        // POST MOTION
        if(event.getEventType() == EventType.POST) {

            //PUT SHIT HERE
        }
    }
    //2D RENDER EVENT
    @EventTarget
    public void onRender(EventRender2D event) {}

    //3D RENDER EVENT
    @EventTarget
    public void onRender(EventRender3D event) {}

    //SEND PACKET EVENT
    @EventTarget
    public void onPacket(EventSendPacket event) {}

    //RECEIVE PACKET EVENT
    @EventTarget
    public void onPacket(EventReceivePacket event) {}

    //KEYBOARD EVENT
    @EventTarget
    public void onKey(EventKeyboard event) {}

    //WHEN YOU ENABLE THE MODULE
    @Override
    public void onEnable() {
        super.onEnable();
    }
    //WHEN YOU DISABLE THE MODULE
    @Override
    public void onDisable() {
        super.onDisable();
    }
}
