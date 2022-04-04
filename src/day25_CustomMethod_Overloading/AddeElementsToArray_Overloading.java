package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddeElementsToArray_Overloading {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};

        int[] newArray = addElement(numbers, 7);

        System.out.println(Arrays.toString(newArray));

        char[] chars = {'A','B', 'C', 'D'};

        chars = addElement(chars, 'E');

        System.out.println(Arrays.toString(chars));

        String[] names = {"Ahmet", "Oleksandır", "Sinem", "Cihad"};

        names = addElement(names,"irem");

        System.out.println(Arrays.toString(names));




    }

    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1 ];

        int i = 0;
        for (int each: array) {
            result[i] = each;
            i++;

        }

        result[i] = element;
        return result;

    }

    public static double[] addElement(double[] array, double element){

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

    public static String[] addElement(String[] array, String element){

        String[] newArray = new String[array.length +1];

        int i = 0;
        for (String each : array) {
            newArray[i] = each;
            i++;
        }

        newArray[array.length] = element;

        return newArray;
    }

    public static char[] addElement(char[] array, char element){
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
