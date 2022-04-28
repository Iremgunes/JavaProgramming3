package day43_Abstraction;

import java.util.Scanner;

public class Throw_vs_Throws {
    public static void main(String[] args) {

        System.out.println("enter your score");
        int score = new Scanner(System.in).nextInt();

        if(score<0 || score>100){
            throw new RuntimeException("invalid score: " + score);
        }

        if (score>=90){
            System.out.println("a");
        }else if (score>=80){
            System.out.println("b");
        }else if (score>=70){
            System.out.println("c");
        }else if (score>=60){
            System.out.println("d");
        }else {
            System.out.println("f");
        }
    }

    public static void method1() throws InterruptedException{
        Thread.sleep(5000);
    }
}
