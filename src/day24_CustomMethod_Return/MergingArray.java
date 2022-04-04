package day24_CustomMethod_Return;

import java.util.Arrays;

public class MergingArray {
    public static void main(String[] args) {

        String[] students = mergingTwoArray();

    System.out.println(Arrays.toString(students));
    }

    public static String[] mergingTwoArray( ) {
        String[] group1 = {"a", "b", "c"};
        String[] group2 = {"d", "e", "f", "g"};

        String[] students = new String[group1.length + group2.length];

        int i = 0;
        for (String each : group1) {
            students[i] = each;
            i++;

        }

        for (String each : group2) {
            students[i] = each;
            i++;
        }
        return students;


    }
}
