package day17_While_DoWhile;

import java.util.Scanner;

public class Marriage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("will you marry me?");

        String answer = input.next();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.out.println("please re-write your answer");
            answer = input.next();
        }

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("congrats");
        } else {
            System.out.println("goodbye???");
        }


        input.close();
    }
}
