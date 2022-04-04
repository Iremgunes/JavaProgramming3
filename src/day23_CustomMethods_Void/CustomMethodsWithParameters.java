package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {


        oddOrEven(8);
        oddOrEven(9);

        ageOfPerson(1993);
        ageOfPerson(1990);
        ageOfPerson(1938);
        ageOfPerson(571);

        printNumbers(10,50);

    }

    public static void oddOrEven(int number ){
        if(number%2 == 0){
            System.out.println( number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }
    }

    public static void ageOfPerson(int birthYear){

        int age = 2021 - birthYear;
        System.out.println("your age is " + age);
    }

    //create a function that can print all the numbers between x and y

    public static void printNumbers(int x, int y){

        for (int i = x; i <y ; i++) {
            System.out.print( i + " ");
        }

    }

}
