package Kapitel8;

import java.util.Calendar;

public class ovning8_6 {
    public static void main(String[] args) {
        System.out.println("\nKlockan är " + klockan());
    }
    public static String klockan (){
        String kalender = Calendar.getInstance().getTime().toString();
        int i = kalender.indexOf(':');
        return kalender.substring(i-2, i+3);
    }
}
