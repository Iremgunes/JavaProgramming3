package day41_Exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("test started");

        try{
            System.out.println(9/0);
            System.out.println("try block");

        }catch(ArithmeticException e){
            System.out.println("catch block");
            System.out.println("aritmetic execption is was occured");
        }

        //System.out.println(9/0);//ArithmeticException

        System.out.println("test completed");


        System.out.println("---------------------");

        System.out.println("test2 started");

        int[] numbers = {1,2,3,4,5};

        try {
            System.out.println(numbers[200]);
            System.out.println("try block");

        }catch(RuntimeException e){
         //  e.printStackTrace();

            System.out.println(e.getMessage());
        }
        System.out.println("test2 completed");

        System.out.println("------------------");

        System.out.println("test3 started");

        try {
            System.out.println("cydeo".substring(2, 0));
        } catch(StringIndexOutOfBoundsException e){
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("test3 completed");

    }
}
