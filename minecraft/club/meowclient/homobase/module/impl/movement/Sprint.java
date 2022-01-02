package club.meowclient.homobase.module.impl.movement;
/*
    Made with IntelliJ IDEA

    Made by ClientSiders
    Made at 03/26/2021
*/

import com.google.common.eventbus.Subscribe;
import club.meowclient.homobase.listeners.motion.EventUpdate;
import club.meowclient.homobase.module.Category;
import club.meowclient.homobase.module.Module;
import club.meowclient.homobase.utils.MovementUtil;

public class Sprint extends Module {
    public Sprint() {
        super("Sprint", 0, Category.MOVEMENT);
    }

    @Subscribe
    public void onUpdate(EventUpdate event) {
        if(MovementUtil.isMoving() && !mc.thePlayer.isCollidedHorizontally) {
            mc.thePlayer.setSprinting(true);
        }
    }
}
