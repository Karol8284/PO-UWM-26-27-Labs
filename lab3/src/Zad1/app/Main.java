package Zad1.app;

public class Main {
    static public void main(String[] args) {
        Zad1.animals.Cat cat = new Zad1.animals.Cat();
        cat.SetName("Whiskers");
        cat.SetAge(3);
        System.out.println(cat.GetName());
        System.out.println(cat.GetAge());
        cat.MakeSound();

        Zad1.animals.Dog dog = new Zad1.animals.Dog();
        dog.SetName("Buddy");
        dog.SetAge(5);
        System.out.println(dog.GetName());
        System.out.println(dog.GetAge());
        dog.MakeSound();
    }
}
