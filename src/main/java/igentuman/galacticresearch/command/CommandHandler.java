package igentuman.galacticresearch.command;

import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class CommandHandler {
	
	public static void registerCommands(FMLServerStartingEvent serverStartEvent) {
		serverStartEvent.registerServerCommand(new CommandResearch());
		serverStartEvent.registerServerCommand(new CommandAsteroids());
	}
}
