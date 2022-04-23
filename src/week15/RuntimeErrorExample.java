package week15;

public class RuntimeErrorExample {

    public static void main(String[] args) {

        System.out.println("hello");
        try{
            System.out.println(5/0);
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
        System.out.println("how are you today?");
        System.out.println("some more lines of code");

    }
}
