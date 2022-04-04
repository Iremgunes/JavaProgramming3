package GroupMeeting;

public class FirstUnique2 {
    public static void main(String[] args) {
        String str = "Cydeo Student";
        str = str.replaceAll(" ", "");

        String result = "";

        for (int i = 0; i < str.length(); i++) {
           char ch = str.charAt(i);


           if( str.indexOf(ch) == str.lastIndexOf(ch)){
               result += ch;
           }

        }
        System.out.println(result);


    }
}
