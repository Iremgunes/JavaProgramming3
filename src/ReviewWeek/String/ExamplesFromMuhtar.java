package ReviewWeek.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

        /*
        String[] array1 = word.split("");
        String[] array2 = word.split(" ");

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array1));


        System.out.println(Arrays.toString(array2));

         */



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

        String word1 = "earth";
        String word2 = "heart";

        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1,ch2));

        System.out.println("-----------------------------");

        //reemove duplicates 2 hali var içeren ve içermeyen şeklinde

        String str = "aaabbbcccd";

        String result ="" ;

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if(result.contains("" + each)){
                continue;

            }
            result += str.charAt(i);

        }
        System.out.println("str = " + str);

         System.out.println("result = " + result);

        System.out.println("--------------------");

        //frequency of element

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

        //2. solution

        String[] arr = str3.split("");
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        int fre = Collections.frequency(list, "D");
        System.out.println("fre = " + fre);

        System.out.println("-----------------------------");

        // frequency of word
        String word3 = "JavaJavaJava";

        int frequency2 = 0;

        for (int i = 0; i <=  word3.length()-4; i++) {

            String eachSub = word3.substring(i, (i+4));

            if(eachSub.equals("Java")){
                frequency2++;
            }
        }

        for (int i = 0; i < word3.length()-"java".length() ; i++) {
            String subNew = word3.substring(i, (i+"java".length()));

        }

        System.out.println("frequency2 : " + frequency2);

        System.out.println("-----------------------------------");

        String str22 = "abcde";
        String[] array = str22.split("");

        System.out.println(Arrays.toString(array));



    }
}
