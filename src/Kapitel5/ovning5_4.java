package Kapitel5;

import java.util.Scanner;

public class ovning5_4 {
    public static void main(String[] args) {
        System.out.print("\nBakåtvänd text generator.\nSkriv in en text.\n> ");
        var scan = new Scanner(System.in);
        String data = scan.nextLine();
        int tecken = data.length();

        for (; tecken > 0; tecken--) {
            System.out.print(data.charAt(tecken - 1));
        }


    }
}
