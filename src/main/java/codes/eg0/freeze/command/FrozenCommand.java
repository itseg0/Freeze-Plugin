package codes.eg0.freeze.command;

import codes.eg0.freeze.settings.Settings;
import org.mineacademy.fo.command.SimpleCommand;

import static codes.eg0.freeze.command.FreezeCommand.frozenList;

public class FrozenCommand extends SimpleCommand {


	public FrozenCommand() {

		super("frozen");
		setMinArguments(0);
		setPermission("freeze.frozen");
		setUsage("");
		setDescription("Shows you a list of all of the Frozen players.");
	}


	@Override
	protected void onCommand() {

		tell(Settings.Frozen.FROZEN_PREFIX + "" + Settings.Frozen.FROZEN_MESSAGE + "" + frozenList);

	}
}
