package day32_Constructor;

public class Car {

    public String brand;
    public String model;
    public  int year;
    public double price;
    public String color;


    public Car(String brand){
        this.brand = brand;
    }

    public Car(String brand, String model){
        this(brand);
        this.model = model;
    }

    public Car(String brand, String model, int year){
        this(brand, model);
        this.year = year;
    }

    public Car(String brand, String model, int year, double price){
        this(brand, model, year);
        this.price = price;
    }

    public Car(String brand, String model, int year, double price, String color){
        this(brand, model, year, price);
        this.color = color;
    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car car1 = new  Car("Opel");
        System.out.println("car1 = " + car1);

        Car car2 = new Car("Honda", "Accord");
        System.out.println("car2 = " + car2);

        Car car3 = new Car("Lexus", "RX350", 2021 );
        System.out.println("car3 = " + car3);

        Car car4 = new Car("BMW", "X6", 2020, 50000);
        System.out.println("car4 = " + car4);

        Car car5 = new Car("Tesla", "12t", 2022, 25000, "black");
        System.out.println("car5 = " + car5);




    }



}
