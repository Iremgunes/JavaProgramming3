package week10;

public class R01_CountOfEven {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        
        int con = countOfEven(array);

        System.out.println("con = " + con);

        System.out.println(countOfEven(array));
    }
    
    public static int countOfEven(int[] array){
        int count = 0;
        for (int each:array ) {
            if(each %2 == 0){
                count++;
            }
        }
        return count;
    }
}
