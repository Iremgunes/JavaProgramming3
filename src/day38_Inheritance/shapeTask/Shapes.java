package day38_Inheritance.shapeTask;

public class Shapes {
    public static void main(String[] args) {

        Circle circle = new Circle("circle", 5);

        System.out.println(circle);

        Rectangle rectangle = new Rectangle("rectangle", 5.4, 4.5);

        System.out.println(rectangle);

        Square square = new Square("square", 6);
        System.out.println(square);



    }
}
