package day42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        System.out.println("enter your age");
        int age = new Scanner(System.in).nextInt();

        if(age<0){

            throw new InputMismatchException("age cannot be negative");


        }

        if (age>21){
            System.out.println("you are eligible");
        }else{
            throw new RuntimeException("you must be at least 21 years old");
        }

    }
}
