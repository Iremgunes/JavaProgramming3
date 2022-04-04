package day23_CustomMethods_Void;

public class CustomMethodsPractice {
    // create a function that can print hello world 5 times
    // and hello cydeo

    public static void main(String[] args) {

        /*
        for (int i = 0; i < 5; i++) {
            print();
            System.out.println(i+1);
        }

         */
        print();
        System.out.println("-----------------------------");
        helloCydeo5Times();
        System.out.println("-----------------------");
        evenNumbers();


    }

    public static void print(){

        for (int i = 0; i <5 ; i++) {
            System.out.println("hello world");
            //System.out.println("hello cydeo");
        }
    }

    public static void helloCydeo5Times (){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello cydeo");
        }
    }

    // create a new function than can all the even numberd from 1-10-- even numbers

    public static void evenNumbers(){
        for (int i = 2; i <11 ; i+=2) {
            System.out.print(i + " ");
        }
    }
}
