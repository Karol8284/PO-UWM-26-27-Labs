package Zad12;

import java.util.UUID;

public class Message {
    public UUID id;
    public String content;
    public UUID senderId;
    public UUID receiverId;
    public long timestamp;

    public Message(UUID id, String content, UUID senderId, UUID receiverId, long timestamp) {
        this.id = id;
        this.content = content;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.timestamp = timestamp;
    }

    public void showMessage() {
        System.out.println("Message ID: " + id);
        System.out.println("Content: " + content);
        System.out.println("Sender ID: " + senderId);
        System.out.println("Receiver ID: " + receiverId);
        System.out.println("Timestamp: " + timestamp);
    }

    public static void main(String[] args) {
        UUID messageId = UUID.randomUUID();
        UUID senderId = UUID.randomUUID();
        UUID receiverId = UUID.randomUUID();
        long timestamp = System.currentTimeMillis();

        Message message = new Message(messageId, "Hello, how are you?", senderId, receiverId, timestamp);
        message.showMessage();

    }



}
