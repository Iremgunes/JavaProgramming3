package day18_NestedLoops;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("please enter a number :");
            int num = scan.nextInt();

            if (num % 2 == 1) {
                System.out.println(num + " is odd number");
            } else {
                System.out.println(num + " is even number");
            }

            System.out.println("would you like to enter another number?");
            String ans = scan.next().toLowerCase();

            while (!(ans.equals("no") || ans.equals("yes"))) {
                    System.out.println("invalid answer plase try again. would you like to enter another number ?");
                    ans = scan.next();
                }


            if(ans.equals("no")){
                break;
            }


        }

        scan.close();

    }

}
