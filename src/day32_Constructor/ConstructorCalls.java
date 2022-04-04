package day32_Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("default constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("constructor with int argument");

    }

    public ConstructorCalls(int a, double b){
        this(15);
        System.out.println("constructor with int a and double b argument");
    }

    public ConstructorCalls(String str){
        this();

        System.out.println("constructor with string argument");
    }

    public String toString() {
        return "ConstructorCalls{}";
    }

    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls();
        System.out.println("-----------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(10);
        System.out.println("---------------------");

        ConstructorCalls obj3 = new ConstructorCalls(15,20.5);
        System.out.println("--------------------------------");

        ConstructorCalls obj4= new ConstructorCalls("Java");
        System.out.println("--------------------------");






    }

}
