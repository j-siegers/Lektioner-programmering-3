package Kapitel3;

import java.util.Scanner;

public class ovningar3_11 {
    public static void main(String[] args) {
        // övn 3,1
        double volym;
        double r = 10;
        volym = (4 * Math.PI * Math.pow(r, 3)) / 3;
        System.out.println("Volymen är: " + volym);

        double area;
        area = 4 * Math.PI * Math.pow(r, 2);
        System.out.println("Arean är: " + area);

        // ÖVN 3,2
        double celsius;
        double fahrenheit;
        var scan = new Scanner(System.in);
        System.out.println("Skriv in en temp i fahrenheit: ");
        fahrenheit = scan.nextDouble();
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperaturen i C är: " + celsius);

        // ÖVN 3,3
        double mile = 10;
        double gallon = 10;
        double mil, liter;
        mil = mile * 0.1609;
        liter = gallon * 3.785;
        System.out.println("10 mile är " + mil + " mil.\n" + "10 gallon är " + liter + " liter");

        // övn 3,4
        int x1 = 10;
        int x2 = 5;
        int y1 = 10;
        int y2 = 5;
        double s = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.println("Avståndet mellan punkterna är: " + s);


    }
}

