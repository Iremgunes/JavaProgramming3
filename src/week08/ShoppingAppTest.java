package week08;

public class ShoppingAppTest {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("------- find the first indx of 'gloves' in items array ---------------");

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("gloves found at index: " + i);
                //  System.exit(0);
                break;
            }
        }

        System.out.println("------------------");

        System.out.println("------------- set a boolean variable true if 'ipad' exists in the items" );

        boolean ipadExists = false;
        for (String item : items) {
            if(item.equalsIgnoreCase("ipad")){
                ipadExists = true;
                break;
            }
        }
        if(ipadExists){
            System.out.println("we have ipad in the list");
        }else{
            System.out.println("ipod not found");
        }

        System.out.println("--------------------------------");

        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase("jacket")){
                String itemDetail = items[i] + " €" + prices[i] + " - #" + itemIDs[i];
                System.out.println("itemDetail = " + itemDetail);
                break;
            }
        }

        for (int i = 0; i < items.length; i++) {
                String itemDetail = items[i] + " €" + prices[i] + " - #" + itemIDs[i];
                System.out.println("itemDetail = " + itemDetail);


        }






    }
}
