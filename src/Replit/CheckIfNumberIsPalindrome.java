package Replit;

import java.util.Scanner;

public class CheckIfNumberIsPalindrome {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            isPalindrome(num);
            isPalindrome2(num);



          scan.close();
        }

        public static void isPalindrome(int num){
            int originalNum, reversedNum, remainder;

            originalNum=num;
            reversedNum=0;

            while (num != 0)
            {
                remainder = num % 10;
                reversedNum = reversedNum * 10 + remainder;
                num /= 10;
            }

            // check if reversedNum and originalNum are equal
            if (originalNum == reversedNum)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }

    public static void isPalindrome2(int num){

        String num1 = "" + num;
        String reverseNum = "";

        for (int i = num1.length()-1; i >=0; i--) {
            reverseNum += num1.charAt(i);
        }

        if(num1.equalsIgnoreCase(reverseNum)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }



}
