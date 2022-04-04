package day25_CustomMethod_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {
        int result = sumOf2Numbers(25, 65);

        System.out.println("result = " + result);

        int result2 = sumOf2Numbers(25, -50);

        System.out.println("result2 = " + result2);

        int result3 = sumOf3Numbers(10,20,30);
        System.out.println("result3 = " + result3);

        int result4 = sumOf4Numbers(55,20,60,70);
        System.out.println("result4 = " + result4);

    }

    public static int sumOf2Numbers(int num1, int num2){
      //  int sum = num1 + num2;
        // return sum;
        return num1 + num2;
    }
    public static int sumOf3Numbers(int num1, int num2, int num3){
        return num1 + num2 +num3;
    }
    public static int sumOf4Numbers(int a, int b, int c, int d ){
        return a+ b + c + d;
    }
}
