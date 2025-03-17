import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Main extends ListenerAdapter {
    public static void main(String[] args) throws Exception {
        String token = "YOUR_BOT_TOKEN_HERE"; // Replace with your bot token

        JDABuilder.createDefault(token)
                  .addEventListeners(new Main())
                  .build();
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();
        String content = message.getContentRaw();

        if (content.equalsIgnoreCase("!ping")) {
            message.getChannel().sendMessage("Pong!").queue();
        }
    }
}