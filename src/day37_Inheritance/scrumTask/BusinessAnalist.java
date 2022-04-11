package day37_Inheritance.scrumTask;

public class BusinessAnalist extends Employee{

    public BusinessAnalist(String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender, "Business Analist", ID, salary, companyName);
    }

    public  void analyze(){
        System.out.println( name + " is analayze the documents");
    }


}
