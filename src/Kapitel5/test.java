package Kapitel5;
import java.util.*;
public class test {
    public static void main(String[] args) {
        System.out.println("Skriv ett tal jämnt eller ojämnt");
        var scan = new Scanner(System.in);
        int tal = scan.nextInt();
        if (tal%2 == 0)
            System.out.println("Talet är jämnt");
        else
            System.out.println("Talet är ojämnt");
    }
}
