package day42_Exceptions;

import java.io.FileNotFoundException;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("-------test 1 -----------");

        System.out.println("hello");
        Thread.sleep(3000);
        System.out.println("cydeo");

        System.out.println("--------------test1 completed-----------------");

        System.out.println("----test 2-----");

        System.out.println("hello");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("batch 25");

        System.out.println("---------test2 completed-----------");



    }
}
