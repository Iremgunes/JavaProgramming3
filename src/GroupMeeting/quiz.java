package GroupMeeting;

import java.util.Arrays;

public class quiz {
    public static void main(String[] args) {


        String str = " ";
        str.trim();
        System.out.println(str);
        int n = str.length();
        System.out.println(n);
        System.out.println(str.isEmpty());

        String str1 = "ABC";
       str1 =  str.replace("C", "D");
        System.out.println(str1);

        String ta = "irem";
        ta = ta.replace('i', 'r');
        System.out.println(ta);
        String myStr = "Hello";
        System.out.println(myStr.replace('l', 'p'));



        String s1 ="abc";
        String s2 ="abc";
        System.out.println(" " + s1 == s2 +" ");


        sum(10.0,20.0);

        String[][] arr = {{"A","B","C"}, {"D","E"}};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {

                if(arr[i][j].equals("B")) {
                    break;
                }
                System.out.print(arr[i][j]);
            }
        }

        System.out.println( );

        int[]numbers;
        numbers=new int[2];
        numbers[0] = 10;
        numbers[1]= 20;

        numbers= new int[4];
        numbers[2]=30;
        System.out.println(Arrays.toString(numbers));


        String word1 = "Java";
        String word2 = "Java";
        String[] letters = {"J", "a", "v", "a"};
       String word3= "";

        for (int i = 0; i < letters.length; i++) {
            word3+=letters[i];
        }

        System.out.println("word3 = " + word3);

        System.out.println(word1==word2);
        System.out.println(word1==word3);

        int num =10;
        num = add10(num);

        System.out.println(num);

        String word = "whatsapp";
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(2) +""+ word.charAt(3) + "" + word.charAt(4));


        String email = "irem_danacıoglu@gmail.com";
        String firstName = email.substring(0, email.indexOf("_"));

        String lastName = email.substring((email.indexOf("_")+1), email.indexOf("@"));

        String domain = email.substring((email.indexOf("@")+1), email.lastIndexOf("."));

        System.out.println("First name: " + firstName.toUpperCase().charAt(0) + "" + firstName.substring(1));

        System.out.println("Last name: " + lastName.toUpperCase().charAt(0) +"" + lastName.substring(1));

        System.out.println("Domain: " + domain);

        String names = "irem";
        names = names.substring(0);
        System.out.println("names = " + names);

        int numa=1;
        String stra = "abca";

        if(numa==1){
            if(stra.indexOf(stra.charAt(0)) != stra.lastIndexOf(stra.charAt(0)) ){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }


    }

    public static void sum(float a, float b){
        System.out.println("float sum is " + a+b);
    }

    public static void sum(double a, double b){
        System.out.println(" double sum is" + (a+b));
    }

    static int add10(int num){
        num = num+10;
        return num;
    }
}
