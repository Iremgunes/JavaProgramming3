package week07;

public class Task02 {
    public static void main(String[] args) {

        //for odd colums print 1 even colums 0

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < i; j++) {
                //System.out.print(j % 2);

                if(j%2 == 0){
                    System.out.print("0 ");
                }else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }

    }
}



