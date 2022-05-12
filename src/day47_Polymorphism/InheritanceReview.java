package day47_Polymorphism;

public class InheritanceReview {

    int a;

    public InheritanceReview(int a) {
        System.out.println("parent class constructor");
    }

    void method(){

    }

}

class A extends InheritanceReview{
    public A(int a) {
        super(a);
    }
}

class B extends InheritanceReview{
    public B(int a) {
        super(a);
    }
}

class C extends InheritanceReview{
    public C(int a) {
        super(a);
    }
}



