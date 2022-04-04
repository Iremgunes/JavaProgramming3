package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
       int max = maxNumber(22,180);
        System.out.println(max);
        int multipication = max * 2;
        System.out.println(multipication);

    }

    public static int maxNumber(int a, int b){
        int result = 0;

        if(a>b){
            result = a;
        }else{
            result= b;
        }

        return result;

    }
}
