package me.clientsiders.clientbase.module.impl.misc;

import com.google.common.eventbus.Subscribe;
import lemongui.settings.Setting;
import me.clientsiders.clientbase.Client;
import me.clientsiders.clientbase.listeners.EventKeyboard;
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

    //Update Event
    @Subscribe
    public void onUpdate(EventUpdate event) {
        //Put Stuff here
    }

    //Motion Update
    @Subscribe
    public void onMotion(EventMotionUpdate event) {
        switch(event.getEventType()) {
            //Pre Motion
            case PRE: {
                //Put Stuff here
                break;
            }
            //Post Motion
            case POST: {
                //Put Stuff here
            }
        }
    }
    //2D Render Event
    @Subscribe
    public void onRender(EventRender2D event) {
        //Put Stuff here
    }

    //3D Render Event
    @Subscribe
    public void onRender(EventRender3D event) {
        //Put Stuff here
    }

    //Send Packet Event
    @Subscribe
    public void onPacket(EventSendPacket event) {
        //Put Stuff here

        //Targets A Client Packet
        //if(event.getPacket() instanceof <Any Packet>) {
            //Put Stuff here

            //Cancels the targeted Client Packet
            //event.setCancelled(true);

            //Send A Packet
            //event.setPacket(new <Any Packet>());
        //}

    }

    //Receive Packet Event
    @Subscribe
    public void onPacket(EventReceivePacket event) {
        //Put Stuff here

        //Targets a Server Packet
//        if(event.getPacket() instanceof <Any Packet>) {
        //Put Stuff here

        //Cancels the targeted Server Packet
        //event.setCancelled(true);
    }

    //Keyboard Event
    @Subscribe
    public void onKey(EventKeyboard event) {
        //Get a Key
        //if(event.getKeyCode() == <Any Key>) {
            //Put stuff here
        //}
    }

    //When you enable the module
    @Override
    public void onEnable() {
        super.onEnable();
        //Put stuff here
    }
    //When you disable the module
    @Override
    public void onDisable() {
        super.onDisable();
        //Put stuff here
    }
}
