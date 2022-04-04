package week10;

import java.util.Arrays;

public class R02_DifferenceBetween {
    public static void main(String[] args) {
        int[] array = {9,8,2,3,5,4,1,10,55,42};

        System.out.println(difference(array));

        int[] arr2 = {2,4,3,5,6,-32,80,23};

        System.out.println(difference2(arr2));
    }

    public static int difference2(int[] array){
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max = array[i];
            }
            if(min>array[i]){
                min = array[i];
            }
        }
        int difference = max - min ;


        System.out.println("min = " + min);
        System.out.println("max = " + max);

        return difference;
    }

    public static int difference(int[] array){
        Arrays.sort(array);

        int difference = array[array.length-1] - array[0];

        return difference;
    }



}
