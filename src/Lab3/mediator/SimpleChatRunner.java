package Lab3.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextCHat chat = new SimpleTextCHat();

        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User 1");
        User user2 = new SimpleUser(chat, "User 2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello, I am User 1");
        admin.sendMessage("Got it. I am admin");
    }
}
