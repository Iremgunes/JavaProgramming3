package day50_Collections_Map;

import java.util.*;

public class IterablePractice2 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmed", "John", "Ercan", "Mustafa", "Daniel", "Mohammed",
                "Ahmed", "ahmed", "Yulia", "Christina"));

        // remove all the names ahmed
        System.out.println("names = " + names);

        Iterator<String> it = names.iterator();
        System.out.println("it = " + it);

        while (it.hasNext()){
            if(it.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }

        System.out.println("names = " + names);

        System.out.println("------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmed", "John", "Ercan", "Mustafa", "Daniel", "Mohammed",
                "Ahmed", "ahmed", "Yulia", "Christina"));
        System.out.println("names2 = " + names2);

        for (Iterator<String> i= names2.iterator(); i.hasNext(); ) {
            if(i.next().equalsIgnoreCase("ahmed")){
                i.remove();
            }
        }

        System.out.println("names2 = " + names2);

        System.out.println("--------------------------");

        List<String> names3 = new ArrayList<>();
        names3.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmed", "John", "Ercan", "Mustafa", "Daniel", "Mohammed",
                "Ahmed", "ahmed", "Yulia", "Christina"));

        System.out.println("names3 = " + names3);

        names3.removeIf(each-> each.equalsIgnoreCase("ahmed"));

        System.out.println("names3 = " + names3);

        System.out.println("------------------------------------------");

        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,100,90,89,79,50));

        System.out.println("set = " + set);

        Iterator<Integer> q = set.iterator();

        while (q.hasNext()){
            if(q.next()%2==0){
                q.remove();
            }
        }

        System.out.println("set = " + set);






    }
}
