package com.perseus13th;

import java.util.*;

import javax.annotation.Nonnull;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.guild.GuildReadyEvent;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.commands.build.SlashCommandData;

public class CommandManager extends BotListener {

    List<Long> guildIdList = new ArrayList<>();

    @Override
    public void onGuildReady(@Nonnull GuildReadyEvent event) {
        Guild guild = event.getGuild();
        long guildId = guild.getIdLong();
        if (guildIdList.contains(guildId))
            return;

        guild.updateCommands().addCommands(allCommands()).queue();
        guildIdList.add(guildId);
    }

    private List<SlashCommandData> allCommands() {
        List<SlashCommandData> commandDatas = new ArrayList<>();

        // Quote Command
        SlashCommandData quote = Commands.slash("quote", "I'll quote anything you say.");
        quote.addOption(OptionType.STRING, "message", "Add some wise words.", true);
        quote.addOption(OptionType.STRING, "author", "Who said this.", false);
        commandDatas.add(quote);

        // Ping
        SlashCommandData ping = Commands.slash("pingme", "Ping Me!.");
        commandDatas.add(ping);

        return commandDatas;
    }

}
