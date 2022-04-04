package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};

        int[] result = new int[array.length];

        for (int i = 0, j = array.length-1; i < array.length ; i++, j--) {
            result[j] = array[i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(result));

        System.out.println("--------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        ArrayList<Integer> reverseList = new ArrayList<>();

        for (int i = list.size() -1;i >= 0; i--) {
            int each = list.get(i);
            reverseList.add(each);
        }
        System.out.println(list);
        System.out.println(reverseList);




    }
}
