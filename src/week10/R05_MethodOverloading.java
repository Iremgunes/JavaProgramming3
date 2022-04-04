package week10;

public class R05_MethodOverloading {
    public static void main(String[] args) {
        System.out.println(convertBritishToMetric(5.0, 11.0));

    }

    public static double convertBritishToMetric(double feet, double inches){
        if(feet<0 ||inches<0 || inches>12){
            System.err.println("invalid feet or inches");
            System.exit(-1);
            return  -1;
        }
        double centimeters = feet*12*2.54 + inches*2.54;

        return  centimeters;
    }

    public static double convertBritishToMetric(double inches){
        if(inches<0){
            System.err.println("invalid inches");

            return -1.0;
        }
        return inches*2.54;
    }

    //public static int convertBritishToMetric(double x, double y){

    }

