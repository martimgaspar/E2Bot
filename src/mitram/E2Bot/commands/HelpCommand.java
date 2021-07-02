package mitram.E2Bot.commands;

import java.awt.Color;

import mitram.E2Bot.E2Bot;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class HelpCommand extends ListenerAdapter{
    
    EmbedBuilder helpEmbed = new EmbedBuilder().setColor(Color.PINK)
        .setTitle("Command Help")
        .setDescription("Prefix - ]")
        .addField("Basic Commands", "Ping, Flip - Flips a coin, Avatar - takes the avatar of a tagged user", true)
        .addField("Music Commands", "WIP", false)
        .setFooter("If you need any other help @Xounaut#0825");
    


    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        if(event.getMessage().getContentRaw().equalsIgnoreCase(E2Bot.PREFIX + "help")){
            event.getChannel().sendMessageEmbeds(helpEmbed.build()).queue();
        }
    }

}
