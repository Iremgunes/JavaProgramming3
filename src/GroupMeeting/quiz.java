package GroupMeeting;

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



    }

    public static void sum(float a, float b){
        System.out.println("float sum is " + a+b);
    }

    public static void sum(double a, double b){
        System.out.println(" double sum is" + (a+b));
    }
}
