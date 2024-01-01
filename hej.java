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
        JOptionPane.showMessageDialog(null,"Datum och tid:\n" + time);
        System.out.println("Datum och tid:\n" + time);
    }
}