package Zadaniedodatkowe;

public class Rectangle {
    public double width;
    public double height;



    public Rectangle()
    {
    }
    public Rectangle(double side)
    {
        this.width = side;
        this.height = side;
    }
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    public Rectangle(Rectangle other)
    {
        this.width = other.width;
        this.height = other.height;
    }
    public double area(){
        return this.width * this.height;

    }
    public double perimeter(){
        return 2 * (this.width + this.height);
    }
    public void scale(double factor){
        this.width *= factor;
        this.height *= factor;
    }
}
