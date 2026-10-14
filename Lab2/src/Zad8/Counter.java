package Zad8;

public class Counter {
    public int value;

    public Counter(int value) {
        this.value = value;
    }

    public void increaseOther(Counter other)   {
        other.value++;
    }

    static void main() {
        Counter counter = new Counter(5);
        Counter counter2 = new Counter(10);

        System.out.println("Counter 1 value: " + counter.value);
        System.out.println("Counter 2 value: " + counter2.value);
        counter.increaseOther(counter2);
        System.out.println("Counter 1 value: " + counter.value);
        System.out.println("Counter 2 value: " + counter2.value);
    }
}
