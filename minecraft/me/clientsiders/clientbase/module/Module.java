package me.clientsiders.clientbase.module;

import me.clientsiders.clientbase.Client;
import net.minecraft.client.Minecraft;

public class Module {
    //MINECRAFT VARIABLE SOO YOU CAN EASIER DO SHIT
    protected Minecraft mc = Minecraft.getMinecraft();

    //NAME AND DISPLAY NAME VARIABLE
    private String name, displayName;

    //KEY VARIABLE
    public int key;

    //CATEGORY VARIABLE
    private Category category;

    //TOGGLED VARIABLE
    private boolean toggled;

    //CONSTRUCTOR
    public Module(String name, int key, Category category) {
        this.name = name;
        this.key = key;
        this.category = category;
        toggled = false;
        setup();
    }

    //ON ENABLE
    public void onEnable() {
        Client.INSTANCE.eventManager.register(this);
    }

    //ON DISABLE
    public void onDisable() {
        Client.INSTANCE.eventManager.unregister(this);
    }

    //ON TOGGLE
    public void onToggle() {}

    //JUST TOGGLE
    public void toggle() {
        toggled = !toggled;
        onToggle();
        if(toggled)
            onEnable();
        else
            onDisable();
    }

    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getKey() {
        return key;
    }
    public void setKey(int key) {
        this.key = key;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public boolean isToggled() {
        return toggled;
    }
    public String getDisplayName() {
        return displayName == null ? name : displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public void setup() {}

    public void setToggled(boolean toggled) {
        this.toggled = toggled;
    }
}
