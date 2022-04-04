package day30_CustomClass;

import java.util.ArrayList;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name ="Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "small";
        dog1.color = "white";

        Dog dog2 = new Dog();
        dog2.name ="ACE";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "large";
        dog2.color = "white & black";

        Dog dog3 = new Dog();
       dog3.setInfo("Jack", "German Shepard", 2, 'M', "large", "black");

       Dog dog4 = new Dog();
       dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();

        dog2.bark();

        Dog[] dogs = {dog1,dog2,dog3, dog4};

        ArrayList<Dog> femaleDogs = new ArrayList<>();

        for (Dog each : dogs) {
            if(each.gender == 'F'){
                femaleDogs.add(each);
            }
        }

        System.out.println("femaleDogs = " + femaleDogs);

        ArrayList<Dog> maleDogs = new ArrayList<>();




    }

}
