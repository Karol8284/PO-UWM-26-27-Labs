package Zad2;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distance(Point otherPoint){
        int distance = (int) Math.sqrt(Math.pow(this.x - otherPoint.x, 2) + Math.pow(this.y - otherPoint.y, 2));
        System.out.println(distance);
        return distance;
    }

    static void main() {

        Point point1 = new Point(3, 4);
        Point point2 = new Point(6, 8);

        point1.distance(point2);

        Point point3 = new Point(4, 2);
        Point point4 = new Point(16, 8);

        point3.distance(point4);

    }
}
