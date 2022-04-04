package week06;

public class PrintAllLetters {
    public static void main(String[] args) {

        for (char letter = 'a'; letter <= 'z' ; letter++) {

            System.out.print(  letter + " ");

        }

        System.out.println();

        for (int i = 65; i <= 90 ; i++) {
            System.out.print((char)i + " ");

        }




    }
}
