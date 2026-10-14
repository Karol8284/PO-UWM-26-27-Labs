package Zad11;

public class Product {

    String name;
    double price;

    public Product(String name, double price) { //public void  nie jest konstruktorem ale metodą
        this.name = name;
        this.price = price;
    }
    // this odpowiada za zmiane wartości tego obieku, aby nie dochodziło do problemów

    public void show() {
        System.out.println(name + ": " + price);
    }

    static void main(String[] args) {
        Product product =
            new Product("Monitor", 1200);
        product.show();
    }
}
