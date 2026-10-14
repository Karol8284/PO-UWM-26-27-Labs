package Zad12;

import java.util.UUID;

public class MessageThread {
    public UUID id;
    public  String name;
    public  UUID chatId;

    public MessageThread(UUID id, String name, UUID chatId) {
        this.id = id;
        this.name = name;
        this.chatId = chatId;
    }
}

