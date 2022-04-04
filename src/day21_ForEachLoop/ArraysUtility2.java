package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 5);

        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers ={1,2,3,4,5,6,7,8,9};

        numbers= Arrays.copyOf(numbers, 5);

        System.out.println(Arrays.toString(numbers));
        System.out.println("------------------------");
        char[] ch1 = {'A','B','C','D','E','F','G', 'H', 'I'};

        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6);

        System.out.println(Arrays.toString(ch2));
        System.out.println("------------------");

        int[] scores = {10,20,30,40,50,60,70,80,90,100};
        //              0,,1,,2,,3,,4,,5,,6,,7,,8,,9
        int[] result = Arrays.copyOfRange(scores, 2,5);

        System.out.println(Arrays.toString(result));
        int[] result2 = Arrays.copyOfRange(scores, 5, scores.length);

        System.out.println(Arrays.toString(result2));

        int[] numbers10 = {3,6,9};
        for(int each: numbers10){
            System.out.println(each);
        }

    }
}
