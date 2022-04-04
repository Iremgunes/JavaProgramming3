package day24_CustomMethod_Return;

public class ReturnMethodsPractice2 {

    public static void main(String[] args) {
        //create a function that can calculate the grade
    /*
    check the grade
    a-- excellent
    b-- great
    c---
     */

        String str1 = grade(80);

        if(str1.equalsIgnoreCase("A")){
            System.out.println("excellent");
        }else if(str1.equalsIgnoreCase("B")){
            System.out.println("great");
        }else if(str1.equalsIgnoreCase("C")){
            System.out.println("good");
        }else if(str1.equalsIgnoreCase("D")){
            System.out.println("passed");
        }else{
            System.out.println("try again");
        }


    }

    public static String grade(int score){
        String result = "";

        if(score<0 || score>100) {
            result= "invalid";
        }else {
            result = (score>=90)? "A" :(score>=80)? "B" :(score>=70)? "C" :(score>=60)? "D" :"F";
        }


        return result;
    }





}
