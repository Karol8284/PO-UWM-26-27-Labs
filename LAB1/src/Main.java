public class Main {
    public static void main(String[] args) {
        System.out.println("Działa");

        int x = 9;

        int y = x >= 10 ? x > 13 ? 3  : 5  : 0;
        int z = x >= 10 ? x > 13 ? 13  : x > 12 ? 12 : 11 : 0;
        System.out.println(y);



    }
}