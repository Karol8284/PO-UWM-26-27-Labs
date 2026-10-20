package Zad2;

public class Person {

    private String name;
    private int age;
    private String email;

    public Person(int age, String email, String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name;

        if(age <= 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 1 and 150.");
        }
        this.age = age;

        if(email.contains("@")) {
            throw new IllegalArgumentException("Email is not valid.");
        }
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//Zastanów się:
//
//Czy wszystkie trzy pola rzeczywiście muszą posiadać setter?

// To zakeży, jeśli tylko a chwile , to:
//private String name; nie potrzebuje settera
//private int age; nie potrzebuje settera
//private String email; tak i nie

// Zależy od potrzeb programu
