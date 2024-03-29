package day45_Abstraction.Shape;

public class Square extends Shape{

    private double side;


    public Square(double side) {
        super("square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<0){
            throw new RuntimeException("invalid side: " +side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return super.toString() +
                "side= " + side +
                '}' ;
    }
}
