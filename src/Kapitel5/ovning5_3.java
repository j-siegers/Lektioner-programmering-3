package Kapitel5;

public class ovning5_3 {
    public static void main(String[] args) {

        double dagar = 0;
        double pengar = 0.01;

        while (pengar < 10_000_001) {
            dagar++;
            pengar*=2;
        }
        double ar = dagar/365;
        System.out.println("\nDet tar " + dagar + " dagar att tjäna ihop 10 miljoner kr, vilket är lika med " + ar + " år.");
    }

}
