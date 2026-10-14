package Zad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad3 {

    public Zad3() {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            try{
                int a = sc.nextInt();
                list.add(a);

            }catch(Exception e){
                System.out.println("Error not int");
                list.add(-1);
            }
        }

        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }

        int sum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            sum += list.get(i);
        }

        double avg = (double) sum / list.size();

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > avg) {
                count++;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
        System.out.println("Count: " + count);

    }



    public static void main(String[] args) {}

}
