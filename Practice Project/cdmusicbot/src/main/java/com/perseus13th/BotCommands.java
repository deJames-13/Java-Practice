package com.perseus13th;

import java.awt.Color;

import javax.annotation.Nonnull;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;

public class BotCommands extends CommandManager {

    @Override
    public void onSlashCommandInteraction(@Nonnull SlashCommandInteractionEvent event) {
        String cmdName = event.getName();
        User user = event.getUser();
        if (cmdName.equals("pingme"))
            event.reply("***Pong!!***").queue();
        if (cmdName.equals("quote")) {
            event.deferReply().queue();
            String msg = event.getOption("message").getAsString();
            OptionMapping author = event.getOption("author");
            String quoted = String.format(">>> *\"%s\"*", msg);

            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle(quoted);
            embed.setColor(Color.WHITE);
            // embed.setAuthor(String.format("*%s*", author != null ? author.getAsString()
            // :user.getName()));
            embed.setFooter(String.format("*%s*", author != null ? author.getAsString() : user.getName()));
            event.replyEmbeds(embed.build()).queue();

        }

    }

}
