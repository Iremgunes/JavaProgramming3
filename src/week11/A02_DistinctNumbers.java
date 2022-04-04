package week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A02_DistinctNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("enter integers (input ends with 0 : ");

        int value;
        do {
            value = input.nextInt();
            if(!list.contains(value)  && value != 0){
                list.add(value);
            }
        }while (value!=0);

        for (Integer numbers : list ) {
            System.out.print(numbers + " ");
        }
        System.out.println();

        System.out.println("the size of our array " + list.size());
        System.out.println(list);
        Collections.sort(list);
        System.out.println("list = " + list);


        int max = Collections.max(list);
        int min = Collections.min(list);

        Collections.shuffle(list);
        System.out.println(list);
        input.close();


    }
}
