package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class AvarageNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("how many numbers would you like enter ");
        int length = scan.nextInt();

        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("please enter a number");
            numbers[i] = scan.nextInt();
            System.out.println( (i+1) + ". number is: " + numbers[i]);

        }
        System.out.println(Arrays.toString(numbers));

        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total+= numbers[i];
            }

        double avarageNumber = total/numbers.length;

        System.out.println("total = " + total);

        System.out.println("avarageNumber = " + avarageNumber);

        scan.close();



    }
}
