package day18_NestedLoops;

public class NestedLoopPractice2 {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <10 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <10 ; j++) {
                System.out.print(" * "+j + i);
            }
            System.out.println();
        }


    }
}
