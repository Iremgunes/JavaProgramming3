package day38_Inheritance.shapeTask;

public class Rectangle extends Shape{

    public double s1;
    public double s2;

    public Rectangle(String name, double s1, double s2) {
        super(name);
        this.s1 = s1;
        this.s2 = s2;
    }


    @Override
    public String toString() {
        String name;

        return "Rectangle{" +
                "name= " + //name +
                "s1=" + s1 +
                ", s2=" + s2 +
                ", area =" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }

    @Override
    public double area() {
        return s1*s2;
    }

    @Override
    public double perimeter() {
        return 2*(s1+s2);
    }
}
