package GroupMeeting;

public class TasksForNestedLoops {
    public static void main(String[] args) {

        System.out.println("              1. SHAPE            ");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------");
        System.out.println("               2. SHAPE          ");

        for (int i = 1; i <=7; i++) {
            for (int j = 1; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");

        System.out.println("           3. SHAPE");

        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------");

        System.out.println("           4. SHAPE");

        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }




    }
}
