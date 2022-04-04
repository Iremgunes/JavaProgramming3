package day20_Array;

import java.util.Scanner;

public class MaxNumberOfArrayInScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("how many number do you enter in");
        int many = scan.nextInt();

        if(many<=0){
            System.out.println("invalid entry");
            System.exit(0);
        }

        int[] numbers = new int[many];

        int max = numbers[0];

        for (int i = 0; i < many; i++) {
            System.out.println("enter a number");
            numbers[i] = scan.nextInt();


            if(numbers[i] > max){
                max = numbers[i];
            }

        }

        System.out.println("max number is: " + max);





        scan.close();




    }
}
