package com.mvplugin.core.exceptions;

import com.dumptruckman.minecraft.pluginbase.messages.BundledMessage;
import org.jetbrains.annotations.NotNull;

public class WorldCreationException extends MultiverseException {

    public WorldCreationException(@NotNull final BundledMessage languageMessage) {
        super(languageMessage);
    }

    public WorldCreationException(@NotNull final BundledMessage languageMessage, @NotNull final Throwable throwable) {
        super(languageMessage, throwable);
    }

    public WorldCreationException(@NotNull final BundledMessage languageMessage, @NotNull final MultiverseException mvException) {
        super(languageMessage, mvException);
    }

    public WorldCreationException(@NotNull final MultiverseException e) {
        super(e);
    }
}
