package GroupMeeting;

import java.util.Arrays;
import java.util.Scanner;

public class Diving {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] score = new float[7];

        for (int i = 0; i < score.length ; i++) {
            System.out.println("enter score for judge " + (i+1)+ ":");

            score[i] = input.nextFloat();

        }

        Arrays.sort(score);

        float[] scoreFive = Arrays.copyOfRange(score, 1, score.length-1);

        System.out.println(Arrays.toString(scoreFive));

        float total = 0;
        for (float each: scoreFive) {
            total += each;
        }
        System.out.println("total point is = " + total);

        System.out.println("enter difficulty");
        float difficulty = input.nextFloat();
        total *=difficulty*0.6;

        System.out.printf("total: %.2f", total);









        input.close();
    }
}
