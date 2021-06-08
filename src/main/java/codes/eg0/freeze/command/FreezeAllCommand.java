package codes.eg0.freeze.command;

import codes.eg0.freeze.settings.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommand;

import static codes.eg0.freeze.command.FreezeCommand.frozenList;

public class FreezeAllCommand extends SimpleCommand {

	public FreezeAllCommand() {

		super("freezeall");
		setMinArguments(0);
		setPermission("freeze.freezeall");
		setUsage("");
		setDescription("Freezes all players in place.");
	}


	@Override
	protected void onCommand() {

		for (Player onlinePlayers : Bukkit.getOnlinePlayers()) {

			String onlinePlayersNames = onlinePlayers.getName();

			frozenList.add(onlinePlayersNames);
			Common.broadcast(Settings.FreezeAll.FREEZEALL_PREFIX + "" + Settings.FreezeAll.FREEZEALL_MESSAGE);

			System.out.println(frozenList);

		}

	}
}
