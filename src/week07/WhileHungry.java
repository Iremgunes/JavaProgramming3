package week07;

public class WhileHungry {
    public static void main(String[] args) {

        boolean  isHungry = true;
        int bananas = 0;
        int countToFull = 3;

        while(isHungry){

            bananas++;
            System.out.println("eating a banana: " + bananas);

            if(bananas==countToFull){
                isHungry = false;
            }
        }

        System.out.println("-----------------------------------------");

        boolean  isHungry2 = true;
        int bananas2 = 0;
        int countToFull2 = 3;

        while(isHungry2){

            System.out.println("eating a banana: " + bananas2);
            bananas2++;

            if(bananas2==countToFull2){
                isHungry2 = false;
            }
        }
        System.out.println("-------------------");

        boolean  isHungry3 = true;
        int bananas3 = 0;
        int countToFull3 = 3;

        while(isHungry3){

            bananas3++;
            System.out.println("eating a banana: " + bananas3);

            if(bananas3==countToFull3){
               continue;
            }

            if(bananas3== countToFull3 +2 ){
                break;
            }
        }






    }
}
