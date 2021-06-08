package codes.eg0.freeze.command;

import codes.eg0.freeze.settings.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommand;

import java.util.ArrayList;

public class FreezeCommand extends SimpleCommand {


	public FreezeCommand() {
		super("freeze");
		setMinArguments(2);
		setPermission("freeze.freeze");
		setUsage("<target> <reason>");
		setDescription("Freezes the target in place.");
	}


	public static ArrayList<String> frozenList = new ArrayList<>();

	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event) {
		Player player = event.getPlayer();
		if (frozenList.contains(event.getPlayer().getName())) {
			event.setTo(event.getFrom());

		}
	}


	@Override
	protected void onCommand() {

		if (args.length == 0) {
			tell(Settings.Freeze.FREEZE_NOARGS);
			return;
		}
		if (args.length == 1) {
			tell(Settings.Freeze.FREEZE_ONEARG);
		}

		Player target = Bukkit.getServer().getPlayer(args[0]);

		if (target == null) {
			tell("&cCould not find player " + args[0] + "&c!");
			return;
		}

		frozenList.add(target.getName());


		Common.broadcast(Settings.Freeze.FREEZE_PREFIX + "" + Settings.Freeze.FREEZE_MESSAGE
				.replace("{Player}", target.getPlayer().getDisplayName())
				.replace("{Reason}", args[1]));
		
	}
}
