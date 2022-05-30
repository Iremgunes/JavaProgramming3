package day13_String;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        /*
        char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);
         */

        System.out.println("------------");

        String s1 = "Batch 25 is the best Batch";

        int totalCharacters = s1.length();
        System.out.println("totalCharacters = " + totalCharacters);
        char lastChar = s1.charAt(s1.length() - 1 );

        System.out.println("lastChar = " + lastChar);





    }
}
