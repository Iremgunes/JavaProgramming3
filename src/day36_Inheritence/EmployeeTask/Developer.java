package day36_Inheritence.EmployeeTask;

public class Developer extends Employee{

    public void develop(){
        System.out.println(name + " is developing");
    }

    public void fixBug(){
        System.out.println(name + " is fixing bug");
    }


}
