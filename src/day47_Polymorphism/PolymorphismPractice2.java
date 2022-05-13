package day47_Polymorphism;

import day43_Abstraction.EmployeeTask.*;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismPractice2 {
    public static void main(String[] args) {

        Employee[] employees = {
        new Tester("Ali", 30, 'M', 12540, "SDET", 20000),
        new Developer("Alex", 28, 'M', 32, "Web developer", 155000),
        new Teacher("Angel", 28, 'F', 22, "English Teacher", 85000),
       new Driver("John", 34, 'M', 42, "Lyft Driver", 75000),
};
        List<Employee> scrumMembers = new ArrayList<>();

        for (Employee employee : employees) {
            if(employee instanceof Tester || employee instanceof Developer){
                scrumMembers.add(employee);
            }
       }

        System.out.println("scrumMembers = " + scrumMembers);

        System.out.println("------------------------");

        List<Tester> testers = new ArrayList<>();
        List<Developer> developers = new ArrayList<>();

        for (Employee scrumMember : scrumMembers) {
            if(scrumMember instanceof Tester){
                testers.add((Tester)scrumMember);
            }
            if(scrumMember instanceof Developer){
               developers.add((Developer) scrumMember) ;
            }
        }

        System.out.println("testers = " + testers);
        System.out.println("developers = " + developers);

        System.out.println("------------------------");

        Tester testerWithMaxSalary = testers.get(0);
        Developer developerWithMaxSalary = developers.get(0);

        for (Tester tester : testers) {

            if(tester.getSalary() > testers.get(0).getSalary()){
                testerWithMaxSalary = tester;
            }
             }

        System.out.println("testerWithMaxSalary = " + testerWithMaxSalary);
        System.out.println(testerWithMaxSalary.getName() + " has max salary");






    }
}
