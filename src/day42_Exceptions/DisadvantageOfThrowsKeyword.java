package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello");

        sleep(2.5);

        System.out.println("hello world");

        System.out.println("---------------------");

        System.out.println("hello");

        MorningWorkOut.sleep(2.5);

        System.out.println("cydeo");
    }

    public static void sleep(double seconds) throws InterruptedException {
        Thread.sleep((long) (seconds*1000));
    }
}
