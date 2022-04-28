package Replit;

public class Test {
    static int a = 50;

    public static void main(String[] args) {
        a = 100;
        try {
            a =200;
        }catch (Exception e){
            a = 300;
        }finally {
            a =400;
        }
        System.out.println(a);

        try {
            throw new ArithmeticException();
        } catch (NullPointerException e){
            System.out.println("null");
        }catch (ArithmeticException e) {
            System.out.println("ARithmetic");
        } catch (RuntimeException e){
            System.out.println("runtime");
        }

    }


    static {
        a = 500;
    }




}
