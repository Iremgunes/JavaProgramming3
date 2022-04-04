package day25_CustomMethod_Overloading;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int[] array = {222, 5553, 666698, 92130, 5};

        int a = maxOfArray(array);

        System.out.println(a);


    }

    public static int maxOfArray(int[] array){

        int max = array[0];

        for (int i = 0; i < array.length ; i++) {
            if(array[i] > max)
            {
                max = array[i];

            }

        }

        return max;


    }
}
