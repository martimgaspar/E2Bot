package mitram.E2Bot.commands;

import mitram.E2Bot.E2Bot;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PingCommand extends ListenerAdapter{

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){

        if(event.getMessage().getContentRaw().equalsIgnoreCase(E2Bot.PREFIX + "ping")){
            
            event.getMessage().reply("Pong! " + event.getJDA().getGatewayPing() + "ms").queue();
            
        }
    }

}
