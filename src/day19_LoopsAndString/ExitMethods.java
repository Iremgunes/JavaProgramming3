package day19_LoopsAndString;

public class ExitMethods {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            if(i==3){
              // break; //terminate the loop
                //continue;
               System.exit(0); // terminates the program

            }
            System.out.println(i);
        }

        System.out.println("wooden spoon");

    }
}
