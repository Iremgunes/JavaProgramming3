package GroupMeeting;

public class DublicatedCharacters {
    public static void main(String[] args) {

        String str = "abbbccdd";


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length() ; j++) {
                char each = str.charAt(j);

                if(ch == each){
                    frequency++;
                }

            }
            if(frequency == 2){
                System.out.println(ch);
           break;

            }

        }


//1. Write a program that can return the first duplicated character from a string
    }
}
