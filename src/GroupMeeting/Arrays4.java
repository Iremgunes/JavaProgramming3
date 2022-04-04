package GroupMeeting;

import utilities.ArraysUtility;

import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt() };


        for (int each : nums) {
            int count = 0;
            for (int element : nums) {
                if(each==element){
                    count++;
                }

            }
            if(count==1 ){
                System.out.println(each + " is unique elements");
            }

        }


        input.close();






    }
}
