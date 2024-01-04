package Kapitel3;

import java.util.*;

/**
 * Kapitel3.Main-klassen
 */
public class Main {
    public static void main(String[] args) {
        /**
         * main-metoden <BR>
         */
        // Kapitel 3

        System.out.print("Skriv in en varas pris inkl. moms: ");
        var scan = new Scanner(System.in);
        double i = scan.nextInt();
        System.out.print("Hur många procent moms?: ");
        int moms = scan.nextInt();
        System.out.println("Momspriset för varan är: " + (i * moms/100));
        System.out.println("Varans pris utan moms är: " + (i - (i * moms/100)));
    }
}