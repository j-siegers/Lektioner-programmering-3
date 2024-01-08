package Kapitel8;

import java.util.Scanner;

public class ovning8_4 {
    public static void main(String[] args) {
        System.out.print("Välj ett tal mellan 1 och 10: ");
        var scan = new Scanner(System.in);
        int scanIn = scan.nextInt();
        System.out.println(multiplikation(scanIn));
    }
    public static String multiplikation (int tal){
        StringBuilder tabell = new StringBuilder();
        for (int i = 1; i < 11; i++) {
             tabell.append(i).append(" ").append(tal * i).append("\n");
        }
       return tabell.toString();
    }
}
