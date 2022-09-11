package com.jack.functionality;

import com.jack.functionality.commands.HomeCommand;
import com.jack.functionality.commands.SetHomeCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommands();
    }


    private void registerCommands() {
        getCommand("sethome").setExecutor(new SetHomeCommand());
        getCommand("home").setExecutor(new HomeCommand());
    }

}
