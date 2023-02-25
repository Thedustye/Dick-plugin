package me.thedustye.firstthedustyeplugin;

import org.bukkit.OfflinePlayer;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.plugin.Plugin;

import java.util.List;

public class papi extends PlaceholderExpansion {

    @Override
    public boolean canRegister() {
        return true;
    }

    @Override
    public String getAuthor() {
        return "Thedustye";
    }

    @Override
    public String getIdentifier() {
        return "hellodick";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public  String onRequest(OfflinePlayer  player, String identifier){


        if (identifier.equals("see")){
            return "Hellodick is working now";
        }


        if (identifier.equals("placeholder2")){
            Plugin config = me.thedustye.firstthedustyeplugin.FirstThedustyePlugin.getProvidingPlugin(me.thedustye.firstthedustyeplugin.FirstThedustyePlugin.class);
            String head = "§e[Helloworld]§r";
            return config.getConfig().getString("string");
        }




        return null;
    }
}