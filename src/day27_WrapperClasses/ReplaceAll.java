package day27_WrapperClasses;

import org.w3c.dom.ls.LSOutput;
import utilities.ArraysUtility;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {

        int[] arr = {10,10,20,30,40,30,30,30,50};

        arr = replaceAll(arr, 30, 80);

        System.out.println(Arrays.toString(arr));


    }

    public static int[] replaceAll(int[] array, int oldElement, int newElement){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldElement){
                array[i] = newElement;
            }
        }

        return array;
    }

    public static double[] replaceAll(double[] array, double oldElement, double newElement){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldElement){
                array[i] = newElement;
            }
        }

        return array;
    }

    public static char[] replaceAll(char[] array, char oldElement, char newElement){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldElement){
                array[i] = newElement;
            }
        }

        return array;
    }

    public static String[] replaceAll(String[] array, String oldElement, String newElement){

        for (int i = 0; i < array.length; i++) {

            if(array[i].equalsIgnoreCase(oldElement)){
                array[i] = newElement;
            }
        }

        return array;
    }

}
