package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age:" );
        int age = scan.nextInt(); //valid age = 1-120

        while (!(age>= 1 && age <=120)){
            System.err.println("invalid entry, please re-enter");
            age = scan.nextInt();
        }

        System.out.println("are you a us citizen yes/no");
        String answer = scan.next();
        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.err.println("invalid entry please re-enter");
            System.out.println( "are you a us citizen yes/no");
            answer= scan.next().toLowerCase();
        }

        if(age>=18&& answer.equalsIgnoreCase("yes")){
            System.out.println("you are eligible to vote");
        }else{
            System.out.println("you are not eligible to vote");
        }



        scan.close();



    }
}
