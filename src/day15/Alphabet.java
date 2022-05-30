package day15;

public class Alphabet {
    public static void main(String[] args) {

        //A -Z

        for(char letter = 'A'; letter <= 'Z'; letter++){
            System.out.print(letter + " ");
        }
        System.out.println();
        System.out.println("-------------------");

        for(int i = 65; i <= 90; i++){
            System.out.print((char)i + " ");
        }
        System.out.println();
        System.out.println("-------------------");

        for(char letter = 'a'; letter <= 'z'; letter++){
            System.out.print(letter + " ");
        }
        System.out.println();
        System.out.println("-------------");

        for(char letter = 'z'; letter >= 'a'; letter--){
            System.out.print(letter + " ");
        }
    }
}
