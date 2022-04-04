package week08;

import java.util.Arrays;

public class A01_ArrayExample {
    public static void main(String[] args) {

        int code = 200;

        int[] codes = new int[8];

        for (int i = 0; i < codes.length; i++) {

            codes[i] = (2*i +1);

            System.out.print(codes[i] + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(codes));

        int[] codes1  = new int[8];

        for (int i1 = 0; i1 < codes1.length; i1++) {

            codes1[i1] = (200 + i1);

            System.out.print(codes1[i1] + ", ");

        }

        System.out.println();

        System.out.println(Arrays.toString(codes1));

        String[] responseTypes = new  String[]{"ok", "created", "no content", "bad request",
        "not found", "server error"};
/*
    int code = 200;

        int[] codes = new int[8]; // my codes array holds 8 elements, they are all int type
        System.out.println(Arrays.toString(codes)); // how we print an array

        codes[0]=200; // first element
        codes[1]=201; // second element
        System.out.println(Arrays.toString(codes));

        int[] statusCodes = {200,201,204,400,401,403,404,500}; // another way of declaring and initializing

        System.out.println("-----------size of an array---------");

        // String str = "Java" ;  str.length()----> size of the string

        // for arrays, lentgh gets no parameter and returs an integer
        System.out.println("the size of our array: "+statusCodes.length);

        int sizeOfArray = statusCodes.length; // 8, use it for creating loops

        String[] responseTypes = new String[]{"OK","Created","No Content","Bad Request","Unauthorized","Forbidden","Not Found","Internal Server Error"};
 */



    }
}
