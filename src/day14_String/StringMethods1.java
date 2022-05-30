package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "     batch25     ";
        String str2 = str1.trim();

        System.out.println("str2 = " + str2);
        System.out.println("str1 = " + str1);

        String str3 = "Cydeo school";
        int n1 = str3.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2 = str3.indexOf("ool");
        System.out.println("n2 = " + n2);

        int n3 = str3.lastIndexOf("o");
        System.out.println("n3 = " + n3);

        System.out.println("--------------------");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        System.out.println("firstA = " + firstA);

        int lastA = s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);

        int secondA = s.indexOf("a Nova");
        System.out.println("secondA = " + secondA);

        int thirdA = s.indexOf("a Cava");
        System.out.println("thirdA = " + thirdA);

        int fourthA = s.lastIndexOf("av");
        System.out.println("fourthA = " + fourthA);







    }
}
