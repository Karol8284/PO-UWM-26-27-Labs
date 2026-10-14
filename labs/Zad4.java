package Zad;

import java.util.Scanner;

public class Zad4 {
    public Zad4(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        }
        else {
            System.out.println("Liczba jest nieparzysta");
        }

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        scanner.close();

    }

    public static void main(String[] args) {
        new Zad4();
    }

}
