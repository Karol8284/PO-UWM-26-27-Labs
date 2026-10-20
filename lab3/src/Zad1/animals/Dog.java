package Zad1.animals;

public class Dog {
    private String name;
    private int age;

    public void SetAge(int age) {
        this.age = age;
    }

    public void SetName(String name) {
        this.name = name;
    }
    public int GetAge() {
        return age;
    }

    public String GetName() {
        return name;
    }

    public void MakeSound() {
        System.out.println("Woof, woof!");
    }




}
