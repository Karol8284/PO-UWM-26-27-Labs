package Zad4;

public class Car {
    public String brand;
    public String model;
    public int productionYear;
    public int mileage;


    private Car() {} // private jest specialnie

    public Car(String brand, String model, int productionYear, int mileage) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
    }

    public Car(Car car){
        this.brand = car.brand;
        this.model = car.model;
        this.productionYear = car.productionYear;
        this.mileage = car.mileage;
    }


    public int drive(int distance) {
        this.mileage += Math.abs(distance);
        return this.mileage;
    }

    public void showInformation() {
        if(this == null) {
            System.out.println("Car object is null.");
            return;
        }
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Production Year: " + this.productionYear);
        System.out.println("Mileage: " + this.mileage);
    }

    static void main() {
        Car car1 = new Car("Toyota", "Corolla", 2020, 15000);
        Car car2 = new Car(car1);

        car1.drive(500);
        car1.showInformation();
        System.out.println("-------------------");
        car2.showInformation();

        // zad 9

        Car car3 = null;


        // car3.showInformation(); //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Zad4.Car.showInformation()" because "car3" is null
                                //at Zad4.Car.main(Car.java:51)

        if(car2 != null) {
            car2.showInformation();
        }


    }
}
