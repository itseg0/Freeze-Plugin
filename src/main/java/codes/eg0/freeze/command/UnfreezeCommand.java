package codes.eg0.freeze.command;

import codes.eg0.freeze.settings.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommand;

import static codes.eg0.freeze.command.FreezeCommand.frozenList;

public class UnfreezeCommand extends SimpleCommand {

	public UnfreezeCommand() {
		super("unfreeze");
		setMinArguments(1);
		setPermission("freeze.unfreeze");
		setUsage("<target>");
		setDescription("Unfreezes the target.");
	}

	@Override
	protected void onCommand() {

		if (args.length == 0) {
			tell(Settings.Unfreeze.UNFREEZE_NOARGS);
			return;
		}

		Player target = Bukkit.getServer().getPlayer(args[0]);

		if (target == null) {
			tell("&cCould not find player " + args[0] + "&c!");
			return;
		}

		frozenList.remove(target.getName());


		Common.broadcast(Settings.Unfreeze.UNFREEZE_PREFIX + "" + Settings.Unfreeze.UNFREEZE_MESSAGE
				.replace("{Player}", target.getPlayer().getDisplayName()));


	}

}

