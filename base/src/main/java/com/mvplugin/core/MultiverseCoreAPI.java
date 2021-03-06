package com.mvplugin.core;

import com.mvplugin.core.util.BlockSafety;
import com.mvplugin.core.util.SafeTeleporter;
import org.jetbrains.annotations.NotNull;

public interface MultiverseCoreAPI {

    /**
     * Gets the Multiverse world manager.
     *
     * The world manager allows you to perform various tasks related to Minecraft worlds.
     *
     * @return {@link WorldManager}.
     */
    @NotNull
    public WorldManager getWorldManager();

    /**
     * Gets the event processor for Multiverse-Core.
     *
     * All server implementation events that Multiverse-Core cares about are passed to this processor.
     *
     * This is mostly used internally by Multiverse only.
     *
     * @return the Multiverse-Core event processor.
     */
    @NotNull
    public EventProcessor getEventProcessor();

    @NotNull
    public SafeTeleporter getSafeTeleporter();

    @NotNull
    public BlockSafety getBlockSafety();
}
