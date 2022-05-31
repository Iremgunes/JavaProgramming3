package ReviewWeek.String;

import java.util.Scanner;

public class ExamplesFromQuiz {
    public static void main(String[] args) {

      String s1 = "abc";
      String s2 = "abc";

        System.out.println("s1==s2 is: " + (s1==s2));

        System.out.println("s1==s2 is: " +s1==s2);

        System.out.println("----------------------");

        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta + tb;
       ta.replace('C', 'D');
        ta= ta + tb;

        System.out.println(ta);

        System.out.println("---------------------------");

// replit middle one
      String word = "işi";

      if(word.length()>=3 && word.length()%2==1){
        System.out.print(word.charAt((word.length()-1)/2));
      }else if(word.length() == 1){
        System.out.print(word.repeat(3));
      } else if(word.length()>=4 && word.length()%2==0){
        System.out.print(word.charAt(word.length()/2 -1));
        System.out.print(word.charAt(word.length()/2));
      } else{
        System.out.print(word.repeat(2));
      }






    }
}
