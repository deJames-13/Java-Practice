package com.nomansdev;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.guild.GuildReadyEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.commands.build.SlashCommandData;

public class MyCommandManager extends ListenerAdapter {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyCommandManager.class);
    List<Long> guildIDS = new ArrayList<>();

    @Override
    public void onSlashCommandInteraction(@Nonnull SlashCommandInteractionEvent e) {
        String command = e.getName();
        User user = e.getUser();
        String msg = e.getOption("msg").getAsString();
        if (command.equals("quote")) {
            String quote = String.format("%s said \"%s\"", user.getName(), msg);
            e.getChannel().sendMessage(quote).queue();
            ;
        }
    }

    @Override
    public void onGuildReady(@Nonnull GuildReadyEvent event) {
        Guild guildInfo = event.getGuild();
        long GUILD_ID = guildInfo.getIdLong();

        if (guildIDS.contains(GUILD_ID))
            return;

        List<SlashCommandData> commandDatas = new ArrayList<>();

        SlashCommandData quote = Commands.slash("quote", "Quote something");
        quote.addOption(OptionType.STRING, "msg", "add your quote here", true);
        commandDatas.add(quote);

        event.getGuild().updateCommands().addCommands(commandDatas).queue();
        guildIDS.add(GUILD_ID);
        LOGGER.trace("%s was added to list with id %d", guildInfo.getName(), GUILD_ID);

    }

}
