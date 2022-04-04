package day31_Constructors;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("İrem", 28, 'F', 'B', 221);

        System.out.println(student1);

        Student student2 = new Student("Ahmet", 32, 'M', 'B', 333 );

        System.out.println(student2);

        Student[] array = {student1, student2};

        ArrayList<Student>list = new ArrayList<>();
        list.add(student1);
        list.add(student2);

        System.out.println(list);
        System.out.println(Arrays.toString(array));


    }
}
