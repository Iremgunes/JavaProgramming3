package day43_Abstraction.Car;

public class CarShop {

    public static void main(String[] args) {

        //Car car = new Car("Cydeo", "25", "blue", 2020, 10000) ;
        // we cannot create object from abstract class because abstaract class is not concrete


    Honda honda = new Honda("Accord", "Black", 2019, 30000);

    Audi audi = new Audi("O7", "blue", 2020, 45000);

    Tesla tesla = new Tesla("Model3", "white", 2021, 600000);


        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        honda.setColor("red");
        audi.setColor("pink");
        tesla.setColor("green");

        System.out.println("------------------------");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

    }



}
