package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MergeTheArray {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9};

        int[] array3 = mergeIntegerArray(array1, array2);

        System.out.println(Arrays.toString(array3));

    }

    public static int[] mergeIntegerArray(int[] array1, int[] array2){
        int[] newArray = new int[array1.length + array2.length];

      int i = 0;
        for (int each : array1) {
            newArray[i] = each;
            i++;
        }

        for (int each : array2 ) {
            newArray[i] = each;
            i++;
        }

        return newArray;


          }
}
