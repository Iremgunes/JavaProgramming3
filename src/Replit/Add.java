package Replit;

import java.util.ArrayList;

public class Add {

    public static ArrayList<String> test(){

        ArrayList<String> names = new ArrayList<String>();

        names.add("Hello");
        names.add("World");
        names.add("Cydeo");

        return names;

    }



    public static void main(String[] args) {
        System.out.println(test().size());
    }
}
