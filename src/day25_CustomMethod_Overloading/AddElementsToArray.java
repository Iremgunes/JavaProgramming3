package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

       arr = addInteger(arr, 5);

        System.out.println(Arrays.toString(arr));

        double[] array = {2, 5, 80, 100, 52};

        array = addDouble(array, 52.2);

        System.out.println(Arrays.toString(array));

        String[] array2 = {"irem", "ahmet", "esma", "salim"};

        array2 = addString(array2, "mehmet eren");

        System.out.println(Arrays.toString(array2));

        char[] array3 = {'A', 'B', 'C'};

        array3 = addChar(array3, 'D');

        System.out.println(Arrays.toString(array3));

    }

    public static int[] addInteger(int[] array, int element){
        int[] result = new int[array.length + 1 ];

       int i = 0;
        for (int each: array) {
            result[i] = each;
            i++;

        }

        result[i] = element;
        return result;

    }

    public static double[] addDouble(double[] array, double element){

        double[] newArray = new double[array.length +1];

       int j = 0;
        for (double each : array) {
            newArray[j] = each;
            j++;
        }

        //newArray[newArray.length-1] = element;
        newArray[array.length] = element;

        return newArray;
    }

    public static String[] addString(String[] array, String element){

        String[] newArray = new String[array.length +1];

        int i = 0;
        for (String each : array) {
            newArray[i] = each;
            i++;
        }

        newArray[array.length] = element;

        return newArray;
    }

    public static char[] addChar(char[] array, char element){
        char[] newArray = new char[array.length +1];

        int i = 0;
        for (char each : array) {
            newArray[i] = each;
            i++;
        }

        newArray[array.length] = element;

        return newArray;

    }




}
