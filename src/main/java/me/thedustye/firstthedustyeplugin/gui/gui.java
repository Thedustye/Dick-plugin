package me.thedustye.firstthedustyeplugin.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class gui implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Inventory gui = Bukkit.createInventory(null,6*9,"§l隧三迪克服菜单");
        ItemStack diamond = new ItemStack(Material.DIAMOND);
        ItemMeta m = diamond.getItemMeta();
        m.setDisplayName("§l§b回工业区");//设置名字
        List<String> lore = new ArrayList<>();
        lore.add("§l这就是lore");
        lore.add("§l§a迪克快回城罢");
        m.setLore(lore);
        diamond.setItemMeta(m);
        gui.setItem(22,diamond);
        ItemStack gold = new ItemStack(Material.GOLD_INGOT);
        gui.setItem(23,gold);
        Player p = (Player) sender;
        p.openInventory(gui);
        return false;
    }
}
