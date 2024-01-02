import javax.swing.*;
import java.util.*;

class Hej {
    public static void main(String[] arg) {
        String name;
        String message;
        String time;
        name = JOptionPane.showInputDialog("Vad heter du?");
        time = Calendar.getInstance().getTime().toString();
        message = "Välkommen " + name;
        JOptionPane.showMessageDialog(null, message + ".\nDu kör " + System.getProperty("os.name"));
        JOptionPane.showMessageDialog(null, "Datum och tid:\n" + time);
        System.out.println("Datum och tid:\n" + time);


    }
}

class Hej2 {
    public static void main(String[] arg) {
        String namn, hälsning;
        System.out.print("Skriv ditt förnamn: ");
        Scanner scan = new Scanner(System.in);
        namn = scan.nextLine();
        System.out.print("Skriv ditt efternamn: ");
        namn = namn + " " + scan.nextLine();
        hälsning = "Välkommen " + namn;
        System.out.println(hälsning);
    }
}

class Adress {
    public static void main(String[] arg) {

        String s1 = "Johan S", s2 = "Bergsvägen 2", s3 = "01234567", s4 = s1 + "\n" + s2 + "\n" + s3 + "\n";
        System.out.println(s4);

        // Övn 2,7
        String a = "Programspråk", b;
        b = a.substring(4, 8) + a.charAt(5);
        System.out.println(b.toUpperCase());

        // Övn 2,8
        String a1 = " Erik Andersson 860314-2714 ", a2;
        int j = a1.lastIndexOf('-');
        a2 = a1.substring((j - 2), j) + "/" + a1.substring((j - 4), j - 2);
        System.out.println(a2);

        // TestDouble
        String s = "1.23";
        double x = Double.parseDouble(s);
        System.out.println(x);


    }
}

class Uppgifter {
    public static void main(String[] arg) {

        // Övn 2,1
        String kalender = Calendar.getInstance().getTime().toString();
        int i = kalender.indexOf(":") - 2;
        System.out.println("Klockan är: " + kalender.substring(i, (i + 8)));

        // Övn 2,2
        System.out.print("Skriv ditt namn: (efternamn, förnamn): ");
        var scan = new Scanner(System.in);
        String namn = scan.nextLine();
        int j = namn.indexOf(",") + 1;
        System.out.println("Hej " + namn.substring(j).trim().toUpperCase());

        // Övn 2,3
        System.out.print("Skriv ditt namn: (förnamn efternamn): ");
        var scan2 = new Scanner(System.in);
        String namn2 = scan2.next();
        System.out.println("Hej " + namn2.toUpperCase());


        // Övn 2,4
        String meddelande = """
                \n-= Välkommen till ordräknaren =-
                Mata in några ord så ska jag räkna lite
                
                >""";
        System.out.println(meddelande);
        var scan3 = new Scanner(System.in);
        String ordRäknare = scan3.nextLine();
        System.out.println("Du skrev " + ordRäknare.length() + " tecken.\n" +
                "Det första ordet var \"" + ordRäknare.substring(0, ordRäknare.indexOf(" ")) + "\".\n" +
                "Det sista ordet var \"" + ordRäknare.substring((ordRäknare.lastIndexOf(" ") + 1)) + "\".");

    }
}
