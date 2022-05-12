package day47_Polymorphism;

import day43_Abstraction.EmployeeTask.Developer;
import day43_Abstraction.EmployeeTask.Employee;
import day43_Abstraction.EmployeeTask.Tester;
import day44_Abstraction.AnimalTask.Animal;
import day44_Abstraction.AnimalTask.Cat;
import day44_Abstraction.AnimalTask.Dog;
import day45_Abstraction.Shape.Circle;
import day45_Abstraction.Shape.Shape;
import day45_Abstraction.Shape.Square;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

   //    Shape shape = (Shape) new Circle(4);

        Shape shape2 = new Circle(5);

        //WebDriver driver = new ChromeDriver();

        Animal animal1 = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        Dog dog = (Dog) animal1;//downcasting
        //one dog object 2 reference name

        System.out.println(animal1.getName());
        System.out.println(dog.getName());

        ((Dog) animal1).bark();
        dog.bark();

        Shape shape1 = new Square(5);

        System.out.println( ((Square) shape1).getSide());

        System.out.println("------------------------------");

        Animal animal2 = new Cat("Jim", "scotish", 'M', 3, "small", "white" );

        ((Cat) animal2).meow();

        Cat cat = (Cat) animal2;

        //((Dog) animal2). bark();

        System.out.println("-----------------------");

        Employee employee = new Tester("Ali", 38, 'M', 42, "SDET", 150000 );

        ((Tester)employee).bugReport();

        //((Developer)employee).unitTest(); classCastException

        System.out.println("---------------------------------");

        Shape s1 = new Circle(5);
        s1.area();
        s1.perimeter();
       // s1.volume(); circle da bu method yok














    }
}