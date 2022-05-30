package day16_ForLoopAndString;

public class Reverse {
    public static void main(String[] args) {
    /*
        1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
     */

        String str = "I love Java, Java is fun";
// index:     01234
        String result = "";
        /*
        result += str.charAt(11);
        result += str.charAt(10);
        result += str.charAt(9);
        */

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }

        System.out.println(result);

        String name = "İrem Güneş";
        String result1 = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            result1 += name.charAt(i);

        }
        System.out.println(result1);

    }
}
