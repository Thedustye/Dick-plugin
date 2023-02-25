package me.thedustye.firstthedustyeplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.ArrayList;
import java.util.List;

public class maincommand implements CommandExecutor, TabExecutor {
    @Override
    public boolean onCommand( CommandSender sender, Command command,String label, String[] args) {
        if (args.length==0)//当玩家输入.helloworld
        {
            sender.sendMessage("你只输入了/helloworld");
        }
        else if (args.length==1)//当玩家输入.helloworld xxx
        {
            String arg_to_string=args[0];
            if (arg_to_string.equals("服务器公告"))
            {
                sender.sendMessage("服务器公告：一枚迪克的服务器");
            }
            else if (arg_to_string.equals("服务器ip"))
            {
                sender.sendMessage("服务器ip:mc.suidaosan.icu");
            }
            else
            {
                sender.sendMessage("语法错误");
            }
        }
        else {
            sender.sendMessage("语法错误");
        }
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias,String[] args) {
        if (args.length==1)
        {
            List<String> list = new ArrayList<>();
            list.add("服务器公告");
            list.add("服务器ip");
            return list;
        }
        return null;
    }
}
