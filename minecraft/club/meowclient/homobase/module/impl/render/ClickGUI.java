package club.meowclient.homobase.module.impl.render;

import lemongui.clickgui.ClickGui;
import club.meowclient.homobase.module.Category;
import club.meowclient.homobase.module.Module;
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
