package day39_Recap.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle = new Circle(5.0);
        System.out.println(circle);
        circle.setRadius(8);
        System.out.println(circle.area());

        Square square = new Square(5);
        System.out.println(square);

        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println(rectangle);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getName());

        String name1 = rectangle.getName();
        System.out.println(name1);
       double a = rectangle.getLength();

        System.out.println( circle.perimeter());


    }
}
