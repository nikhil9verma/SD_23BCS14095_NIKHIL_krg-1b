
import java.util.ArrayList;
import java.util.List;

public class Instagram extends Message {
    
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        
        Post post1 = new Post();
        post1.post();
        post1.like();
        
        Message message = new Message();
        message.sendMessage("Hello, this is a message from WhatsApp!");
        

    }
}
