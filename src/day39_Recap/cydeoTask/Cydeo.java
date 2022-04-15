package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Developer developer = new Developer("Korkmaz", 29, 'M', 1, "Java Developer", 12500  );

        Tester tester = new Tester("Olga", 27, 'F', 2, "SDET", 11000);

        Teacher teacher = new Teacher("Daniel", 32, 'M', 3, "Math Teacher", 10000);

        Student student = new Student("Suhaib", 30, 'M', 8, "SDET");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("----------------------------");

        developer.setName("İrem" );
        System.out.println(developer);

        System.out.println("-------------------------");

        developer.work();
        tester.work();
        teacher.work();
        System.out.println( );
        developer.eat();

        developer.fixingBugs();
        student.eat();

        System.out.println(developer.getName());






    }
}
