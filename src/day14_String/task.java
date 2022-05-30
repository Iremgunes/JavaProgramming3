package day14_String;

public class task {

    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";
        String email2 = email.replace("gmail", "yahoo");
        email2 = email2.replace("School", "Cydeo");
        email2 = email2.replaceFirst("Cydeo", "School");

        System.out.println("email = " + email);
        System.out.println("email2 = " + email2);

        String mail = "Cydeo.School@gmail.com";
        //domain:
        int beginningIndex = mail.indexOf("@" ) + 1 ;
        int endingIndex = mail.lastIndexOf(".");

        String domain = mail.substring(beginningIndex, endingIndex);
        System.out.println("domain = " + domain);

        System.out.println("--------------------");

        String str1 = "Java is fun, Java is cool, I love Java";

        int beg = str1.lastIndexOf("n")+1 ;

        String s1 = str1.substring(0, beg );

        System.out.println("s1 = " + s1);

        int begin = str1.indexOf(" J" )+1;
        int end = str1.lastIndexOf(",");

        String s2 = str1.substring(begin, end);
        String s3 = str1.substring(end+2 );

        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        int score = 0;

        if(score == 0){
            score+=50;
        }
        if(score !=0){
            score+=50;
        }

        System.out.println(score);

        System.out.println("------------");
        boolean X = true;

        if(X == false){
            System.out.println("one");
        }else if(X == false !=true){
            System.out.println("two");
        } else if ( X== true){
            System.out.println("three");
        }else if( X == !false){
            System.out.println("four");
        }
        int x = 4;
        boolean eligible = x== 1 || x == 2 || x==3|| x==4
                ;
        if(x ==5){
            System.out.println("five");
        } else if(x == 2+2){
            System.out.println("four");
        }

    }

}
