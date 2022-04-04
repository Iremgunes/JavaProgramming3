package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";

       /*
       char[] str1New = str1.toCharArray();

        Arrays.sort(str1New);
        System.out.println(str1New);

      char[] str2New = str2.toCharArray();
      Arrays.sort(str2New);
        System.out.println(str2New);

        System.out.println(str1New.equals(str2New) );
        */
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean anagram = Arrays.equals(ch1, ch2);
        System.out.println("anagram is : " + anagram);





    }
}
