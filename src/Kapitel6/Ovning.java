package Kapitel6;

public class Ovning {
    public static void main(String[] args) {
        String test = "Text med ett antal blanka tecken";
        int counter = 0;
        for (int i = 0; i < test.length(); i++) {
            if (Character.isWhitespace(test.charAt(i)))
                counter++;
        }
        System.out.println(counter + " blanka tecken hittades");

        String test2 = "Lite text";
        int antal = antalTecken(test2, 't');
        System.out.println(antal);
    }

    public static int antalTecken(String test, char t) {
        int k = 0;
        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) == t) k++;
        }
        return k;
    }

}
