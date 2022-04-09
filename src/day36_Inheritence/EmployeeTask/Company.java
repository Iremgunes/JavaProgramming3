package day36_Inheritence.EmployeeTask;

public class Company {
    public static void main(String[] args) {

        Tester tester = new Tester();

        tester.setInfo("İrem", 'F', 28, "sdet", 221, 20000, "apple"  );

        tester.work();

        System.out.println(tester);


    }
}
