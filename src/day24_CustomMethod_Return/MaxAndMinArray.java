package day24_CustomMethod_Return;

public class MaxAndMinArray {
    public static void main(String[] args) {

       int max = maxOfArray(54,88,82,632);
        System.out.println(max);

      //  int min = minOfArray(555,2223,564,50);
        //System.out.println(min);



        //System.out.println(max);
    }

    public static int maxOfArray(int a, int b, int c, int d){
        int[] numbers = {a,b,c,d};

        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] > max){
                max = numbers[i];
            }

        }
        return max;




    }

    /*
    public static int minOfArray(int[] array){

        int[] array = new int[array.length];

        int min = array[0];

        for (int i = 0; i < array.length; i++) {

            if(array[i] < min){
                min = array[i];
            }

        }
        return min;
        */


}
