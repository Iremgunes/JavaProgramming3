package Quizes;

import java.util.Arrays;

public class Unit2Assesment {
    public static void main(String[] args) {
        String word = "   Winter is coming    ";
        word = word.trim();
        System.out.println(word);
        System.out.println(word.length());

        String a = "123";

        String b = 5+4+a;
        System.out.println(b);

        String s ="the game was tied at 2-2";
        String s2 = s.substring(5);

        int ind1 = s.indexOf("game");
        int ind2 = s2.indexOf("game");

        System.out.println(ind2);
        System.out.println(ind1==ind2);

        String z = "popcorn will";

        String xa = "today ı will go to beach";
        boolean xb = xa.contains("i");
        boolean xc = xa.substring(12). startsWith("go");

        System.out.println(xb);
        System.out.println(xb&&xc);

        for (int i = 0; i <10 ; i++) {
            if(i%2==0){
                continue;
            }
            System.out.print(i);
        }
        System.out.println();

        int num = 5;

        while (num<100){
            num+=num;
        }
        System.out.println(num);

        int an = 0;
        do {
            an = an++ + --an -(an%3);
        }while (++an <4);

        System.out.println(an);





        String input = "today it will be 100 degrees !";

     int n = 0;
     while (n++ < input.length()){
         if(n==8){
             continue;
         }else if( n==9){
             break;
         }
         System.out.print(input.charAt(++n));
     }

        System.out.println();

     int count = 0;
        for (int x = 0; x < 4 ; x++) {
            if(x==3) continue;
            for (int y = x+1; y <5 ; y++) {
                count++;
                if(y==3) break;
            }

        }

        System.out.println(count);
        double[] doub = new  double[4];
        doub[0] =0;
        doub = new  double[4];
        doub[3] = 3;
        System.out.println(Arrays.toString(doub));



        byte[] k = new byte[5];
        for (int i = 0; i < k.length; i++) {
            k[i] = (byte)(k[i] *2);
        }
        System.out.println(k);


        int[] arr = {1,3,12,5,24,7,9,10};
        boolean[] bArr = new boolean[arr.length];

        for (int i = arr.length-1; i > -1 ; i--) {
            if(arr[i] %2 == 0){
                bArr[arr.length-1-i] = true;
            }
        }
        System.out.println(Arrays.toString(bArr));


        String t = "the whole time it was raining.";

        do {
            System.out.print(t.charAt(0));
            t = t.substring(3);
        }while (!t.isEmpty());

        String cümle = "ı will find the lost book";

        String newWord = "";

        for (int i = cümle.length()-1; i <=0 ; i--) {
         newWord+= cümle.charAt(i);
        }
        System.out.println(newWord);

      String str5 = "game is good";
      int i = str5.indexOf("irem");
        System.out.println(i);
    }
}