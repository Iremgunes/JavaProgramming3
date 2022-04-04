package week06;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a number please");

        int number = input.nextInt();

        int sum = 0;

        if(number >= 1) {
            for (int i = 0; i <= number; i++) {

                sum += i;

            }
            System.out.println(sum);
        } else{
            System.out.println("please enter a valid number again");
        }


input.close();




    }
}
