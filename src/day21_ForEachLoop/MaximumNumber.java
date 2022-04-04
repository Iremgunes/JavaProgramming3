package day21_ForEachLoop;

public class MaximumNumber {
    public static void main(String[] args) {
        int[] numbers = {5,66,2,3,58,789};
        int max = numbers[0];

        for ( int number: numbers) {
           if(number>max){
               max = number;
           }

        }
        System.out.println(max);
        System.out.println("-----------------------");



    }
}
