package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        int[] newArr = removeElements1(arr, 4);

        System.out.println(Arrays.toString(newArr));

        int[] numbers = {100,200,300,400,500,600};

       numbers = removeElements1(numbers, 1);

        System.out.println(Arrays.toString(numbers));
    }

    public static int[] removeElements1(int[] array, int index){
        int[] result = new int[array.length-1];

        if(index<0 || index> array.length-1){
            System.err.println("invalid index" + index);
            System.exit(0);
        }

        int j = 0;
        for (int each : array) {
            if(each == array[index]){
                continue;
            }

            result[j++] = each;
        }

        return result;
    }

    public static double[] removeElements1(double[] array, int index){
        double[] result = new double[array.length-1];

        if(index<0 || index> array.length-1){
            System.err.println("invalid index" + index);
            System.exit(0);
        }

        int j = 0;
        for (double each : array) {
            if(each == array[index]){
                continue;
            }

            result[j++] = each;
        }

        return result;
    }

    public static char[] removeElements1(char[] array, int index){
        char[] result = new char[array.length-1];

        if(index<0 || index> array.length-1){
            System.err.println("invalid index" + index);
            System.exit(0);
        }

        int j = 0;
        for (char each : array) {
            if(each == array[index]){
                continue;
            }

            result[j++] = each;
        }

        return result;
    }

    public static String[] removeElements1(String[] array, int index){
        String[] result = new String[array.length-1];

        if(index<0 || index> array.length-1){
            System.err.println("invalid index" + index);
            System.exit(0);
        }

        int j = 0;
        for (String each : array) {
            if(each.equalsIgnoreCase( array[index])){
                continue;
            }

            result[j++] = each;
        }

        return result;
    }



}
