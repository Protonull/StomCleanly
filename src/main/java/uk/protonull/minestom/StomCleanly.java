package uk.protonull.minestom;

import net.minestom.server.MinecraftServer;
import net.minestom.server.extensions.Extension;
import uk.protonull.minestom.commands.StopCommand;

public final class StomCleanly extends Extension {

    private static final StopCommand STOP_COMMAND = new StopCommand();

    @Override
    public void initialize() {
        MinecraftServer.getCommandManager().register(STOP_COMMAND);
    }

    @Override
    public void terminate() {
        MinecraftServer.getCommandManager().unregister(STOP_COMMAND);
    }

}
