package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);

       /*
        for (int i = 0; i < list.size(); i++) {

            if(list.get(i) % 2 != 0){
                list.remove(i);
            }
        }

        */

        list.removeIf(p -> p < 5);

        System.out.println(list);

        list.removeIf(p-> p%2 == 0);

        System.out.println(list);
        System.out.println("-----------------------");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf(each-> each%2==0);

        System.out.println(list2);
        System.out.println("-------------------");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Pyhton", "JavaScript", "C#", "C++", "Java", "Java"));

        list3.removeIf(e-> e.startsWith("J"));

        System.out.println(list3);

        System.out.println("----------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar","Level", "Eye","Java", "Python", "Cydeo"));

        names.removeIf(name-> !StringUtility.isPalindrome(name));

        System.out.println(names);
/*
        String str = "amma";

        String str2= StringUtility.reverse(str);

        System.out.println("str2 = " + str2);
        System.out.println("str = " + str);

        boolean a = StringUtility.isPalindrome(str);
        System.out.println("a = " + a);

 */



        
    }
}
