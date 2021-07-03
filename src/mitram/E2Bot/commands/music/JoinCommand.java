package mitram.E2Bot.commands.music;

import mitram.E2Bot.E2Bot;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.VoiceChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.managers.AudioManager;

public class JoinCommand extends ListenerAdapter{

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        
        Guild guild = event.getGuild();
        VoiceChannel channel = guild.getVoiceChannelsByName("music", true).get(0);
        AudioManager manager = guild.getAudioManager();
        
        if(event.getMessage().getContentRaw().equalsIgnoreCase(E2Bot.PREFIX + "join")){
            manager.openAudioConnection(channel);
        };
        if(event.getAuthor().isBot()) return;

        
    }
}