package day20_Array;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 50, 70};

        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------------");

        int[] scores = new int[5];
        scores[0] = 85;
        scores[1] = 90;
        scores[scores.length - 1] = 95;
        scores[3] = 75;
        scores[2] = 52;


        System.out.println(Arrays.toString(scores));

        System.out.println("------------------");

        String[] months = {"january", "february", "march", "april", "may", "jun", "july", "august", "september", "october", "november", "december"};
/*
        System.out.println(months[0]);
        System.out.println(months[1]);
        System.out.println(months[2]);
        System.out.println(months[3]);
        System.out.println(months[4]);
        System.out.println(months[5]);
        System.out.println(months[6]);
        System.out.println(months[7]);

 */

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        System.out.println("--------------------");

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[i]);

        }
    }
}
