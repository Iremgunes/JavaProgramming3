package day20_Array;

public class AppearedTwice {
    public static void main(String[] args) {
        char[] chars = {'A','A', 'A', 'B', 'B', 'C', 'C', 'D', 'D', 'D'};

        for (int j= 0; j < chars.length; j++) {
            char ch = chars[j];
            int fre = 0;

            for (int i = 0; i < chars.length; i++) {
                if(chars[i] == ch){
                    fre++;
                }
            }
            if(fre ==2){
                System.out.println(ch + " is used twice in this arrays ");
            }

        }


    }
}
