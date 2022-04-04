package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};

        char[] chars = {'A', 'B', 'C'};

        double[] decimals = {1.2, 2.3,4.5, 5.6, 7.8, 9.0};

        ArraysUtility.printEach(arr1);
        System.out.println("------------------");
        ArraysUtility.printEach(chars);
        System.out.println("-----------------");
        ArraysUtility.printEach(decimals);

        System.out.println("------------------");

        int[] n1 = {1,2,3,4,5,6};

        int max1 = ArraysUtility.max(n1);

        System.out.println("max1 = " + max1);

        System.out.println("-------------------");

        double[] n2 = {2.3, 4.5, 8.7, 9.9};

        double max2 = ArraysUtility.max(n2);
        System.out.println("max2 = " + max2);

        System.out.println("--------------");

        int[] arr = {5,8,3,45,621,4};

        boolean con = ArraysUtility.contains(arr, 6);
        System.out.println("con = " + con);

        System.out.println("------------------");

        String[] family = {"esma", "salim", "irem", "mehmet eren", "ahmet"};
        boolean containsFamily = ArraysUtility.contains(family, "ahmet");
        System.out.println("containsFamily = " + containsFamily);



    }





}
