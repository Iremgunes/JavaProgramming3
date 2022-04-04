package GroupMeeting;

public class IndexNumber {
    public static void main(String[] args) {


        String str = "aabbbccddee";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);

                if (ch == each) {
                    frequency++;
                }

            }
            if (frequency == 2) {
                //System.out.println(ch);
               // System.out.println(str.indexOf(ch));
                result += "" + ch;
                break;


            }
        }
        System.out.println(result);
    }
}
