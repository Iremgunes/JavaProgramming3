package week10;

public class R03_CalculateRetirement {
    public static void main(String[] args) {

        int yearOfBirth = 1993;

        yearsUntilRetiremnt("irem", 1993);

    }

    public static int calculateAge(int yearOfBirth){
        return 2022-yearOfBirth;

    }

    public static void yearsUntilRetiremnt(String name, int yearOfBirth){

        int yearsUntilRetirement = 65-calculateAge(yearOfBirth);
        System.out.println(name + " retires in " + yearsUntilRetirement + " years");


    }
}
