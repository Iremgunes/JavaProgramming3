package ReviewWeek.String;

import java.util.Arrays;

public class ExamplesFromMuhtar {
    public static void main(String[] args) {

        String name = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        System.out.println(name == name2);

        String str1 = new String("Wooden Spoon");
        String str2 = new String("Wooden Spoon");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));


        System.out.println("-----------------------------------");

        String s1 = "Batch 25 is the best Batch";

        int totalCharacters = s1.length();
        System.out.println("totalCharacters = " + totalCharacters);

        char lastChar = s1.charAt(s1.length() - 1 );
        System.out.println("lastChar = " + lastChar);

        System.out.println("--------------------------------------------------");

        String email = "JohnSmith@yahoo.com";

        String email2 = email.replace("yahoo", "gmail");

        System.out.println("email2 = " + email2);
        System.out.println("email1 = " + email);

        System.out.println("------------------------------------");

        // reverse and palindrome
        String word = "Cybertek School";
        String reverse = "";

        for (int i = word.length() -1; i >= 0 ; i--) {
            reverse += word.charAt(i);
        }

        System.out.println("word = " + word);
        System.out.println("reverse = " + reverse);

        if(word.equalsIgnoreCase(reverse)){
            System.out.println(word +  " is palindrome");
        }else{
            System.out.println(word + " is not polindrome");
        }

        System.out.println("---------------------");

        //anagram

        String word1 = "Jane Eyre";
        String word2 = "Jean yEre";

        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1,ch2));

        System.out.println("-----------------------------");

        String str = "aaabbbcccd";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains("" + each)){
                result += str.charAt(i);
            }
        }
        System.out.println("str = " + str);

        System.out.println("result = " + result);

        System.out.println("--------------------");

        String str3 = "AAABBBCDDDDDDD";

        char ch = 'D';

        int frequency = 0;

        for (int i = 0; i < str3.length(); i++) {
            char eachchar = str3.charAt(i);
            if(ch == eachchar){
                frequency++;
            }



        }
        System.out.println("frequency = " + frequency);

        System.out.println("-----------------------------");

    }
}
