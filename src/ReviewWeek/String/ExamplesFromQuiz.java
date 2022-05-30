package ReviewWeek.String;

public class ExamplesFromQuiz {
    public static void main(String[] args) {

      String s1 = "abc";
      String s2 = "abc";

        System.out.println("s1==s2 is: " + (s1==s2));

        System.out.println("s1==s2 is: " +s1==s2);

        System.out.println("----------------------");

        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta + tb;
        ta.replace('C', 'D');
        ta= ta + tb;

        System.out.println(ta);

        System.out.println("---------------------------");



    }
}
