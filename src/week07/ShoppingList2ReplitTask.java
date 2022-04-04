package week07;

import java.util.Scanner;

public class ShoppingList2ReplitTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;


        do {
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.nextLine();
            price = scan.nextDouble();
            totalPrice += price;
            shoppingListReport += "Item" + count + ": " + item + " Price: " + price;
            count++;

            System.out.println("Add more item?");
            scan.nextLine();
            countinue = scan.nextLine();

            if(countinue.equalsIgnoreCase("yes")){
                shoppingListReport+=", ";
                count++;
            }
        } while (countinue.equalsIgnoreCase("yes") && count<=10); {
            System.out.println(shoppingListReport);
            System.out.println("Total Price: "+totalPrice);
        }


        scan.close();


    }
}
