package day25_CustomMethod_Overloading;

public class ArraysUtility {
    public static void main(String[] args) {

    }
    public static void printEach(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }
//prints each decimal of double array in seperate lines
    public static void printEach(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }
    //prints each char of char array in seperate lines
    public static void printEach(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }

    public static void printEach(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }


}
