package day32_Constructor;

public class Carpet {

    public double length;
    public double width;
    public double unitPrice;
    public boolean isPersian;


    public Carpet(double length, double width, double unitPrice, boolean isPersian) {
        this.length = length;
        this.width = width;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public String toString() {
        return "Carpet{" +
                "length=" + length +
                ", width=" + width +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price is = " + calcCost() +
  '}';
    }


    public double calcCost(){

        double totalPrice = length * width * unitPrice;

        if(isPersian){
           totalPrice += 200;
        }

        return totalPrice;
    }


}
