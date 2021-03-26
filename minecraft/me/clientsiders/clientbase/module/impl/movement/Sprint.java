package me.clientsiders.clientbase.module.impl.movement;
/*
    Made with IntelliJ IDEA

    Made by ClientSiders
    Made at 03/26/2021
*/

import com.darkmagician6.eventapi.EventTarget;
import me.clientsiders.clientbase.listeners.motion.EventUpdate;
import me.clientsiders.clientbase.module.Category;
import me.clientsiders.clientbase.module.Module;
import me.clientsiders.clientbase.utils.MovementUtils;

public class Sprint extends Module {
    public Sprint() {
        super("Sprint", 0, Category.MOVEMENT);
    }

    @EventTarget
    public void onUpdate(EventUpdate event) {
        if(MovementUtils.isMoving() && !mc.thePlayer.isCollidedHorizontally) {
            mc.thePlayer.setSprinting(true);
        }
    }
}
