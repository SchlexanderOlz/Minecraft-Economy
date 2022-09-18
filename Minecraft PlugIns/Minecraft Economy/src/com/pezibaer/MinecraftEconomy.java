package com.pezibaer;


import com.pezibaer.commands.Heal;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Chest;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class MinecraftEconomy extends JavaPlugin {
    private static MinecraftEconomy instance;

    @Override
    public void onEnable() {
        instance = this;

        System.out.println("Hello world!");

        Bukkit.getPluginManager().registerEvents(new BlockThings(), this);

        getCommand("heal").setExecutor(new Heal());

        World world = Bukkit.getWorld("world");
        Location chestloc = new Location(world, -60, 73, 217);
        chestloc.getBlock().setType(Material.CHEST);
        Chest chest = (Chest) chestloc.getBlock().getState();
        Inventory inventory = chest.getInventory();
        ItemStack Paper = new ItemStack(Material.PAPER, 1);
        ItemMeta PaperMeta = Paper.getItemMeta();
        PaperMeta.setDisplayName("The Free Market");
        Paper.setItemMeta(PaperMeta);
        inventory.setItem(13, Paper);



    }
    @Override
    public void onDisable() {
        System.out.println("Shutting down...");
    }

    public static MinecraftEconomy getInstance() {
        return instance;
    }

}
