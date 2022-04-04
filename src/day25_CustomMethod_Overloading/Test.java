package day25_CustomMethod_Overloading;


import utilities.StringUtility;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("----------------------");

        String str1 = "wooden spoon";

       String reverse = StringUtility.reverse(str1);

        System.out.println(reverse);

        System.out.println("---------------------");

        String str3 = "word";

        boolean palindrome = StringUtility.isPalindrome(str3);

        System.out.println("palindrome = " + palindrome);
        
        String s1 = "irem";
        String s2 = "meri";
        
        boolean anagram = StringUtility.anagram(s1, s2);
        System.out.println("anagram = " + anagram);
        


    }






}
