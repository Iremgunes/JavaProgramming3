package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "AAABBBCDDDDDDD";

        char ch = 'D';

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
           char eachchar = str.charAt(i);
           if(ch == eachchar){
               frequency++;
           }



        }
        System.out.println("frequency = " + frequency);


    }
}
