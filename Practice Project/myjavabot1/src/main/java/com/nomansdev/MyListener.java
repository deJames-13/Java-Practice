package com.nomansdev;

import javax.annotation.Nonnull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MyListener extends ListenerAdapter {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyListener.class);
    static final String PREFIX = Config.getKey("prefix");
    static final String OWNER_ID = Config.getKey("OWNER_ID");

    @Override
    public void onReady(@Nonnull ReadyEvent r) {
        LOGGER.info("{} is ready! ", r.getJDA().getSelfUser().getAsTag());
        // LOGGER.info(r.getJDA().getGatewayIntents().toString());

    }

    @Override
    public void onMessageReceived(@Nonnull MessageReceivedEvent e) {
        Message ctx = e.getMessage();
        String rawMessage = ctx.getContentRaw();
        User author = e.getAuthor();
        MessageChannel channel = e.getChannel();

        if (author.isBot())
            return;
        System.out.printf("%s :%s \n", author.getAsTag(), rawMessage);

        if (rawMessage.startsWith(PREFIX + "shutdown") && author.getId().equals(OWNER_ID)) {
            LOGGER.info("Shutting Down...");
            e.getJDA().shutdown();
        }
        if (rawMessage.startsWith(PREFIX + "ping")) {
            LOGGER.info("Command ping used!");
            channel.sendMessage("Pong!" + author.getAsMention()).queue();

        }

    }
}
