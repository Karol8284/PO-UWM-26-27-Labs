package Zad;

import java.util.Scanner;

public class ZadanieDodatkowe {
    public ZadanieDodatkowe(){
        int a = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        try {
            a = sc.nextInt();
        }catch (Exception e){
            System.out.println("Error not int");
            a = -1;
        }

        String str = Integer.toString(a);
        char[] chars = str.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[chars.length - 1 - i]);
        }
        System.out.println("Reversed number as String: " + sb.toString());

        int result = Integer.parseInt(sb.toString());

        System.out.println("Result: "+ result);
    }

    // Eror For 123456789101112131415 it is not int of course
//    Podaj liczbę: 123456789
//    Reversed number as String: 987654321
//    Result: 987654321


    public static void main(String[] args) {
        new ZadanieDodatkowe();
    }
}
