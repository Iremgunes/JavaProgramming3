package day16_ForLoopAndString;

public class RemoveDuplicates {
    public static void main(String[] args) {
/*
2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding
 */

        String str = "aabbaacc";

        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            String ch = "" + str.charAt(i);

            if (!result.contains(ch)) {
                result += ch;
            }

        }
        System.out.println("result = " + result);

    }
}
