package day31_Constructors;

public class RectangleTask {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(20, 30);

        Rectangle rectangle2 = new Rectangle(10.5, 8.5);

        System.out.println(rectangle1);
        System.out.println(rectangle2);

        double area1 = rectangle1.calcArea();
        double area2 = rectangle2.calcArea();

        System.out.println("area1 = " + area1);
        System.out.println("area2 = " + area2);

        System.out.println(rectangle1.calcPerimeter());
        System.out.println(rectangle2.calcPerimeter());








    }
}
