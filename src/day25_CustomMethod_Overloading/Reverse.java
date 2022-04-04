package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        String[] array = {"salim", "esma", "irem", "mehmet eren"};

        String[] reverse = reverse(array);

        System.out.println(Arrays.toString(reverse));
    }

    public static String[] reverse(String[] array){

        String[] newArray = new String[array.length];

        for (int i = 0, j= array.length -1; i < array.length; i++, j--) {

            newArray[j] = array[i];
        }

        return newArray;
    }
}
