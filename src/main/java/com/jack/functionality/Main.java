package com.jack.functionality;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommands();
    }


    private void registerCommands() {
        //getCommand("").setExecutor(...);
    }

}
