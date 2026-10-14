package Zad12;

import java.util.List;
import java.util.UUID;

public class Chat {
    public UUID id;
    public String name;
    public List<UUID> participantIds;

    public Chat(UUID id, String name, List<UUID> participantIds) {
        this.id = id;
        this.name = name;
        this.participantIds = participantIds;
    }
}
