package com.nomansdev;

import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class MyBot {
    private final static String BOT_TOKEN = Config.getKey("TOKEN");
    private static JDA builder;

    public static void main(String[] args) throws Exception {
        builder = JDABuilder.createDefault(BOT_TOKEN)
                .setStatus(OnlineStatus.ONLINE)
                .setActivity(Activity.watching("CornHub"))
                .enableIntents(GatewayIntent.MESSAGE_CONTENT)
                .build();
        builder.addEventListener(new MyListener(), new MyCommandManager());

    }

}
