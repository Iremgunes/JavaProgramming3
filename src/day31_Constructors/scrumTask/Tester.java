package day31_Constructors.scrumTask;

public class Tester {
    public String name;
    public long employeeID;
    public String jobTitle;
    public double salary;

    public Tester(String name, long employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+ " is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name + " is creating ticket");
    }





}
