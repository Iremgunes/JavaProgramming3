package day24_CustomMethod_Return;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {

        int[] reverse = reverseArray(25,55,42,35,62);

        System.out.println(Arrays.toString(reverse));

        String[] reverse2 = reverseArray2("irem", "ahmet", "mehmet eren", "esma", "salim");

        System.out.println(Arrays.toString(reverse2));

    }
    public static int[] reverseArray(int a, int b, int c, int d, int e){
        int[] numbers = {a,b,c,d,e};

        //50,40,30,20,10

        int[] reverse =  new int[numbers.length];

        for (int i = numbers.length -1, j= 0; i >=0; i--, j++) {
            reverse[j] = numbers[i];
        }



        return reverse;


    }
    public static String[] reverseArray2(String a, String b, String c, String d, String e){
        String[] words = {a,b,c,d,e};

        //50,40,30,20,10

        String[] reverse =  new String[words.length];

        for (int i = words.length -1, j= 0; i >=0; i--, j++) {
            reverse[j] = words[i];
        }



        return reverse;


    }


}
