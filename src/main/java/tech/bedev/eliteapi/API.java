package tech.bedev.eliteapi;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class API {

    JavaPlugin jplugin;

    public String msg(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    public void addCmd(String cmd, CommandExecutor executor) {
        jplugin.getCommand(cmd).setExecutor(executor);
    }

    public void addTab(String cmd, TabCompleter completer) {
        jplugin.getCommand(cmd).setTabCompleter(completer);
    }

    public void registerEvents(Listener listener) {
        jplugin.getServer().getPluginManager().registerEvents(listener, jplugin);
    }
}
