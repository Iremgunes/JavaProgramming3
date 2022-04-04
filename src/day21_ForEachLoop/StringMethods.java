package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Java";

        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

        for ( char each : str.toCharArray()) {
            System.out.println(each);
        }

        System.out.println("----------------------");

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }




    }
}
