package codes.eg0.freeze.listeners;

import codes.eg0.freeze.command.AutobanCommand;
import codes.eg0.freeze.command.FreezeCommand;
import codes.eg0.freeze.settings.Settings;
import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;


public class EventListener implements Listener {


	@EventHandler
	public void onMove(PlayerMoveEvent event) {

		if ((!(FreezeCommand.frozenList.contains(event.getPlayer().getName())))) {
			return;

		} else {
			event.setCancelled(true);

		}
	}

	@EventHandler
	public void onDisconnect(PlayerQuitEvent event) {
		System.out.println(AutobanCommand.toggle);

		if (FreezeCommand.frozenList.contains(event.getPlayer().getName()) && AutobanCommand.toggle == true) {

			String playerName = event.getPlayer().getName();

			Bukkit.getBanList(BanList.Type.NAME).addBan(playerName, Settings.AutoBan.AUTOBAN_BAN_MESSAGE, null, null);

		}

	}
}




