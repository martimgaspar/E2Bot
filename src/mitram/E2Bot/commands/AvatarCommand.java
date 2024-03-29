package mitram.E2Bot.commands;

import java.awt.Color;
import java.util.List;

import mitram.E2Bot.E2Bot;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class AvatarCommand extends ListenerAdapter{

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if(args[0].equalsIgnoreCase(E2Bot.PREFIX + "Avatar")){
            if(args.length < 2){
                EmbedBuilder error = new EmbedBuilder()
                .setColor(Color.PINK)
                .setTitle("Invalid Usage")
                .setDescription("Please use ]Avatar @user");
                event.getChannel().sendMessageEmbeds(error.build()).queue();
            }else{
                List<Member> members = event.getMessage().getMentionedMembers();
                User user = members.get(0).getUser();
                event.getChannel().sendMessage(user.getAvatarUrl()).queue(); //Works for now but there must be a better way 
            }
        }
    }
}

/*

EmbedBuilder error = new EmbedBuilder()
                .setColor(Color.PINK)
                .setTitle("Invalid Usage")
                .setDescription("Please use ]Avatar @user");
                event.getChannel().sendMessageEmbeds(error.build()).queue();

*/