package week07;

public class Task03 {
    public static void main(String[] args) {

        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
        System.out.println("---------------------------------");

        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
               if(j%3 ==1){
                   System.out.print(1 + " ");
               }else if(j%3 == 2){
                   System.out.print(2 + " ");
               }else {
                   System.out.print(3 + " ");
               }

            }
            System.out.println();
        }



    }
}
