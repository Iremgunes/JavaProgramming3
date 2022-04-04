package day26_CustomMethodsPractice;

public class RemoveElements2 {
    public static void main(String[] args) {


    }

    public static int[] removeElements1(int[] array, int index){

        if(index<0 || index> array.length-1){
            System.err.println("invalid index" + index);
            System.exit(0);
        }

        int[] result = new int[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length ; i++) {
            if(i == index){
                continue;
            }

            result[j++] = array[i];
        }

        return result;
    }

}
