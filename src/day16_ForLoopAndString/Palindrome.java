package day16_ForLoopAndString;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter a word please");
        String word = input.next();
        String reverse = "";

        for (int i = word.length() -1; i >= 0 ; i--) {
            reverse += word.charAt(i);
        }

        if(word.equalsIgnoreCase(reverse)){
            System.out.println(word +  " is palindrome");
        }else{
            System.out.println(word + " is not polindrome");
        }
        input.close();
    }
}
