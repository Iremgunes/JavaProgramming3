package week06;

public class BasicLoopExamples {
    public static void main(String[] args) {


        for (int i = 0; i <= 1000; i +=10) {
            System.out.print(i + " ");

        }

        System.out.println();

        int z = 0;

        for( ; z <= 1000; ) {
            if (z % 10 == 0) {
                System.out.print(z + " ");
            }
            z++;
        }


        System.out.println();


        for (  int a = 3 ; a <= 130; a += 2){
            System.out.print(a + " ");
        }

        System.out.println();

        int countOfEven = 0;

        for (int i = 5; i <= 50 ; i++) {
            if(i%2 ==0) {
                ++countOfEven;
            }
        }
        System.out.println("Count of even numbers = " + countOfEven);
        System.out.println();


        for (int i = 1; i <= 10; i++) {

            System.out.println( " 12 X " + i + " = " + (12* i));

        }





    }
}
