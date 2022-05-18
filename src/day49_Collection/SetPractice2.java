package day49_Collection;

import java.util.*;

public class SetPractice2 {
    public static void main(String[] args) {

        String[] arr = {"wooden spoon", "book", "phone", "wooden spoon", "wooden spoon",
        "wooden spoon", "wooden spoon", "milk", "eggs", "coke", "paper towels"};

        Set<String> set1 = new HashSet<>(Arrays.asList(arr));

        String[] arr1 = set1.toArray(new String[0]);

        System.out.println(set1);
        System.out.println(Arrays.toString(arr1));

        String[] arr2 = {"wooden spoon", "book", "phone", "wooden spoon", "wooden spoon",
                "wooden spoon", "wooden spoon", "milk", "eggs", "coke", "paper towels"};

        arr2 =  new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);

        System.out.println(Arrays.toString(arr2));

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000,300,1000,200,300,400,500,600,10,20,10,30,40,30,20,10));

       list =  new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(list);

        System.out.println("--------------------------");

        String[] array = {"A", "A", "B", "C"};
        System.out.println("String array is =" + Arrays.toString(array));

        Set<String> s = new LinkedHashSet<>();
        s.addAll(Arrays.asList(array));


        System.out.println("Linked Hash set s is = " + s);

        s.addAll(Arrays.asList("D", "E", "F"));

        System.out.println("s new is = " + s);

        System.out.println("--------------------");

        Integer[] nums = {1,2,1,1,2,2,2,3,3,3,3,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);
        System.out.println("nums = " + Arrays.toString(nums));

        System.out.println("fifth element is = " + nums[4]);

        System.out.println("-------------------------------");

        String str = "aaaaabbbbbccccddddeee";
        //a5b5c4d4e3
        String result = "";

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            int count = Collections.frequency(Arrays.asList(str.split("")),each);
            result += each+count;
        }

        System.out.println("result = " + result);

        //char[] arrayStr = str.toCharArray();

       Set<String> linkedHashSet2 =  new LinkedHashSet<>(Arrays.asList(str.split("")));

        System.out.println("linkedHashSet2 = " + linkedHashSet2);

        System.out.println("----------------------");

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet"));
        System.out.println("names = " + names);

        int countAhmetinArray = Collections.frequency(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet"), "Ahmet");
        System.out.println("countAhmetinArray = " + countAhmetinArray);

        System.out.println(names.toArray(new String[0]) [2]);

        int countAhmetinLinkedSet = Collections.frequency(names, "Ahmet");
        System.out.println("countAhmetinLinkedSet = " + countAhmetinLinkedSet);















    }
}
