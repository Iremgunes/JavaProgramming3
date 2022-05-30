package day13_String;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a sentence 1 please");

        String s1 = input.nextLine();

        System.out.println("enter a sentence 2 please");

        String s2 = input.nextLine();

        input.close();

        int totalChars1 = s1.length();
        int totalChars2 = s2.length();

        if (totalChars1 > totalChars2) {
            System.out.println(s1 + " is longer than " + s2);
        } else {
            System.out.println(s2 + " is longer than " + s1);
        }
        System.out.println("------------------------");




    }
}
