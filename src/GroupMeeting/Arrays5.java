package GroupMeeting;

public class Arrays5 {
    public static void main(String[] args) {
         String str = "ABCvyz456!'^+%";

         char[] chars = str.toCharArray();


         String upperLetters = "";
         String lowerLetters = "";
         String specials = "";
         String digits = "";

         for (char each : chars) {
            if(Character.isLetter(each)){
                if(Character.isUpperCase(each)){
                    upperLetters += each;
                }else{
                    lowerLetters+= each;
                }

            }else if(Character.isDigit(each)){
                digits += each;
            }else{
                specials += each;
            }
        }

        System.out.println("digits = " + digits);
        System.out.println("specials = " + specials);
        System.out.println("lowerLetters = " + lowerLetters);
        System.out.println("upperLetters = " + upperLetters);

    }
}
