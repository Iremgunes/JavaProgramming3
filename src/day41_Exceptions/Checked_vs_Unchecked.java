package day41_Exceptions;

import day36_Inheritence.Student;

import java.io.FileInputStream;
import java.util.Locale;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {

        /// unchecked exception
        int a = 10;
        int b = 0;
       // System.out.println(a/b);

        //System.out.println("wooden spoon");
       // System.out.println(a/b);

        char[] characters = {'A', 'B', 'C'};

       // System.out.println(characters[99]);
       // ArrayIndexOutOfBoundsException

      //  Student student = null; NullPointerException
      //  student.study();

        String str = "wooden spoon";
        str = null;

      //  System.out.println(str.toUpperCase()); //NullPointerException

      String str2 = " ";
        System.out.println(str2.isEmpty());
        System.out.println(str2.isBlank());


        //checked exception

        System.out.println("hello");

       // Thread.sleep(3000);

        System.out.println("cydeo");

        System.out.println("java".charAt(2));


    }


}
