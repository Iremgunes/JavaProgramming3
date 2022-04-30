package day44_Abstraction.AnimalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog("dog", "husky", 'M', 2, "small","white" );


        System.out.println(dog);
        dog.eat();
        dog.drink();

    }
}
