package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {

        String str = "Java is fun, ı love learning Java";

        String str2 = str.replace("Java", "Pyton");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";

        String email2 = email.replace("yahoo", "gmail");

        System.out.println("email2 = " + email2);
        System.out.println("email1 = " + email);

        String sentence = "Java Python Python C# C# C# C++ C++ Python Python Python ";
        String sentence2 = sentence.replace("Python", "Falcon");
        String sentence3 = sentence2.replace("C++", "D--");


        System.out.println("sentence = " + sentence);
        System.out.println("sentence2 = " + sentence2);
        System.out.println("sentence3 = " + sentence3);

        String s = "Dog Dog Dog Dog Dog Dog";
        String s2 = s.replace("Dog", "Cat");
        // s = s.replace("Dog", "Cat");

        System.out.println("s = " + s);
        System.out.println("s2 = " + s2);

        String s3 = "C# is fun, C# is cool";

        s3 = s3.replace("C#", "Java");

        System.out.println("s3 = " + s3);

        String s4 = "Java";
        s4 = s4.replace("a", "e");
        System.out.println("s4 = " + s4);

        String s5 = s4.replaceFirst("e", "a");
        System.out.println("s5 = " + s5);

        String result = "Java Java Java";
        String result1 = result.replace("Java", "Python");
        String result2 = result.replaceFirst("Java", "Python");

        System.out.println("result = " + result);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        String result3 = "C# is fun, C# is cool";
        result3 = result3.replaceFirst("C#", "C++");
        System.out.println("result3 = " + result3);

    }
}
