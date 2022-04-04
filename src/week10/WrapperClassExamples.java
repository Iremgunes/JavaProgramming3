package week10;

public class WrapperClassExamples {
    public static void main(String[] args) {

        int i1 = 100;

        Integer i2 = i1; // autoboxing from primitive to object type

        Integer n1 = 300;

        int n2 = n1; // unboxing from object to primitive

        String str = "123";

        System.out.println(str+1);

        int num = Integer.parseInt(str);

        System.out.println(num+1);

        String price = "$27.16";
        price=price.substring(1);

        double priceInDouble = Double.parseDouble(price);

        System.out.println(priceInDouble + 10);

        System.out.println("--------------");

        String strTwo = "a1b2c3";

        int sumOfDigits = 0;

        for (char each: strTwo.toCharArray()) {
            if(Character.isDigit(each)){
                //sumOfDigits += Integer.parseInt(each + "");

                sumOfDigits++;
            }
        }

        System.out.println("sumOfDigits = " + sumOfDigits);

        String strThree = "abcd1234!#$efghi6789#$%ABCD";

        String letters = "";
        String upperCaseLatters = "";
        String lowerCaseLetters = "";
        String digits = "";
        String specialChars = "";

        for (char each : strThree.toCharArray()) {
            if(Character.isLetter(each)){
                letters += each;

                if(Character.isUpperCase(each)){
                    upperCaseLatters += each;
                }else {
                    lowerCaseLetters += each;
                }
            }else if(Character.isDigit(each)){
                digits += each;
            }else {
                specialChars += each;
            }
        }

        System.out.println("specialChars = " + specialChars);
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("lowerCaseLetters = " + lowerCaseLetters);
        System.out.println("upperCaseLatters = " + upperCaseLatters);



    }

}
