package day15;

public class ForLoopPractices {
    public static void main(String[] args) {

        for(int num = 15; num<= 45 ; num++){
            System.out.print(num + " ");
        }
        System.out.println(" ");

        System.out.println("---------------- ");

        for(int num2 = 100; num2>= 50; num2--){
            System.out.print(num2 + " ");
        }
        System.out.println();

        System.out.println("--------------------");

        for(int i = 1; i<= 55; i++){
            if(i% 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("-----------------");

        for(int i = 2; i <= 54; i += 2){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("--------------");



    }
}
