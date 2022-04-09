package day37_Inheritance.phoneTask;

public class Nokia extends Phone{

    public Nokia(String brand, String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefense(){
        System.out.println(brand + " " + model + " is as self defense tool");
    }




}
