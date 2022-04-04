package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str = "Java Java Python";

        int frequency = 0;

        while (str.contains("Java")) {
            str = str.replaceFirst("Java", "");
            frequency++;

        }
        System.out.println(frequency);

        System.out.println("-------------");

        String sentence = "cat cat cat dog dog dog cat cat CAT ";
        sentence = sentence.toLowerCase();

        int fr = 0;

        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "");
            fr++;

        }
        System.out.println(fr);

        System.out.println("--------------------");

        String s = "Java Java java python python python";

        int countJava = 0;
        int countPython = 0;
        s= s.toLowerCase();

        while (s.contains("java") || s.contains("python")) {

            if (s.contains("java")) {
                s = s.replaceFirst("java", "");
                countJava++;
            }

            if (s.contains("python")) {
                s = s.replaceFirst("python", "");
                countPython++;
            }
        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);
    }
}
