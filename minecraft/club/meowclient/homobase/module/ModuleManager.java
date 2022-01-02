package club.meowclient.homobase.module;

import club.meowclient.homobase.module.impl.misc.Example;
import club.meowclient.homobase.module.impl.movement.Sprint;
import club.meowclient.homobase.module.impl.render.ClickGUI;
import club.meowclient.homobase.module.impl.render.HUD;

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
