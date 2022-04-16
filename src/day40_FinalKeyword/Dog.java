package day40_FinalKeyword;

public final class Dog extends Animal{

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    @Override
    public void eat() {
        System.out.println("dog is eateing dog's food");
    }

    public final void drink1(){
        System.out.println(getName() + " is drink the beer");
    }
}
