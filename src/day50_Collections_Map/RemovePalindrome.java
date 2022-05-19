package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindrome {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
           "Java", "Python", "Cydeo", "Car", "Civic", "level", "radar", "revier", "racecar", "kayak"
        ));

        Iterator<String> it = names.iterator();

        while (it.hasNext()){
            String each = it.next();
            String reverse = "";

            for (int i = each.length()-1; i >=0 ; i--) {
                reverse += each.charAt(i);
            }

            if (each.equalsIgnoreCase(reverse)){
                it.remove();
            }
        }

        System.out.println("names = " + names);

        System.out.println("------------------------");
        /*
        Predicate<String> palindrome = str-> {
        String reverse = "";
        for(int i = str.length()-1; i>=0; i--){
        reverse += str.charAt(i)
        }
        return.reverse.equlasIgnoreCase(str);

        }

        names.removeIf(palindrome);
         */





    }
}
