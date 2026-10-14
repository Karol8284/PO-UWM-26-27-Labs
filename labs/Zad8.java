package Zad;

public class Zad8 {

    public  class Car {
        private String model;
        private String color;
        private int year;

        public Car(String model, String color, int year) {
            this.model = model;
            this.color = color;
            this.year = year;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getYear() {
            return year;
        }
    }

    public class CarRacing{
        private int id;
        private int speed;
        private int hp;

        private Car car;

        public CarRacing(int id, int speed, int hp, Car car) {
            this.id = id;
            this.speed = speed;
            this.hp = hp;
            this.car = car;
        }

        public int getId() {
            return id;
        }

        public int getSpeed() {
            return speed;
        }

        public int getHp() {
            return hp;
        }
        public Car getCar() {
            return car;
        }
    }

    public static void main(String[] args) {
    }

}


//System wypożyczalni samochodów
//B. Gra wyścigowa
//C. System warsztatu samochodowego