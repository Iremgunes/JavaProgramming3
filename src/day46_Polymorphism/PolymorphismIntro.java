package day46_Polymorphism;

import day38_Inheritance.shapeTask.Circle;
import day40_FinalKeyword.Dog;
import day43_Abstraction.EmployeeTask.*;
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

        Employee emloyee = new Tester("Ali", 30, 'M', 42, "Tester", 50000);

        emloyee.work();









    }
}
