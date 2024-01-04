package Kapitel3;

public class pythagoras {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        // double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double c = Math.hypot(a, b);
        System.out.println(c);
    }
}
