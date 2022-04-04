package day21_ForEachLoop;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String sentence = "İrem Güneş";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        String email = "woodenSpoon@cydeo.com";

        String[] arr = email.split("@");

        System.out.println(Arrays.toString(arr));

        System.out.println("------------------");

        String s = "Today is nice day. Today is Monday. Today we learn Java";

        String[] sentences = s.split("\\. ");

        System.out.println(Arrays.toString(sentences));


    }
}
