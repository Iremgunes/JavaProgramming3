package ReviewWeek.Loops;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "AABBBCCDD";
        char ch = 'B';

        int frequency = 0;


        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if(ch==each){
                frequency++;
            }

        }

        System.out.println("frequency of B = " + frequency);




    }
}
