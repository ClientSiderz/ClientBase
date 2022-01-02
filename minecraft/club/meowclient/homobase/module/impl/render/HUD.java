package club.meowclient.homobase.module.impl.render;

import com.google.common.eventbus.Subscribe;
import club.meowclient.homobase.Client;
import club.meowclient.homobase.listeners.render.EventRender2D;
import club.meowclient.homobase.module.Category;
import club.meowclient.homobase.module.Module;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import org.lwjgl.opengl.GL11;

public class HUD extends Module {
    FontRenderer fr = mc.fontRendererObj;
    public HUD() {
        super("HUD", 0, Category.RENDER);
        toggle();
    }

    @Subscribe
    public void onRender(EventRender2D event) {
        //Watermark
        GL11.glPushMatrix();
        GL11.glScalef(1.5f, 1.5f, 1.5f);
        fr.drawOutlinedString(Client.name, 3, 3, -1);
        GL11.glPopMatrix();

        //ArrayList
        int y = 2;
        for(Module m : Client.INSTANCE.moduleManager.getModules()) {
            if(m.isToggled()) {
                Gui.drawRect(event.getWidth() - fr.getStringWidth(m.getDisplayName()) - 3, y, event.getWidth(), y + 10, 0x90000000);
                fr.drawStringWithShadow(m.getDisplayName(), event.getWidth() - fr.getStringWidth(m.getDisplayName()) - 1, y + 1, -1);
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
