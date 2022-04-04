package day18_NestedLoops;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter a username : ");
        String u = scan.next();

        System.out.println("please enter your password : ");
        String p = scan.next();

        if(u.equals("Cydeo")&& p.equals("WoodenSpoon")){
            System.out.println("logged in");
        }else{

            for (int i = 0; i < 3; i++) {
                System.out.println("incorrect username or password");
                System.out.println("please enter a username : ");
                u = scan.next();

                System.out.println("please enter your password : ");
                p = scan.next();


                if(u.equals("Cydeo")&& p.equals("WoodenSpoon")){
                    System.out.println("logged in");
                    break;}

            }
            if(!(u.equals("Cydeo")&& p.equals("WoodenSpoon")) )
                System.err.println("your account is locked, please contact support team");
        }



        scan.close();

    }
}
