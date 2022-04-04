package day31_Constructors;

public class Pizza {

     public char size;
     public int numberOfCheeseTopping, numberOfPepperonTopping;

     public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperonTopping) {
          this.size = size;
          this.numberOfCheeseTopping = numberOfCheeseTopping;
          this.numberOfPepperonTopping = numberOfPepperonTopping;
     }


     public double calcCost(){
          double startingPrice = (size=='S')? 10 :(size == 'M')? 12 :14;

          double totalPrice = startingPrice + (numberOfCheeseTopping + numberOfPepperonTopping);

          return totalPrice;

     }


     public String toString() {
          return "Pizza{" +
                  "size=" + size +
                  ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                  ", numberOfPepperonTopping=" + numberOfPepperonTopping +
                 ", totalPrice = $ " + calcCost() +
                  '}';
     }
}
