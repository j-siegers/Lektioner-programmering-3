package kapitel4;

import java.util.Scanner;

public class ovning4_3 {
    public static void main(String[] args) {
        System.out.print("Skriv ett postnummer:");
        var scan = new Scanner(System.in);
        String postnr = scan.nextLine();
        int nypostnr = Integer.parseInt(postnr.substring(0, 2));

        if ((nypostnr>= 20 && nypostnr<63) || (nypostnr == 65 || nypostnr == 66)) {
            System.out.println("Distriktet ligger i Götaland");
        }
        else if (nypostnr >= 80) {
            System.out.println("Distriktet ligger i Norrland");
        }
        else {
            System.out.println("Distriktet ligger i Svealand");
        }



    }
}
