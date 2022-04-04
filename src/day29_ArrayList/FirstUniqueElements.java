package day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        System.out.println(list);

        int count = 0;
        for (Integer element: list) {
               for (Integer each : list) {
                if(element == each){
                    count++;
                }

               }
            if(count == 1){
                System.out.println(element + " is unique ");
            }
        }


    }
}
