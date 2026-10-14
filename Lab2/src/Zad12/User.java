package Zad12;

import java.util.UUID;

public class User {
    public UUID id;
    public String firstName;
    public String lastName;

    public User(UUID id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
