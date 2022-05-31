package ReviewWeek.Loops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aaabbccc";

        String newStr= "";

        for (int i = 0; i <str.length() ; i++) {
            if(!newStr.contains("" + str.charAt(i))){
                newStr += str.charAt(i);
            }

        }

        System.out.println("newStr = " + newStr);


    }
}
