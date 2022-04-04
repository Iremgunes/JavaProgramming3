package GroupMeeting;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }

        System.out.println(Arrays.toString(arr));


/*
        for (String each : arr ) {
            each = input.nextLine();
        }

        System.out.println(Arrays.toString(arr));

 */
        for (String each : arr ) {
            System.out.println(each.substring(0,3));
        }


        input.close();

    }
}
