package day37_Inheritance.scrumTask;

public class Developer extends Employee {


    public Developer(String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender, jobTitle, ID, salary, companyName);
    }

    public void fixBug(){
        System.out.println(jobTitle + " " + name + " is fixing bug");
    }




}
