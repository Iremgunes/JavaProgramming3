package day43_Abstraction.EmployeeTask;

public class EmployeeObjects {
    public static void main(String[] args) {

        Tester tester = new Tester("Ali", 30, 'M', 12540, "SDET", 20000);
        Developer developer = new Developer("Alex", 28, 'M', 32,"Web developer",155000);
        Teacher teacher = new Teacher("Angel", 28, 'F', 22, "English Teacher", 85000);
        Driver driver = new Driver("John", 34, 'M', 42, "Lyft Driver", 75000);



        System.out.println(tester);

        tester.work();
        tester.sleep();
        tester.bugReport();


    }
}
