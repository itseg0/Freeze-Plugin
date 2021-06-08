package codes.eg0.freeze.command;

import codes.eg0.freeze.settings.Settings;
import org.mineacademy.fo.command.SimpleCommand;

public class AutobanCommand extends SimpleCommand {

	public AutobanCommand() {

		super("autoban");
		setMinArguments(0);
		setPermission("freeze.autoban");
		setUsage("");
		setDescription("Bans players who leave while Frozen.");
	}

	public static boolean toggle = true;

	@Override
	protected void onCommand() {

		if (toggle == true) {
			tell(Settings.AutoBan.AUTOBAN_PREFIX + "" + Settings.AutoBan.AUTOBAN_FALSE_MESSAGE);

			toggle = false;

		} else if (toggle == false) {

			tell(Settings.AutoBan.AUTOBAN_PREFIX + "" + Settings.AutoBan.AUTOBAN_TRUE_MESSAGE);

			toggle = true;

		}
	}

}

