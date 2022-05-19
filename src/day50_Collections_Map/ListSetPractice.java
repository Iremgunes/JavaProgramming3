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

       //List<String> names = null;
     //  System.out.println(names.size()); nullPointerException

        System.out.println("---------------------------");

        //pop()
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', 'D'));

        System.out.println("chars = " + chars);

        ((Stack)chars).pop();
        System.out.println("chars = " + chars);

        ((Stack<Character>) chars).peek();
        System.out.println("chars = " + chars);

        System.out.println();

        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));
        System.out.println("names = " + names);

        ( (LinkedList<String>)names).poll();
        System.out.println("names = " + names);












    }
}
