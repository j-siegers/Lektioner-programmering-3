package Kapitel5;

public class ovning5_2 {
    public static void main(String[] args) {
        System.out.println("Talen 1 - 12 i kvadrat och kubik\n");

        for (int i = 1; i < 13; i++){

            System.out.println(i + " | i kvadrat: " + Math.pow(i, 2) + " i kubik: " + Math.pow(i, 3));
        }

    }
}
