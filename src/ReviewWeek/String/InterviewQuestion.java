package ReviewWeek.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class InterviewQuestion {


        public static void main(String[] args) {

        String word = "aabbccdddee";

        String result = "";

            for (int i = 0; i < word.length() ; i++) {
                char ch = word.charAt(i);
                int count = 0;

                for (int j = 0; j < word.length() ; j++) {
                    char ch1 = word.charAt(j);

                    if(ch==ch1){
                        count++;
                    }

                }
                if(result.contains("" + ch)){
                    continue;
                }


                result+=ch;
                result+=count;
            }
            System.out.println("result = " + result);

            String[] array = word.split("");
            Set<String> set = new LinkedHashSet<>(Arrays.asList(array));

            String result1 = "";

            for (String each : set) {
                int frequency = Collections.frequency(Arrays.asList(array), each);

                result1+= each + frequency;

            }

            System.out.println("result1 = " + result1);








        }



}
