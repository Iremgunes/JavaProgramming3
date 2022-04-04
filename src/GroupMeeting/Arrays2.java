package GroupMeeting;

import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        for (String each :words ) {
            System.out.println("" + each.charAt(0) + "" + each.charAt(each.length() -1));
            // ya da System.out.println(each.substring(0,1) + each.substring(each.length()-1));
        }

        input.close();




    }
}
