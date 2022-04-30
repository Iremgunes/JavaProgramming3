package day43_Abstraction.EmployeeTask;

public class EmployeeObjects {
    public static void main(String[] args) {

        Tester tester = new Tester("Ali", 30, 'M', 12540, "SDET", 20000);

        System.out.println(tester);

        tester.work();
        tester.sleep();
        tester.bugReport();


    }
}
