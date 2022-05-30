package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your age please");
        int age = input.nextInt();

        System.out.println("enter your gender");
        String gender = input.next();

        System.out.println("enter your phone number please");
        long phoneNumber = input.nextLong();

        input.nextLine();
        System.out.println("enter your full name");
        String fullName = input.nextLine();

        System.out.println("enter your school name");
        String schoolName = input.nextLine();

        System.out.println("enter your city name");
        String cityName = input.nextLine();

        System.out.println("enter your state name");
        String stateName = input.next();

        System.out.println("enter your building number");
        int buildingNumber = input.nextInt();

        input.nextLine();
        System.out.println("enter your street name");
        String streetName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("fullName = " + fullName);
        System.out.println("schoolName = " + schoolName);
        System.out.println("cityName = " + cityName);
        System.out.println("stateName = " + stateName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);

        input.close();


    }
}
