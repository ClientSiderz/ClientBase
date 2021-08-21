package me.clientsiders.clientbase.module.impl.render;

import com.google.common.eventbus.Subscribe;
import me.clientsiders.clientbase.Client;
import me.clientsiders.clientbase.listeners.render.EventRender2D;
import me.clientsiders.clientbase.module.Category;
import me.clientsiders.clientbase.module.Module;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import org.lwjgl.opengl.GL11;

public class HUD extends Module {
    FontRenderer fr = mc.fontRendererObj;
    public HUD() {
        super("HUD", 0, Category.RENDER);
        toggle();
    }

    @Subscribe
    public void onRender(EventRender2D event) {
        ScaledResolution sr = new ScaledResolution(mc);
        //WATERMARK
        Gui.drawRect(0, 0, 100, 16, 0x90000000);
        GL11.glPushMatrix();
        GL11.glScalef(1.5f, 1.5f, 1.5f);
        fr.drawStringWithShadow(Client.name, 1, 1, -1);
        GL11.glPopMatrix();
        fr.drawStringWithShadow(Client.version, 78, 1, -1);
        //ARRAYLIST
        int y = 2;
        for(Module m : Client.INSTANCE.moduleManager.getModules()) {
            if(m.isToggled()) {
                Gui.drawRect(sr.getScaledWidth() - fr.getStringWidth(m.getDisplayName()) - 3, y, sr.getScaledWidth(), y + 10, 0x90000000);
                fr.drawStringWithShadow(m.getDisplayName(), sr.getScaledWidth() - fr.getStringWidth(m.getDisplayName()) - 1, y + 1, -1);
                y += 10;
            }
        }
        sort();
    }

    public void sort() {
        Client.INSTANCE.moduleManager.getModules().sort((module1, module2) -> {
            if (mc.fontRendererObj.getStringWidth(module1.getDisplayName()) < mc.fontRendererObj.getStringWidth(module2.getDisplayName())) {
                return 1;
            } else if (mc.fontRendererObj.getStringWidth(module1.getDisplayName()) > mc.fontRendererObj.getStringWidth(module2.getDisplayName())) {
                return -1;
            } else {
                return 0;
            }
        });
    }
}
