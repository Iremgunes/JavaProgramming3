package day16_ForLoopAndString;

public class UniqueCharacters {
    public static void main(String[] args) {
        /*
        3. Write a program that can return the unique characters from a String
			Ex:
				input:
					AABCCD
				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique

				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1
				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2
         */

        String name = "ooopl";

        String newVersion = "";

        for (int i = 0; i < name.length() ; i++) {

            char ch = name.charAt(i);

            if(name.indexOf(ch) == name.lastIndexOf(ch)){
                newVersion += ch;
            }

        }
        System.out.println("newVersion = " + newVersion);

        int num = -5;
        System.out.print(num++ + ",");
        System.out.print(num = 0);
        System.out.print("," + --num);

        short s = 13-9/3*10;
        s += -10;
        System.out.println("s = " + s);
        byte b = 104;
        boolean check = b < 100;
        if(check){
            b -= 100;
        }else {
            b = 50;
        }
        System.out.println("b = " + b);

        double decimal = 13.142;
        int whole = decimal < 20 ? 20 : 10;
        System.out.println(whole);

    }
}
