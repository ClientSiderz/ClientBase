package me.clientsiders.clientbase.module;

import me.clientsiders.clientbase.module.impl.misc.Example;
import me.clientsiders.clientbase.module.impl.render.HUD;

import java.util.ArrayList;

public class ModuleManager {
    //MODULES VARIABLE
    private ArrayList<Module> modules = new ArrayList<Module>();

    //REGISTER MODULES
    public ModuleManager() {
        modules.add(new HUD());
        modules.add(new Example());
    }

    //GET MODULE BY NAME
    public Module getModule(final String name) {
        for (final Module m : modules) {
            if (!m.getName().equalsIgnoreCase(name)) {
                continue;
            }
            return m;
        }
        return null;
    }
    //GET MODULES
    public ArrayList<Module> getModules() {
        return modules;
    }

    //GET MODULES IN CATEGORY
    public ArrayList<Module> getModulesInCategory(Category categoryIn){
        ArrayList<Module> mods = new ArrayList<Module>();
        for(Module m : this.modules){
            if(m.getCategory() == categoryIn)
                mods.add(m);
        }
        return mods;
    }
}
