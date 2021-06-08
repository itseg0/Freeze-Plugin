package codes.eg0.freeze;

import codes.eg0.freeze.command.*;
import codes.eg0.freeze.listeners.EventListener;
import codes.eg0.freeze.settings.Settings;
import org.mineacademy.fo.plugin.SimplePlugin;
import org.mineacademy.fo.settings.YamlStaticConfig;

import java.util.Arrays;
import java.util.List;

public class FreezePlugin extends SimplePlugin {

	@Override
	protected void onPluginStart() {

		Filter.inject();

		registerCommand(new FreezeAllCommand());
		registerCommand(new FreezeCommand());
		registerCommand(new UnfreezeCommand());
		registerCommand(new AutobanCommand());
		registerCommand(new FrozenCommand());

		registerEvents(new EventListener());

	}

	@Override
	public List<Class<? extends YamlStaticConfig>> getSettings() {
		return Arrays.asList(Settings.class);
	}
}
