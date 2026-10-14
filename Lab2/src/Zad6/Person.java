package Zad6;

public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(Person person){
        this.name = person.name;

    }

    public void IntroduceYourself() {
        System.out.println("Hello, my name is " + this.name);
    }

    static void main() {
        Person first = new Person("Anna");
        Person second = first;

        first.IntroduceYourself();
        System.out.println("-------------------");
        second.IntroduceYourself();

        second.name = "Maria";
        System.out.println("+++++++++++++++++++");

//        Ile obiektów Person powstało? 1
//        Ile istnieje referencji? 2
    //    Dlaczego zmiana wykonana przez second jest widoczna również przez first?
        //    Ponieważ  second i first wskazują na ten sam obiekt w pamięci.

        Person second2 = first; // Kolejna referencja do tego samego obiektu Person

        first.name = "Karol";
        first.IntroduceYourself();

        second2.IntroduceYourself();
        System.out.println("-------------------");


        Person second3 = new Person(first); // Popiowanie/Klonowanie obiektu first do second3
        first.name = "Adam";

        first.IntroduceYourself();
        second3.IntroduceYourself();

    }
}
