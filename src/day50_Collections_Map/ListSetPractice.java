package day50_Collections_Map;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        System.out.println("set = " + set);
        System.out.println("set size is : " + set.size());

       Integer[] array = set.toArray(new Integer[0]);
        System.out.println("array is = " + Arrays.toString(array));

        List<Integer> arrayList = new ArrayList<>(set);
        System.out.println("arrayList is = " + arrayList);




    }
}
