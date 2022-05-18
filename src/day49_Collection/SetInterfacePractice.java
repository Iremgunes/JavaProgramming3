package day49_Collection;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(500);
        list1.add(55);
        list1.add(100);
        list1.add(2);
        list1.add(2);
        System.out.println("Array List is = " + list1);

        List<Integer> list2 = new LinkedList<>();
        list2.add(500);
        list2.add(55);
        list2.add(100);
        list2.add(2);
        list2.add(2);

        System.out.println("linked List is = " + list2);

        Set<Integer> set1 = new HashSet<>();

        set1.add(500);
        set1.add(55);
        set1.add(100);
        set1.add(2);
        set1.add(2);
        set1.add(null);

        System.out.println("HashSet is = " + set1);
        System.out.println(set1.size());
   //     System.out.println(set1.get(4));

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(500);
        linkedHashSet.add(55);
        linkedHashSet.add(100);
        linkedHashSet.add(2);
        linkedHashSet.add(2);
        linkedHashSet.add(null);


        System.out.println("LinkedHasSert is = " + linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(500);
        treeSet.add(55);
        treeSet.add(100);
        treeSet.add(2);
        treeSet.add(2);
     // treeSet.add(null); //it doesnt accept null NullPointerException
        treeSet.add(1);

        System.out.println("Tree Set is = " + treeSet);

        System.out.println("----------------------------------");

        //String str = null;

       // System.out.println(str.charAt(0));
        //NullPointerException

      //  String str1 = "";
     //   System.out.println(str1.charAt(0));
//StringIndexOutOfBoundsException




    }


}
