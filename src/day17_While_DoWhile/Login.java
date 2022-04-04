package day17_While_DoWhile;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your user name: ");
        String u = scan.next();

        System.out.println("enter your password: ");
        String p = scan.next();

        if(u.equalsIgnoreCase("Cydeo") && p.equalsIgnoreCase("Cydeo123")){
            System.out.println("logged in");
        }else{
            int attemps =3 ;
            while(!( u.equalsIgnoreCase("Cydeo") && p.equalsIgnoreCase("Cydeo123"))&& attemps >0 ) {
                if(attemps == 1){
                    System.out.println("ITS YOUR LAST CHANCE");
                }
                System.out.println("invalid user name or password, please re-enter");
                System.out.println("enter your user name");
                u = scan.next();

                System.out.println("enter your password");
                p = scan.next();
                attemps--;
            }
            System.out.println("your account is locked" );
            }

        scan.close();



    }
}
