package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloadingIntro {
    public static void main(String[] args) {

        int[] intArray = {5,6,0,-1,3,4};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        Arrays.sort(doubleArray);

        char[] charArray = new char[]{'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(charArray);

        System.out.println("-------------------------------");

        sumOfNumbers(15,25);

        sumOfNumbers(15.5, 55.2);




    }
    public static double sumOfNumbers(double a, double b){return a + b;}
    public static int sumOfNumbers(int num1, int num2){
        //  int sum = num1 + num2;
        // return sum;
        return num1 + num2;
    }
       public static int sumOfNumbers(int num1, int num2, int num3){
        return num1 + num2 +num3;
    }
    public static int sumOfNumbers(int a, int b, int c, int d ){
        return a+ b + c + d;
    }


}
