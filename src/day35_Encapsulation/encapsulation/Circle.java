package day35_Encapsulation.encapsulation;

public class Circle {

    private double radius;

    public static double pi;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            System.out.println("invalid radius");
            System.exit(0);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
       setRadius(radius);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public void area(){
        double area = pi* getRadius()*getRadius();
    }

    public void perimeter(){
        double perimeter = 2 * pi * getRadius();
    }
}
