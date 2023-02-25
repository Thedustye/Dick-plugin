package me.thedustye.firstthedustyeplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

public class fish implements Listener {
    @EventHandler
    public void PlayerFishEvent(PlayerFishEvent fish){
        fish.getPlayer().sendMessage(ChatColor.YELLOW+"[隧三温馨提醒]"+ChatColor.GREEN+"你扔出了鱼竿");
        fish.setCancelled(true);
        fish.getPlayer().sendMessage(ChatColor.YELLOW+"[隧三温馨提醒]"+ChatColor.RED+"无法钓鱼，隧三已为您取消钓鱼");
    }

}
