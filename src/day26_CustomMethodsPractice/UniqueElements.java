package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 55 ,1 ,6 , 7};
        int[] newArr = uniqueElement(arr);

        System.out.println(Arrays.toString(newArr));

        String[] family = {"irem", "irem", "ahmet", "serdar", "serdar"};

        String[] newFam = uniqueElement(family);
        System.out.println(Arrays.toString(newFam));

    }

    public static int[] uniqueElement(int[]array){
        int[] result = {};

        for (int each : array) {

            if(ArraysUtility.frequencyOfElemet(array, each) == 1){
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }

    public static double[] uniqueElement(double[]array){
        double[] result = {};

        for (double each : array) {

            if(ArraysUtility.frequencyOfElemet(array, each) == 1){
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }

    public static char[] uniqueElement(char[]array){
        char[] result = {};

        for (char each : array) {

            if(ArraysUtility.frequencyOfElemet(array, each) == 1){
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }

    public static String[] uniqueElement(String[]array){
       String[] result = {};

        for (String each : array) {

            if(ArraysUtility.frequencyOfElemet(array, each) == 1){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;

    }





}
