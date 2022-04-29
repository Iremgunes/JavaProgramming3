package day43_Abstraction.EmployeeTask;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is developing the application");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 7 hours");
    }

    public void unitTest(){
        System.out.println(getName() + " is unit testing");
    }




}
