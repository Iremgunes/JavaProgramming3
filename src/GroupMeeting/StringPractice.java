package GroupMeeting;

public class StringPractice {
    public static void main(String[] args) {

        String str = "wooden spoon";
        char firstLetter = str.charAt(0);

        char lastLetter = str.charAt(str.length()-1);

        System.out.println(firstLetter);

        String n = "  hinarem   .   ";
        n = n.trim();
        System.out.println(n);

        String h = "     aaaa    aaaa    vvvv    !   ";
        h = h.trim();
        System.out.println(h);

        int length = str.length();
        System.out.println(length);

        int s = str.indexOf("s");
        System.out.println(s);

        String str1 = "mike_smith@gmail.com";

        String name = str1.substring(0, str1.indexOf("_") );
        String surname = str1.substring(str1.indexOf("_" ) +1, str1.indexOf("@"));
        String domain = str1.substring(str1.indexOf("@") + 1, str1.lastIndexOf("."));

        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
        System.out.println("domain = " + domain);

        String str2 = str1.substring(str1.indexOf("_"));
        System.out.println(str2);








    }
}
