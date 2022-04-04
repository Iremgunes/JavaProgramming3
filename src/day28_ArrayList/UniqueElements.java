package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("java");
        list.add("pyhton");
        list.add("c#");
        list.add("Ruby");
        list.add("c++");
        list.add("c++");

        System.out.println(list);

        ArrayList<String> unique = new ArrayList<>();

        for (String each:list ) {
            if(list.indexOf(each) == list.lastIndexOf(each)){
                //System.out.println(each +" is unique");
                unique.add(each);
            }
        }

        System.out.println(unique );

        boolean r3 = list.contains("java");

        System.out.println(r3);

        System.out.println("---------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2);

        System.out.println(list1.equals(list2));

        System.out.println(list1.get(2).equals(list2.get(1)));

        System.out.println("---------------");

        boolean r4 = list.isEmpty();

        System.out.println("r4 = " + r4);

        System.out.println("----------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

       // System.out.println("numbers = " + numbers);

        System.out.println(numbers);

    }



}
