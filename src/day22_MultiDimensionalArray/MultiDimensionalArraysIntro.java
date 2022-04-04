package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {
    public static void main(String[] args) {

        String[] group1 = {"Jon", "Joes", "Jmaes"};
        String[] group2 = {"Jon", "Joes", "Jmaes"};
        String[] group3 = {"Jon", "Joes", "Jmaes"};


        String[][] groups = new String[3][];//index:0.1.2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        System.out.println(Arrays.deepToString(groups));

        System.out.println("----------------------");


// index of the elements  0,1,2
        int[][] arr2D = {{1,2,3}, {4,5,6,7},{8,9}};
        //  index of arrays: 0,         1,       2

        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(arr2D[2][1]);

        System.out.println(arr2D[1][2]);






    }
}
