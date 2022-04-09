package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

       Iphone iphoe1 = new Iphone("Iphone", " Iphone 12", "6.7 inches", 1000, "black");

       Samsung samsung1 = new Samsung("Samsung", "Galaxy S19", " 6 inches", 900, "white" );

       Nokia nokia1 = new Nokia("nokia", "brick", "4 inches", 50, "gray" );

        System.out.println(iphoe1);
        System.out.println(samsung1);
        System.out.println(nokia1);

        System.out.println();
        iphoe1.call(911);
        iphoe1.text(123456789);
        iphoe1.faceTime("aviremdanacioglu@gmail.com");
        System.out.println("-----------------");

        samsung1.freeze();

        System.out.println("------------------");
        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);


    }
}
