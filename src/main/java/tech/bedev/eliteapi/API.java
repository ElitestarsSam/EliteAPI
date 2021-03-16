package tech.bedev.eliteapi;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class API {

    static JavaPlugin jplugin;

    public static String msg(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    public static void addCmd(String cmd, CommandExecutor executor) {
        jplugin.getCommand(cmd).setExecutor(executor);
    }

    public static void addTab(String cmd, TabCompleter completer) {
        jplugin.getCommand(cmd).setTabCompleter(completer);
    }

    public static void registerEvents(Listener listener) {
        jplugin.getServer().getPluginManager().registerEvents(listener, jplugin);
    }

    public static void startup(String pluginName, String enablingDisabling, String discordUrl, String authors, String version, String pluginUrl, String wikiUrl) {
        Bukkit.getConsoleSender().sendMessage(msg(""));
        Bukkit.getConsoleSender().sendMessage(msg("&8[]=====[" + enablingDisabling + " " + pluginName + " &cfrom BE Development&8]=====[]"));
        Bukkit.getConsoleSender().sendMessage(msg("&8|"));
        Bukkit.getConsoleSender().sendMessage(msg("&8| &4Information:"));
        Bukkit.getConsoleSender().sendMessage(msg("&8|"));
        Bukkit.getConsoleSender().sendMessage(msg("&8|   &cName: " + pluginName));
        Bukkit.getConsoleSender().sendMessage(msg("&8|   &cDevelopers: " + authors));
        Bukkit.getConsoleSender().sendMessage(msg("&8|   &cVersion: " + version));
        Bukkit.getConsoleSender().sendMessage(msg("&8|   &cPlugin: " + pluginUrl));
        Bukkit.getConsoleSender().sendMessage(msg("&8|"));
        Bukkit.getConsoleSender().sendMessage(msg("&8| &4Support:"));
        Bukkit.getConsoleSender().sendMessage(msg("&8|"));
        Bukkit.getConsoleSender().sendMessage(msg("&8|   &cWiki: " + wikiUrl));
        Bukkit.getConsoleSender().sendMessage(msg("&8|   &cDiscord: " + discordUrl));
        Bukkit.getConsoleSender().sendMessage(msg("&8|"));
        Bukkit.getConsoleSender().sendMessage(msg("&8[]===============================================[]"));
        Bukkit.getConsoleSender().sendMessage(msg(""));
    }
}
