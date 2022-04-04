package day26_CustomMethodsPractice;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] array = {1, 22, 33, 444, 5, 5, 5};

        int fre = frequencyOfElemets(array, 5);
        System.out.println("fre = " + fre);

        String[] arr = {"irem", "mehmet eren", "esma", "salim"};

        int freq = frequencyOfElemets(arr, "irem");

        System.out.println("freq = " + freq);
    }

    public static int frequencyOfElemets(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElemets(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElemets(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElemets(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if(each.equalsIgnoreCase(element)){
                count++;
            }
        }
        return count;
    }



}
