package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("main method");

    }

    static {//runs first before anytghing and only one time
        System.out.println("static block 1");
    }

    static {
        System.out.println("static block 2");
    }

    static {
        System.out.println("static block 3");
    }



}
