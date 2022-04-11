package day37_Inheritance.scrumTask;

public class AmazonInc {
    public static void main(String[] args) {

        String company = "Amazon Imc";

        ProductOwner po = new ProductOwner("Suhaib", 29, 'M', "PO",1, 160000, company );
        BusinessAnalist ba = new BusinessAnalist("Cihad", 30, 'M', "BA", 2, 15000, company);
        ScrumMaster sm = new ScrumMaster("Anel", 26, 'F', "SM", 3, 145000, company);

        Tester tester1 = new Tester("Rabia", 32, 'F', "QA", 1415, 12500, company);
        Tester tester2 = new Tester("Yasaman", 32, 'F', "QE", 1416, 130000, company);
        Tester tester3 = new Tester("Irena", 29, 'F', "SDET", 1417, 1356400, company);

        Tester[] testers = {tester1, tester2, tester3};

        Developer developer1 = new Developer("Daniela", 27, 'F', "Java Developer", 8, 135000,company);

        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);

        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("--------------------");

        for (Tester each:scrumTeam.testers) {
            System.out.println(each.name + " : " + each.salary);
        }

        System.out.println("------------------------");

        for (Developer each: scrumTeam.developers) {
            System.out.println(each.name + " : " + each.salary);
        }




    }
}
