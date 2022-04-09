package day36_Inheritence.AnimalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Musky", 'M', 2, "small", "white");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        System.out.println(dog);


         Cat cat = new Cat();

         cat.setInfo("Tarçın", "Brritish", 'M', 3, "small", "black");

         cat.eat();
         cat.drink();
         cat.sleep();
         cat.move();
         cat.meow();

        System.out.println(cat);

        Tiger tiger = new Tiger();

        tiger.setInfo("Tiger", "wild", 'M', 5, "lARGE", "yellow");
        tiger.hunt();
        tiger.roar();
        tiger.eat();
        tiger.drink();
        tiger.move();
        System.out.println(tiger);






    }



}
