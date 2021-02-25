package me.clientsiders.clientbase.module.impl.render;

import lemongui.clickgui.ClickGui;
import me.clientsiders.clientbase.module.Category;
import me.clientsiders.clientbase.module.Module;
import org.lwjgl.input.Keyboard;

public class ClickGUI extends Module {
    public ClickGui clickgui;

    public ClickGUI()
    {
        super("ClickGUI", Keyboard.KEY_RSHIFT, Category.RENDER);
    }

    @Override
    public void onEnable()
    {
        if(this.clickgui == null)
            this.clickgui = new ClickGui();

        mc.displayGuiScreen(this.clickgui);
        toggle();
        super.onEnable();
    }
}
