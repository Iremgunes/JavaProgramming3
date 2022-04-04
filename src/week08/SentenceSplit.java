package week08;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {


        String searchResult = "1-16 of 829 results for ipad";

        String[] words = searchResult.split(" ");

        System.out.println(Arrays.toString(words));

        String searchAmount = words[2];
        System.out.println("searchAmount = " + searchAmount);

        String confirmation = "ıd : 2239677\n" +
                "Amount: 793 usd \n" +
                "card number: 854569871325468952\n" +
                "Name : oscar\n" +
                "Date: 111.10.2021";

        System.out.println("confirmation = " + confirmation);

        String[] eachConfirmation = confirmation.split("\n ");

        System.out.println(Arrays.toString(eachConfirmation));

    }
}
