package day46_Polymorphism;

import day38_Inheritance.shapeTask.Circle;
import day38_Inheritance.shapeTask.Shape;
import day43_Abstraction.EmployeeTask.*;
import day44_Abstraction.AnimalTask.Animal;
import day44_Abstraction.AnimalTask.Cat;
import day44_Abstraction.AnimalTask.Dog;
import day44_Abstraction.AnimalTask.Playable;
import day45_Abstraction.Shape.Square;

import java.util.ArrayList;

public class PolymorphismIntro {
    public static void main(String[] args) {

        String str = "wooden spoon";

        Integer n1 = 2;

        Double b2 = 5.5;

        Boolean r1 = true;

       Object[] array = {str, n1, b2, r1, new Circle("circle", 4 ), new Square(7)};

        Employee tester = new Tester("Ali", 30, 'M', 12540, "SDET", 20000);
        Employee developer = new Developer("Alex", 28, 'M', 32,"Web developer",155000);
        Employee teacher = new Teacher("Angel", 28, 'F', 22, "English Teacher", 85000);
        Employee driver = new Driver("John", 34, 'M', 42, "Lyft Driver", 75000);

        ArrayList<Employee> cydeoEmployees = new ArrayList<>();
//          BURASI PERSON DA OLABİLİRDİ
        cydeoEmployees.add(tester);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);
        System.out.println("-------------------------");

        Employee employee = new Tester("Ali", 30, 'M', 42, "Tester", 50000);

        Employee employee2 = new Developer("Alex", 28, 'M', 32,"Web developer",155000);

        employee.work();
        employee2.work();
        /*
        WebDriver driver1 = new ChromeDriver();
        WebDriver driver2 = newChromeDriver();

        driver1().get(amazon);
        driver2.get(google);

        Animal animal1 = new Dog();
        animal.drink();

        Animal animal2 = new Cat();
        animal.drink()

        Animal animal3 = new Tiger();
        animal.drink()

         */

        String str2 = "Java";

        Animal animal1 = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        animal1.drink();
        animal1.eat();

        Playable animal2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        animal2.play();
        System.out.println(animal2.isFriendly);

        Animal animal3 = new Cat("Max", "British", 'M', 2, "Small", "Yellow");

        Shape shape = new Circle("circle", 5);

        System.out.println(shape.area());

        boolean isSquare = shape instanceof day38_Inheritance.shapeTask.Square;

        System.out.println("isSquare = " + isSquare);

        boolean isCircle = shape instanceof Circle;

        System.out.println("isCircle = " + isCircle);

        /*
        driver :
        if(driver instance Chrome){
        Chrome browser will open
        }else if(driver instanceof firefox){
        Chrome browser will open
        }
         */












    }
}
