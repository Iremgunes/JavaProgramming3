package Replit;

import java.util.Scanner;

public class ReverseIt { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();




    if(word.length()<= 4 || word.length() >=10){
        if(word.length()<=4){
            System.out.println("Too short!");
        }else{
            System.out.println("Too long!");
        }
        System.exit(0);
    }
    String reverseWord ="";


    for( int i= word.length()-1; i>=0; i--){
        reverseWord += word.charAt(i);
    }
    System.out.println("reverseWord = " + reverseWord);


    scan.close();



}


}


