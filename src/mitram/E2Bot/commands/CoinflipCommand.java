package mitram.E2Bot.commands;

import java.util.Random;

import mitram.E2Bot.E2Bot;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CoinflipCommand extends ListenerAdapter{

    Random randomNum = new Random();

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        if(event.getMessage().getContentRaw().equalsIgnoreCase(E2Bot.PREFIX + "flip")){
            int coin = randomNum.nextInt(2); 
            if (coin == 0) {
                event.getChannel().sendTyping().queue();
                event.getMessage().reply("Heads!").queue();
            }else{
                event.getChannel().sendTyping().queue();
                event.getMessage().reply("Tails!").queue();
            }
        }
    }

}