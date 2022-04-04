package week07;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "aabbccccd";
        String result = "";

        for (int i = 0; i < str.length() ; i++) {

            char c = str.charAt(i);

            int count =0;

            for (int j = 0; j < str.length(); j++) {

                if(c== str.charAt(j)){
                    count++;

                }
            }


            result += "" + c;

            result+= count;



        }


        System.out.println(result);
    }

}
