package day28_ArrayList;

public class StrongPassword {
    public static void main(String[] args) {

        String password = "123İrem456.";

        boolean r = isStrongPassword(password);

        System.out.println("r = " + r);


    }

    public static boolean isStrongPassword(String password){

        boolean r1 = password.length() >=0 && !password.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; // has lower case
        boolean r4 = false; // has special char
        boolean r5 = false; // has digit

        char[] chars = password.toCharArray();

        for (char each : chars) {

            if(Character.isUpperCase(each)){
                r2 = true;
            }else if(Character.isLowerCase(each)){
                r3 = true;
            }else if(Character.isDigit(each)){
                r5 = true;
            }else{
                r4 = true;
            }

        }

        boolean strongPassword = r1 && r2 && r3 && r4 && r5;

        System.out.println("strongPassword = " + strongPassword);

        return strongPassword;



    }




}
