package day42_Exceptions;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws ArithmeticException {

        System.out.println("test started");

      //  System.out.println(8 / 0);


        try {
            System.out.println(8 / 0);
        }catch(ArithmeticException e) {
            System.out.println("catch block");
            System.out.println(e.getMessage());
            e.printStackTrace();

        }

        System.out.println("test completed");

    }
}
