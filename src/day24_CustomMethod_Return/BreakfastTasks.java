package day24_CustomMethod_Return;

import day02_HelloWorld.HelloWorld;

public class BreakfastTasks {
    public static void main(String[] args) {
        initials("irem", "güneş");
        initials("Ahmet", "Güneş");
        System.out.println("----------------");
        domain("aviremdanacioglu@gmail.com");
        System.out.println("---------------");
        nameOfMonth(7);
        nameOfMonth(111);
        System.out.println("-----------------------");
        nameOfDay(5);
        nameOfDay(55);
        nameOfDay(4);
        System.out.println("------------------");
        ages(45);
        ages(5);
        ages(-5);

    }

    public static void initials(String firstName, String lastName){
        //System.out.println("Hello world");
        String initial = firstName.charAt(0) + ". " + lastName.charAt(0) + ".";
        //System.out.println(firstName.charAt(0) + ". " + lastName.charAt(0) + ".");
        initial = initial.toUpperCase();
        System.out.println("initial: " + initial);

    }
    public static void domain(String email){

        String domain = email.substring(email.indexOf("@") +1, email.lastIndexOf("."));
        System.out.println("domain is: " + domain);
    }
    public static void nameOfMonth(int number){
       if(number>=1 && number<=12) {
           if (number == 1) {
               System.out.println("nameOfMonth is: January");
           } else if (number == 2) {
               System.out.println("nameOfMonth is: February");
           } else if (number == 3) {
               System.out.println("nameOfMonth is: March");
           } else if (number == 4) {
               System.out.println("nameOfMonth is: April");
           } else if (number == 5) {
               System.out.println("nameOfMonth is: may ");
           } else if (number == 6) {
               System.out.println("nameOfMonth is: jun");
           } else if (number == 7) {
               System.out.println("nameOfMonth is: july");
           } else if (number == 8) {
               System.out.println("nameOfMonth is: august");
           } else if (number == 9) {
               System.out.println("nameOfMonth is: september");
           } else if (number == 10) {
               System.out.println("nameOfMonth is: october");
           } else if (number == 11) {
               System.out.println("nameOfMonth is: november");
           } else {
               System.out.println("nameOfMonth is: jun");
           }

       }else{
           System.out.println("wrong number");
       }

       /*
       String name = "";
       name= (number==1)? "jan" :(number==2)? "feb" :(number ==3)? "march"
       :(number==4)? "april" :(number ==5)? "May" ........
        */

    }
    public static void nameOfDay(int number){
        String nameOfDay = "";

        if(number >= 1 && number <= 7){
            nameOfDay = (number==1)? "monday" :(number == 2)? "tuesday" :(number == 3)? "wednesday"
            :(number == 4)? "thursday" :(number==5)? "friday" :(number ==6)? "saturday" : "sunday";

            System.out.println("nameOfDay = " + nameOfDay);

        }else{
            System.out.println("invalid choice");
        }



    }
    public static void ages(int number){
        if(number >= 0 && number<=18){
            System.out.println("you are child");
        }else if(number>= 18 && number <= 100){
            System.out.println("you are ergin people");
        }else {
            System.out.println("your choise is invalid");
        }
    }








}
