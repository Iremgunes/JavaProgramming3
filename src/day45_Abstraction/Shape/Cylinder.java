package day45_Abstraction.Shape;

public class Cylinder extends Shape implements Volume{

    public final static double pi = 3.14;
    private double radius;
    private double high;

    public Cylinder(String name, double radius, double high) {
        super(name);
       setRadius(radius);
       setHigh(high);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public double area() {
        return 2*pi*radius*high + pi*radius*radius*2 ;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double volume() {
        return pi*radius*radius*high;
    }



}
