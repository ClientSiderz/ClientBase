package me.clientsiders.clientbase.module;

import me.clientsiders.clientbase.module.impl.misc.Example;
import me.clientsiders.clientbase.module.impl.movement.Sprint;
import me.clientsiders.clientbase.module.impl.render.ClickGUI;
import me.clientsiders.clientbase.module.impl.render.HUD;

import java.util.ArrayList;

public class ModuleManager {
    //Module Array
    private ArrayList<Module> modules = new ArrayList<Module>();

    //Module Registration
    public ModuleManager() {
        modules.add(new HUD());
        modules.add(new Example());
        modules.add(new ClickGUI());
        modules.add(new Sprint());
    }

    //Get Module by Name
    public Module getModule(final String name) {
        for (final Module m : modules) {
            if (!m.getName().equalsIgnoreCase(name)) {
                continue;
            }
            return m;
        }
        return null;
    }
    //Get All Modules
    public ArrayList<Module> getModules() {
        return modules;
    }

    //Get Modules in a Category
    public ArrayList<Module> getModulesInCategory(Category categoryIn){
        ArrayList<Module> mods = new ArrayList<Module>();
        for(Module m : this.modules){
            if(m.getCategory() == categoryIn)
                mods.add(m);
        }
        return mods;
    }
}
