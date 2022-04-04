package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseASecondWord {
    public static void main(String[] args) {

        String sentence = "I love java";

        String[] words = sentence.split(" ");

        String reverse = "";

        for (int i = words[1].length()-1; i >= 0; i--) {
            reverse += words[1].charAt(i);
        }

        System.out.println(reverse);

        words[1]= reverse;

        System.out.println(Arrays.toString(words));

        for (String word: words) {
            System.out.print(word + " ");
        }
    }
}
