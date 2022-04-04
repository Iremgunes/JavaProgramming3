package day24_CustomMethod_Return;

public class ReturnStatement2 {
    public static void main(String[] args) {
        nameOfMonth(10);
        nameOfMonth(22);
    }


    public static void nameOfMonth(int number) {
        if (number >= 1 && number <= 12) {
            if (number == 1) {
                System.out.println("nameOfMonth is: January");
            } else if (number == 2) {
                System.out.println("nameOfMonth is: February");
            } else if (number == 3) {
                System.out.println("nameOfMonth is: March");
            } else if (number == 4) {
                System.out.println("nameOfMonth is: April");
            } else if (number == 5) {
                System.out.println("nameOfMonth is: may ");
            } else if (number == 6) {
                System.out.println("nameOfMonth is: jun");
            } else if (number == 7) {
                System.out.println("nameOfMonth is: july");
            } else if (number == 8) {
                System.out.println("nameOfMonth is: august");
            } else if (number == 9) {
                System.out.println("nameOfMonth is: september");
            } else if (number == 10) {
                System.out.println("nameOfMonth is: october");
            } else if (number == 11) {
                System.out.println("nameOfMonth is: november");
            } else {
                System.out.println("nameOfMonth is: jun");
            }

        } else {
            System.out.println("invalid");
            return;
        }


    }
}