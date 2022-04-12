package day39_Recap.ShapeTask;

public class Square extends Shape {

    private double side;

   public double getSide() {
        return side;
    }

   public void setSide(double side) {

        if(side<=0){
            System.err.println("ınvalid side: " + side);
            System.exit(1);
        }
        this.side = side;
    }

    public Square( double side) {
        super("square");
        setSide(side);
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side= " + side +
                ", area= " + area() + '\'' +
                ", perimeter= " + perimeter()+ '\''+
                '}';
    }
}
