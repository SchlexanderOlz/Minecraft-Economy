package com.pezibaer;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class BlockThings implements Listener {
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Material type = event.getBlock().getType();
        if (type == Material.TORCH) {
            Player player = event.getPlayer();
            player.sendMessage("Hello World!");
        }
    }
    @EventHandler
    public void onPighit(EntityDamageByEntityEvent hit) {
        EntityType mobtype = hit.getEntity().getType();
        World world = hit.getEntity().getWorld();

        if (mobtype == EntityType.PIG) {

            world.playSound(hit.getEntity().getLocation(), Sound.BLOCK_IRON_DOOR_CLOSE ,10, 1);
        }
    }
}
