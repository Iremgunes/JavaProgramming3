package GroupMeeting;

import java.util.Arrays;
import java.util.Locale;

public class Arrays6 {
    public static void main(String[] args) {

        String str = "I love Java";

        String[] words = str.split(" ");

        System.out.println(Arrays.toString(words));

        for (int i = words.length-1; i>=0 ; i--) {
            System.out.print(words[i] + " ");

        }
        System.out.println();

        for (String word : words) {
            String reverse= "";
            for (int i = word.length()-1; i >=0 ; i--) {
                reverse += word.charAt(i);
            }
            System.out.print(reverse + " ");
        }
        System.out.println();




    }
}
