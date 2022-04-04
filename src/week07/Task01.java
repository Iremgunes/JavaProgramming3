package week07;

public class Task01 {
    public static void main(String[] args) {
        /*
        Print below pattern using loop

            1
            2 6
            3 7 10
            4 8 11 13
            5 9 12 14 15
         */

        int row = 5;

        for (int i = 1; i <= row ; i++) {

            int value = i;

            for (int col = 1; col <= i ; col++) {
                System.out.print(value + " ");
                value += row - col;
            }
            System.out.println();
        }
    }
}
