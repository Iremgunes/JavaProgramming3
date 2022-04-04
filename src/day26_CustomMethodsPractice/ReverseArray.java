package day26_CustomMethodsPractice;

public class ReverseArray {
    public static void main(String[] args) {

    }

    public static int[] reverse(int[] array){
        int[] result = new int[array.length];

        for (int i = 0, j = array.length-1; i < array.length ; i++, j--) {

            result[j] = array[i];

        }
        return result;

    }

    public static double[] reverse(double[] array){
        double[] result = new double[array.length];

        for (int i = 0, j = array.length-1; i < array.length ; i++, j--) {

            result[j] = array[i];

        }
        return result;

    }

    public static char[] reverse(char[] array){
        char[] result = new char[array.length];

        for (int i = 0, j = array.length-1; i < array.length ; i++, j--) {

            result[j] = array[i];

        }
        return result;

    }

    public static String[] reverse(String[] array){
        String[] result = new String[array.length];

        for (int i = 0, j = array.length-1; i < array.length ; i++, j--) {

            result[j] = array[i];

        }
        return result;

    }
}
