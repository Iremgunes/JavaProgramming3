package day18_NestedLoops;

import java.util.Scanner;

public class AdiitionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("enter your first number");

            int num1 = scan.nextInt();

            System.out.println("enter your second number");
            int num2 = scan.nextInt();

            System.out.println("addition: " + (num1 + num2));

            System.out.println("would you like to continue");
            String ans = scan.next().toLowerCase();

            while(!(ans.equals("yes") || ans.equals("no"))){
                System.err.println("ınvalid entry, please re-enter");
                ans = scan.next().toLowerCase();

            }

            if (ans.equals("no")) {
                break;
            }
        }

        scan.close();
    }
    }
