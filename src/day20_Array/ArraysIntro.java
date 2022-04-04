package day20_Array;

import java.util.Arrays;


public class ArraysIntro {
    public static void main(String[] args) {

        //create a variable thats capable enough to contain 5 names
          String[] myGroup = new String[5];
          // gunay neiro suat hulya mikael
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";
       // myGroup[5] = "Muhtar";Exception in thread "main" java.lang
        //System.out.println(myGroup);(hashcode)
        System.out.println(Arrays.toString(myGroup));

        int[] myGroups = new int[5];

        int[] myGroups2 ={2,5,7,33,66};



        //System.out.println(myGroup);(hashcode)
        System.out.println(Arrays.toString(myGroups));

        System.out.println(Arrays.toString(myGroups2));

        String[] days = {"monday", "tuesday", "wdenesday", "thursday","friday", "saturday", "sunday"};
        System.out.println(Arrays.toString(days));

        int number = 4;
        if(number<1 || number>7){
            System.err.println("invalid number");
            System.exit(0);
        }
        System.out.println(days[number]);


        String[] months = {"january", "february", "march","april", "may"," jun", "july","august","september","october","november","december"};

        System.out.println(Arrays.toString(months));

        int num = 10;
        if(num<1 || num> 12){
            System.out.println("invalid number");
            System.exit(0);
        }
        System.out.println(months[num]);




    }
}
