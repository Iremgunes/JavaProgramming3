package Replit;

import java.util.Scanner;

public class WithoutX_x {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if((word.charAt(0) == 'x' || word.charAt(0) == 'X' ) && (word.charAt(word.length()-1) == 'x' || word.charAt(word.length()-1) == 'X')){
            String newWord = "";
            for (int i = 1; i <word.length()-1 ; i++) {
                newWord += word.charAt(i);
            }
            System.out.println(newWord);
         } else if((word.charAt(0) == 'x' || word.charAt(0) == 'X' ) && !(word.charAt(word.length()-1) == 'x' || word.charAt(word.length()-1) == 'X')){
            String newWord1 ="";
            for (int i = 1; i < word.length() ; i++) {
                newWord1 += word.charAt(i);
            }
            System.out.println(newWord1);
        } else if(!(word.charAt(0) == 'x' || word.charAt(0) == 'X' ) && (word.charAt(word.length()-1) == 'x' || word.charAt(word.length()-1) == 'X')){
            String newWord2 = "";
            for (int i = 0; i <word.length()-1 ; i++) {
                newWord2 += word.charAt(i);
            }
            System.out.println(newWord2);
        }else {
            System.out.println(word);
        }






        scan.close();

    }



















}
