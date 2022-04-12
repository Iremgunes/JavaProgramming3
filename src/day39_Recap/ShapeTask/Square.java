package day39_Recap.ShapeTask;

public class Square extends Shape {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            System.err.println("invalid side: " + side);
            System.exit(0);
        }
        this.side = side;
    }

    public Square(String name) {
        super("Square);
        setSide(side);
    }




}
