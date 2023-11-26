package Program5a.src;

interface Shape
{
    double area();
    double perimeter();
}

class Rectangle implements Shape
{
    private double length, breadth;
    public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double area()
    {
        return length * breadth;
    }
    @Override
    public double perimeter()
    {
        return 2 * (length + breadth);
    }
}

class Circle implements Shape
{
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }
    @Override
    public double area()
    {
        return Math.PI * radius * radius;
    }
    @Override
    public double perimeter() { return 2 * Math.PI * radius; }
}

public class Main
{
    public static void main(String[] args)
    {
        double length = 2.0, breadth = 3.0, radius = 2.0;
        Rectangle r = new Rectangle (length, breadth);
        Circle c = new Circle(radius);
        System.out.println ("Rectangle - Area: " + r.area());
        System.out.println ("Rectangle - perimeter: " + r.perimeter());
        System.out.println("Circle - Area: " + c.area());
        System.out.println("Circle - perimeter: " + c.perimeter());

    }
    
}