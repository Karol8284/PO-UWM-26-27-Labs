package Zad10;


public class Box {

    int value;

    public Box(int value) {
        this.value = value;
    }


     static void main(String[] args) {
        Box a = new Box(10);
        Box b = a;
        Box c = new Box(a.value);

        b.value = 20;
        c.value = 30;

        System.out.println(a.value); // 20
        System.out.println(b.value); // 20
        System.out.println(c.value); // 30

        System.out.println(a == b); // true
        System.out.println(a == c); // false


    }





}



