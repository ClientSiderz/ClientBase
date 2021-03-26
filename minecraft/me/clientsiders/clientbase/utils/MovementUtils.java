package me.clientsiders.clientbase.utils;
/*
    Made with IntelliJ IDEA

    Made by ClientSiders
    Made at 03/26/2021
*/

import net.minecraft.client.Minecraft;

public class MovementUtils {
    public static boolean isMoving() {
        if(Minecraft.getMinecraft().gameSettings.keyBindForward.isKeyDown()
                || Minecraft.getMinecraft().gameSettings.keyBindBack.isKeyDown()
                || Minecraft.getMinecraft().gameSettings.keyBindRight.isKeyDown()
                || Minecraft.getMinecraft().gameSettings.keyBindLeft.isKeyDown()) {
            return true;
        }
        return false;
    }
}
