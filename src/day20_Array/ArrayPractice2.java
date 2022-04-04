package day20_Array;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26];
       // letters[0] = 'A';

        for (char i = 'A', j= 0; i <= 'Z' && j < letters.length; i++, j++) {
           // we can initialize the char and int together because every single character has integer number
            letters[j] = i;
        }

        System.out.println(Arrays.toString(letters));

        System.out.println("--------------------");



        char[] letters2 = new char[26];


       char ch = 'Z';

        for (int i = letters2.length -1; i >= 0 ; i--) {
            letters2[i] = ch;
            ch--;

            System.out.print(letters2[i] + " ");

        }
        System.out.println(Arrays.toString(letters2));








    }
}
