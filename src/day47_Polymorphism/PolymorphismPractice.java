package day47_Polymorphism;

import day38_Inheritance.CarTask.BMW;
import day38_Inheritance.CarTask.Car;
import day38_Inheritance.CarTask.Tesla;
import day38_Inheritance.CarTask.Toyota;

public class PolymorphismPractice {
    public static void main(String[] args) {
        Car[] cars = {

                new Toyota("Camry", 2020, 20000, "Gray", 12000),
                new Tesla("Model S", 2022, 250000, "black", 1000),
                new BMW("XS", 2019, 20000, "navy", 1200),
        };

        for(Car eachCar: cars){
            if(eachCar instanceof Toyota){
                if(eachCar.year>=2010 && eachCar.year<=2011){
                    System.out.println(eachCar);
                }
                }

            if(eachCar instanceof BMW){
                System.out.println(eachCar);
            }

            if(eachCar instanceof Tesla){
                if (eachCar.year>=2015 && eachCar.year<=2016){
                    System.out.println(eachCar);
                }
            }
        }

        System.out.println("--------------------------");

        Car carWithHighestMileage = cars[0];

        for ( Car eachCar: cars) {
            if(eachCar.miles > carWithHighestMileage.miles){
                carWithHighestMileage = eachCar;
            }
        }

        System.out.println(carWithHighestMileage);

        System.out.println("-------------------------------");

        Car carWithLowestMileage = cars[0];

        for ( Car eachCar: cars) {
            if(eachCar.miles < carWithLowestMileage.miles){
                carWithLowestMileage = eachCar;
            }
        }

        System.out.println(carWithLowestMileage);


    }








}
