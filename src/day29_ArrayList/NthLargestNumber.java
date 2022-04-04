package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        int max = Collections.max(list);

        list.removeIf(p-> Collections.max(list)==p);

        int maxSecond = Collections.max(list);

        System.out.println("maxSecond = " + maxSecond);



    }
}
