package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setInfo("Toyota", "camry", "white", 2021, 35000);

        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("BMW", "331is", "black", 2020, 45000);

        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Audi", "Q7", "Red", 2019, 40000);
        System.out.println(car3);

        //Car[] cars = {car1, car2,car3};
        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2,car3));
        System.out.println(carsList);

        for (Car each: carsList ) {
            System.out.println(each.brand + " : " + each.price);

        }

        System.out.println("----------------------------");

        carsList.removeIf(p-> p.brand.equalsIgnoreCase("BMW" )&& p.year <= 2008 && p.year <= 2008);

        carsList.removeIf(p-> p.brand.equalsIgnoreCase("toyota") && p.year >= 1995 && p.year<=1997);


    }



}
