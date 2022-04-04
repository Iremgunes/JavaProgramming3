package week08;

import java.util.Arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {

        // amazon website search results for a product
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23,
                98.32, 533.43, 34.23, 124.9, 234.23};

        Arrays.sort(prices);

        for (double eachPrice: prices) {
            System.out.println("each price = " + eachPrice);
        }
        System.out.println("----------------------------");

        for (double price : prices) {

            if(price> 100.0){
                System.out.println("price = " + price);
            }

        }






    }
}
