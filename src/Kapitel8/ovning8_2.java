package Kapitel8;

public class ovning8_2 {
    public static void main(String[] args) {
        System.out.println("Pris utan moms 100, med 25% moms " + momsRaknare(100, 25));
    }
    public static double momsRaknare (double pris, double moms){
        return pris * ((moms + 100) / 100);
    }
}
