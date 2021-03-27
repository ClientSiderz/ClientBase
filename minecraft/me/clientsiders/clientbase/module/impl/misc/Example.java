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
    public void onUpdate(EventUpdate event) {
        //PUT SHIT HERE
    }

    //MOTION UPDATE
    @EventTarget
    public void onMotion(EventMotionUpdate event) {
        switch(event.getEventType()) {
            // PRE MOTION
            case PRE: {
                //PUT SHIT HERE
                break;
            }
            // POST MOTION
            case POST: {
                //PUT SHIT HERE
            }
        }
    }
    //2D RENDER EVENT
    @EventTarget
    public void onRender(EventRender2D event) {
        //PUT SHIT HERE
    }

    //3D RENDER EVENT
    @EventTarget
    public void onRender(EventRender3D event) {
        //PUT SHIT HERE
    }

    //SEND PACKET EVENT
    @EventTarget
    public void onPacket(EventSendPacket event) {
        //PUT SHIT HERE

        //TARGET A PACKET
        //if(event.getPacket() instanceof <Any Packet>) {
            //PUT SHIT HERE

            //CANCEL A PACKET
            //event.setCancelled(true);

            //SEND A PACKET
            //event.setPacket(new <Any Packet>());
        //}

    }

    //RECEIVE PACKET EVENT
    @EventTarget
    public void onPacket(EventReceivePacket event) {
        //PUT SHIT HERE

        //TARGET A PACKET
//        if(event.getPacket() instanceof <Any Packet>) {
        //PUT SHIT HERE

        //CANCEL A PACKET
        //event.setCancelled(true);
    }

    //KEYBOARD EVENT
    @EventTarget
    public void onKey(EventKeyboard event) {
        //GET A KEY
        //if(event.getKeyCode() == <Any Key>) {
            //PUT SHIT HERE
        //}
    }

    //WHEN YOU ENABLE THE MODULE
    @Override
    public void onEnable() {
        super.onEnable();
        //PUT SHIT HERE
    }
    //WHEN YOU DISABLE THE MODULE
    @Override
    public void onDisable() {
        super.onDisable();
        //PUT SHIT HERE
    }
}
