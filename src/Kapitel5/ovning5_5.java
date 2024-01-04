package Kapitel5;

import java.util.Scanner;

public class ovning5_5 {
    public static void main(String[] args) {
        System.out.print("\nHur många rader vill du ha? :> ");
        var scan = new Scanner(System.in);
        int rader = scan.nextInt();

        for (int tabell = 1; rader > 0; rader--){
            System.out.print("\n");
            int temp = tabell;
            for (int inre = tabell; inre > 0; inre--){
                System.out.print(temp + "\t");
                temp += tabell;
            }
            tabell++;

        }
    }
}
