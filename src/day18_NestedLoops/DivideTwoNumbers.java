package day18_NestedLoops;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter a number 1: ");
        int num1 = scan.nextInt();

        System.out.println("please enter a number 2: ");
        int num2 = scan.nextInt();

        int count = 0;

        while(num1>= num2){

            num1 -= num2;

            count++;

        }
        System.out.println("count = " + count);
        System.out.println(count + " with a remainder of " + num1);


        scan.close();


    }
}
