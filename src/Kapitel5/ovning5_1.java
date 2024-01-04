package Kapitel5;

import java.util.Scanner;

public class ovning5_1 {
    public static void main(String[] args) {
        double biggest = 0;
        double smallest = 500;
        double readIn;
        while (true){
            System.out.print("Skriv ett positivt tal. För att avsluta skriv ett negativt tal.\n> ");
            var scan = new Scanner(System.in);
        readIn = scan.nextDouble();
        if (readIn < 0)
            break;
        else {
           if (readIn > biggest)
            biggest = readIn;
           else if (readIn < smallest) {
               smallest = readIn;
           }
        }
        System.out.print("\f");
        }
        System.out.println("Det största talet är " + biggest + " och det minsta är " + smallest);
    }
}
