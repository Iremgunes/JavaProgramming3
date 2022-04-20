package day42_Exceptions;

public class MorningWorkOut {
    public static void main(String[] args) {

        System.out.println("--------------------push up started-------------------------");

        for (int i = 1; i <=30 ; i++) {


            System.out.print("\rpush up " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println();
        System.out.println("push up completed");

        System.out.println(        );






    }

    public static void sleep(double seconds){

        try {
            Thread.sleep((long) (seconds * 1000));
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }


}
