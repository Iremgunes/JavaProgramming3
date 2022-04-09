package day37_Inheritance.AnimalTask;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex", "Husky", 'M', 2, "Medium", "white") ;
        System.out.println(dog1);

       Cat cat1 = new Cat("minnoş", "british", 'F', 1, "Small", "black");
        System.out.println(cat1);
        cat1.scratch();




    }
}
