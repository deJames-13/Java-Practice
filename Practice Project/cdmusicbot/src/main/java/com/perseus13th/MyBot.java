package com.perseus13th;

import java.util.Arrays;

import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

public class MyBot {
    private final static String BOT_TOKEN = Config.getValue("TOKEN");
    private static JDA builder;

    public static final GatewayIntent[] INTENTS = {
            GatewayIntent.MESSAGE_CONTENT
    };

    public static void main(String[] args) throws Exception {
        builder = JDABuilder.createDefault(BOT_TOKEN)
                .setStatus(OnlineStatus.ONLINE)
                .setActivity(Activity.watching("CornHub"))
                .enableIntents(Arrays.asList(INTENTS))
                .enableCache(CacheFlag.VOICE_STATE)
                .build();
        builder.addEventListener(new BotListener(), new CommandManager(), new BotCommands());

    }

}
