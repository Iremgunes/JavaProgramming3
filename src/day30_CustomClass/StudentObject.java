package day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Aygun", 'F', 39, 2210, 'A');
        System.out.println(student1);

        Student student2 = new Student();
        student2.setInfo("Hülya", 'F', 26, 2123, 'B');
        System.out.println(student2);

        Student student3 = new Student();
        student3.setInfo("Elminur", 'F', 26, 2210, 'A');
        System.out.println(student3);

        Student student4 = new Student();
        student4.setInfo("Ali", 'M', 28, 5511, 'B');
        System.out.println(student4);

        Student[] students ={student1, student2, student3,student4};

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("-------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>();
        ArrayList<String> earlyBirdsName = new ArrayList<>();
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students ) {
            if(student.grade == 'A'){
                earlyBirds.add(student);
                earlyBirdsName.add(student.name);
            }else{
                angryBirds.add(student);
            }
        }

        System.out.println("angryBirds = " + angryBirds);
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("earlyBirdsName = " + earlyBirdsName);


    }
}
