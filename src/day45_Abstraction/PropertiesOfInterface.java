package day45_Abstraction;

public interface PropertiesOfInterface {

    int a = 100;
    static int b = 200;
    /*
    public PropertiesOfInterface(int a){
        this.a = a;
    }
    constructor olazmaz
     */

    /*
    static {
        b = 100;
    }

     */

  /*
   public void method1(){
        System.out.println("instance method");
    }

   */



    public static void method2(){
        System.out.println("static method");
    }

    public abstract void method3();

    public default void method4(){
        System.out.println("default method");
    }



}


class Test implements PropertiesOfInterface{


    @Override
    public void method3() {

    }

    public static void main(String[] args) {

        new Test().method4();



    }
}
