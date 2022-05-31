package ReviewWeek.Loops;

public class Reverse {
    public static void main(String[] args) {


        String word = "racecar";

        String newWord = "";

        for (int i = word.length()-1; i >=0; i--) {
            newWord += word.charAt(i);
        }

        System.out.println("newWord = " + newWord);

        if(newWord.equals(word)){
            System.out.println(word + " is palindrome");
        }


    }
}
