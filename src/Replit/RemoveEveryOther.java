package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveEveryOther {
    public static String removeEveryOther(ArrayList<String> words){

      words.removeIf(p-> words.indexOf(p) %2 ==0);


        return words.toString();
    }






    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(removeEveryOther(list));

    }

}

