package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray<arr4D> {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8,9};

        int[][] arr2D = {{1,2,3},{4,5,6}, {7,8,9}};

        // 3 dimensional array contains 2d arrays
        System.out.println("----------------------------");

        int[][][][] arr4D = {{{{1,2,3}, {4,5,6}, {7,8,9}}, {{10,20,30},{40,50,60},{70,80,90}}}};

    for(int[][][] each3D: arr4D) {
        System.out.println(Arrays.deepToString(each3D));
        for (int[][] each2d : each3D) {
            System.out.println(Arrays.deepToString(each2d));
            for ( int[] eachd : each2d) {
                System.out.println(Arrays.toString(eachd));
                for (int each : eachd) {
                    System.out.println(each);
                }
            }
        }
    }

    }
}
