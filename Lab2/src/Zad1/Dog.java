package Zad1;

public class Dog {
    public String name;
    public String breed;
    public String age;

    public Dog(String name, String breed, String age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void Bark() {
        System.out.println("Barking...");
    }

    public void ShowInformation(){
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
    }

    static void main() {
        Dog dog1 = new Dog("Rex", "German Shepherd", "5");
        Dog dog2 = new Dog("Rex", "German Shepherd", "5");

        dog1.Bark();
        dog1.ShowInformation();

        dog2.Bark();
        dog2.ShowInformation();
    }
}
