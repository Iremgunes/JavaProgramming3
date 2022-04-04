package week11;

import java.util.Arrays;

public class A01_AddElementToArray {

    public static void main(String[] args) {
        String[] browserTypes = {"Chrome", "Firebox", "Sfari"};

        String newBrowserOne = "Edge";
        String newBrowserTwo = "Opera";

        browserTypes = addElement(browserTypes, newBrowserOne);
        browserTypes = addElement(browserTypes, newBrowserTwo);

        System.out.println(Arrays.toString(browserTypes));


    }

    public static String[] addElement(String[] array, String element){
        String[] newArray = new String[array.length +1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];

        }

        newArray[array.length] = element;

        return newArray;


    }



}
