package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String word = "JavaJavaJava";

        int frequency = 0;

        for (int i = 0; i <=  word.length()-4; i++) {

           String eachSub = word.substring(i, (i+4));

           if(eachSub.equals("Java")){
               frequency++;
           }
        }
        System.out.println(frequency);



        String word2 = "Cat Cat Cat Dod Dog ";

        int frequency2 = 0;

        for (int i = 0; i <=  word2.length()-3; i++) {

            String eachSub2 = word2.substring(i, (i+3));

            if(eachSub2.equals("Dog")){
                frequency2++;
            }
        }
        System.out.println(frequency2);



    }
}
