package day38_Inheritance.shapeTask;

public class Square extends Shape{

    public double s;

    public Square(String name, double s) {
        super(name);
        this.s = s;
    }

    @Override
    public String toString() {
        return "Square{" +
                "s=" + s +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }

    @Override
    public double area() {
        return s*s;
    }

    @Override
    public double perimeter() {
        return 4*s;
    }
}
