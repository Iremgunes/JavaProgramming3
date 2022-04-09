package day37_Inheritance.scrumTask;

public class Tester extends Employee{ // tester is a employee and tester is a person



    public Tester(String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender, jobTitle, ID, salary, companyName);
    }

    public void createTicket(){
        System.out.println(jobTitle + " " + name + " is creating ticket");
    }




}
