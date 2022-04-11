package day38_Inheritance.CarTask;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2020, 20000, "Gray", 12000);
        //parkinglot has toyota

        toyota.start();

        Tesla tesla = new Tesla("Model S", 2022, 250000, "black", 1000);

        tesla.start();

        BMW bmw = new BMW("XS", 2019, 20000, "navy", 1200);

        bmw.start();


    }
}
