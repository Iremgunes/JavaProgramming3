package day38_Inheritance.shapeTask;

public class Square extends Shape{

    private double s;

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

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
