package club.meowclient.homobase.module;

import club.meowclient.homobase.Client;
import net.minecraft.client.Minecraft;

public class Module {
    //Minecraft Variable
    protected Minecraft mc = Minecraft.getMinecraft();

    //Name Variables
    private String name, displayName;

    //Key Variable
    public int key;

    //Category Variable
    private Category category;

    //Toggle Variable
    private boolean toggled;

    //Constructor
    public Module(String name, int key, Category category) {
        this.name = name;
        this.key = key;
        this.category = category;
        toggled = false;
        setup();
    }

    //On Enable
    public void onEnable() {
        Client.INSTANCE.eventBus.register(this);
    }

    //On Disable
    public void onDisable() {
        Client.INSTANCE.eventBus.unregister(this);
    }

    //On Toggle
    public void onToggle() {}

    //Toggle Functions
    public void toggle() {
        toggled = !toggled;
        onToggle();
        if(toggled)
            onEnable();
        else
            onDisable();
    }

    public void setToggled(boolean toggled) {
        this.toggled = toggled;
        if(toggled)
            onEnable();
        else
            onDisable();
    }

    //Getters and Setters
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
}
