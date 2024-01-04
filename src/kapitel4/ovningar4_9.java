package kapitel4;

import java.util.Scanner;

public class ovningar4_9 {
    public static void main(String[] args) {
        System.out.println("Hur många minuter per månad ringer du? ");
        var scan = new Scanner(System.in);
        int minuter = scan.nextInt();
        if (minuter < 34)
            System.out.println("Du ska ha kontant");
        else if (minuter < 67)
            System.out.println("Du ska ha normal");
        else
            System.out.println("Du ska ha plus");
    }
}
