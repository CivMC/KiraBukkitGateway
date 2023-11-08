package com.github.maxopoly.KiraBukkitGateway.listener;

import com.github.maxopoly.KiraBukkitGateway.KiraBukkitGatewayPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {

    @EventHandler
    public void onLogOff(PlayerQuitEvent event) {
        KiraBukkitGatewayPlugin.getInstance().getRabbit().sendPlayerLogoff(event.getPlayer());
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        if (event.hasChangedBlock()) {
            KiraBukkitGatewayPlugin.getInstance().getRabbit().sendPlayerUpdateLocation(event.getPlayer(), event.getTo());
        }
    }
}
