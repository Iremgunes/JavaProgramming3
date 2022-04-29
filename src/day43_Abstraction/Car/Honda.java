package day43_Abstraction.Car;

public class Honda extends Car{

    public Honda(String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    public void stop(){
        System.out.println();
    }

  public void start(){
      System.out.println("twist the key to ignition");
  }




}
