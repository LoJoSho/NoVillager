package me.novillager;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoVillager extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin Enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onVillagerSpawn(EntitySpawnEvent event) {
        Entity entity = event.getEntity();
        if (entity.getType() == EntityType.VILLAGER) {
            event.setCancelled(true);
        }
    }
}
