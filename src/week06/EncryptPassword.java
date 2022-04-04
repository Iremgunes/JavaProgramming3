package week06;


public class EncryptPassword {
    public static void main(String[] args) {
/**
 * 5.
 * Given a string password. Encrypt with "x" a given password
 * and print.
 * (do with for loop)
 * password: cydeo
 * encrypt with char :x
 * output:cxyxdxexox
 */

String password = "cydeo";

char encChar = 'x';

String newPassword = "";

        for (int i = 0; i < password.length() ; i++) {

           newPassword += "" + password.charAt(i) + encChar;

        }

        System.out.println("newPassword = " + newPassword);

    }
}
