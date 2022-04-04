package week11;

import java.util.ArrayList;

public class TestTV {
    public static void main(String[] args) {

        TV Samsung = new TV();
        System.out.println(Samsung);

        Samsung.turnOn();
        Samsung.setChannel(7);
        Samsung.setVolume(3);
        System.out.println(Samsung);

        TV LG = new TV();
        LG.turnOn();
        LG.setVolume(5);
        LG.setChannel(10);
        System.out.println(LG);

        TV Sony = new TV();

        ArrayList<TV> list = new ArrayList<>();
        list.add(Samsung);
        list.add(LG);
        list.add(Sony);

        for (TV eachTv : list ) {
            System.out.println("is the tv on ? " + eachTv.on);
            System.out.println("volume is: " + eachTv.volumeLevel);
        }



    }
}
