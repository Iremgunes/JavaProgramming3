package day26_CustomMethodsPractice;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] a1 = {1,2,3,4,5,6};

        int[] a2 = {10,20,3,0,4,8};

        int[] merge = merge(a1, a2);

        System.out.println(Arrays.toString(merge));

    }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];

        int i = 0;

        for (int each:arr1) {
            result[i] = each;
            i++;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;
    }


}
