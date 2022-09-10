package com.perseus13th;

import javax.annotation.Nonnull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * BotListener
 */
public class BotListener extends ListenerAdapter {

    public final Logger logger = LoggerFactory.getLogger("Bot Listener");
    protected final String OWNER_ID = Config.getValue("owner_id");
    protected final String PREFIX = Config.getValue("prefix");

    @Override
    public void onReady(@Nonnull ReadyEvent event) {
        logger.info("{} is ready!", event.getJDA().getSelfUser().getName());
    }
}