package Zad;

import java.util.Scanner;

public class Zad2 {

    Zad2()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a % 2 == 0)
        {
            System.out.println("Liczba jest parzysta");
        }

        if(a % 3 == 0)
        {
            System.out.println("Liczba jest podzielna przez 3");
        }

        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        int count = 0;
        for(int i = 0; i < a; i++)
        {
            if(i % 2 == 0)
            {
                count++;
            }
        }

    }
    public static void main(String[] args) {}




}
