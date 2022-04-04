package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int[] newArr = replace(array, 5, 65);

        System.out.println(Arrays.toString(newArr));

        String[] arr2 = {"irem", "ahmet", "ali", "ayşe"};

        String[] newArr2 = replace(arr2, 2, "elif");

        System.out.println(Arrays.toString(newArr2));



    }

    public static int[] replace(int[] array, int index, int newElement){

        if(index<0 || index >= array.length){
            System.out.println("invalid index" + index);
            System.exit(0);
        }

        array[index] = newElement;

        return array;

    }

    public static double[] replace(double[] array, int index, double newElement){

        if(index<0 || index >= array.length){
            System.out.println("invalid index" + index);
            System.exit(0);
        }

        array[index] = newElement;

        return array;

    }

    public static char[] replace(char[] array, int index, char newElement){

        if(index<0 || index >= array.length){
            System.out.println("invalid index" + index);
            System.exit(0);
        }

        array[index] = newElement;

        return array;

    }

    public static String[] replace(String[] array, int index, String newElement){

        if(index<0 || index >= array.length){
            System.out.println("invalid index" + index);
            System.exit(0);
        }

        array[index] = newElement;

        return array;

    }


}

