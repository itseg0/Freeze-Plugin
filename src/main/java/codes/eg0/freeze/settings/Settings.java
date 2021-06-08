package codes.eg0.freeze.settings;

import org.mineacademy.fo.settings.SimpleSettings;

public class Settings extends SimpleSettings {
	@Override
	protected int getConfigVersion() {
		return 1;
		

	}

	public static class Freeze {

		public static String FREEZE_PREFIX;
		public static String FREEZE_MESSAGE;
		public static String FREEZE_NOARGS;
		public static String FREEZE_ONEARG;

		private static void init() {

			pathPrefix("Freeze");

			FREEZE_PREFIX = getString("Freeze_Prefix");
			FREEZE_MESSAGE = getString("Freeze_Message");
			FREEZE_NOARGS = getString("Freeze_NoArgs");
			FREEZE_ONEARG = getString("Freeze_OneArg");

		}
	}

	public static class Unfreeze {
		public static String UNFREEZE_NOARGS;
		public static String UNFREEZE_PREFIX;
		public static String UNFREEZE_MESSAGE;


		private static void init() {

			pathPrefix("Unfreeze");

			UNFREEZE_NOARGS = getString("Unfreeze_NoArgs");
			UNFREEZE_PREFIX = getString("Unfreeze_Prefix");
			UNFREEZE_MESSAGE = getString("Unfreeze_Message");

		}

	}

	public static class Frozen {

		public static String FROZEN_PREFIX;
		public static String FROZEN_MESSAGE;


		private static void init() {

			pathPrefix("Frozen");

			FROZEN_PREFIX = getString("Frozen_Prefix");
			FROZEN_MESSAGE = getString("Frozen_Message");


		}
	}

	public static class FreezeAll {

		public static String FREEZEALL_MESSAGE;
		public static String FREEZEALL_PREFIX;


		private static void init() {

			pathPrefix("FreezeAll");

			FREEZEALL_PREFIX = getString("FreezeAll_Prefix");
			FREEZEALL_MESSAGE = getString("FreezeAll_Message");

		}
	}

	public static class AutoBan {

		public static String AUTOBAN_TRUE_MESSAGE;
		public static String AUTOBAN_FALSE_MESSAGE;
		public static String AUTOBAN_PREFIX;
		public static String AUTOBAN_BAN_MESSAGE;


		private static void init() {

			pathPrefix("AutoBan");

			AUTOBAN_PREFIX = getString("AutoBan_Prefix");
			AUTOBAN_TRUE_MESSAGE = getString("AutoBan_True_Message");
			AUTOBAN_FALSE_MESSAGE = getString("AutoBan_False_Message");
			AUTOBAN_BAN_MESSAGE = getString("AutoBan_Ban_Message");

		}
	}
}
