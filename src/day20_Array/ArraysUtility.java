package day20_Array;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] numbers = {10,9, 0, 1, 2, 20, 4, 2, 7, 80};

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);//sorts the array in ascending order

        System.out.println(Arrays.toString(numbers));


    }
}
