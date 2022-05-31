package ReviewWeek.String;

import java.util.*;

public class UniqueCharacter {
    public static void main(String[] args) {

        String str ="cdsaacBddeff";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j <str.length() ; j++) {
                char ch1 = str.charAt(j);

                if(ch==ch1){
                    count++;
                }
            }

            if(count==1){
                result+=ch;
            }

        }

        System.out.println("result = " + result);



        String result1 = "";
        String[] array = str.split("");
        List<String> list = new LinkedList<>(Arrays.asList(array));
        Set<String> set = new TreeSet<>(Arrays.asList(array));


        System.out.println("set = " + set);
        System.out.println("list = " + list);

        for (String each : set) {
            int frequency = Collections.frequency(Arrays.asList(array), each);

            if(frequency==1){
                result1+=each;
                break;
            }
        }

        System.out.println("result1 = " + result1);
    }
}
