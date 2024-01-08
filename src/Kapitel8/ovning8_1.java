package Kapitel8;

public class ovning8_1 {
    public static void main(String[] args) {
        int tal = -2;

        System.out.println(teckenRaknare(tal));

    }
    public static int teckenRaknare(int tal){
        return Integer.compare(tal, 0);

    }
}
