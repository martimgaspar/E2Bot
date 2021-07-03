package mitram.E2Bot;

import javax.security.auth.login.LoginException;

import mitram.E2Bot.commands.AvatarCommand;
import mitram.E2Bot.commands.CoinflipCommand;
import mitram.E2Bot.commands.HelpCommand;
import mitram.E2Bot.commands.PingCommand;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class E2Bot {
    public static JDA jda;
    public static String PREFIX = "]";
    public static void main(String[] args) throws LoginException{

       String token = "NTIxODUwMDk1NjEyNzIzMjEx.XA8Ixg.5GjV66dQkIQJvynWzIlCCaALKrE"; 

        JDABuilder jda = JDABuilder.createDefault(token);
        //Bot settings
        jda.setStatus(OnlineStatus.DO_NOT_DISTURB);
        jda.setActivity(Activity.competing("]help"));

        //event listeners for commands
        jda.addEventListeners(new HelpCommand());
        jda.addEventListeners(new PingCommand());
        jda.addEventListeners(new CoinflipCommand());
        jda.addEventListeners(new AvatarCommand());
        
        jda.build();
    }
}

/* package mitram.E2Bot.commands;

import mitram.E2Bot.E2Bot;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PingCommand extends ListenerAdapter{

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        if(event.getMessage().getContentRaw().equalsIgnoreCase(E2Bot.PREFIX + "ping")){
            event.getChannel().sendMessage("Pong!").queue();
        }
    }

}*/ 