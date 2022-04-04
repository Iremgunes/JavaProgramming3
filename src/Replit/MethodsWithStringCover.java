package Replit;

import java.util.Scanner;

public class MethodsWithStringCover {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));


        in.close();

    }

    public static String coverString(String main, String coverME) {

      String coverString = "";

       if(!(main.contains(coverME))){
         coverString="["+ main + "]";
       }









       return coverString;

       /*

        int lastIndex=0;

        if(main.indexOf(coverME,lastIndex)==-1)
        {
            main="[" + main + "]";
            return main;
        }

        while(lastIndex != -1)
        {
            lastIndex = main.indexOf(coverME,lastIndex);

            if(lastIndex != -1)
            {
                main=main.substring(0,lastIndex) + "[" + coverME + "]" + main.substring(lastIndex+coverME.length());
                lastIndex += coverME.length()+2; // 2 for brackets
            }
        }

        return main;

        */







    }

    /*Your job is to write an important code that will :

    to search and find each appearance of coverME within main

    then surround it with square brackets [coverMe]

            if you cannot find the coverME within main then just return whole main itself covered [main].

    keep in mind that coverME value can be of any length.

            Examples:

    coverString("java methods", "me") ) ; ==> "java [me]thods"
    coverString("java methods", "me") ) ; ==> "java [me]thods"
    coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"
    coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"
    coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"
    coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"
    coverString("apples", "pears") ) ; ==> "[apples]"

     */



}





