package day50_Collections_Map;

import java.util.*;

public class RemoveEvenNumbers {
    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6,100,90,80,75,45,35,25,15));

        //set.removeIf(p-> p%2 ==0);

        System.out.println("set = " + set);

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()){
            if(it.next()%2==0){
                it.remove();
            }
        }
        /*
        or we can solve this

        for (Iterator<Integer> i= set.iterator(); i.hasNext()  ; ) {
            if(i.next()%2==0){
                i.remove();
            }
        }

         */
        System.out.println("set = " + set);

    }
}
