package Kapitel8;

public class ovning8_3 {
    public static void main(String[] args) {
        System.out.println("Är talet ett primtal? " + ärEttPrimtal(7));
    }
    public static boolean ärEttPrimtal(int tal){
        for (int i = 2; i <tal ; i++) {
            if (tal % 2 == 0)
                return false;

        }
        return true;
    }
    public static String meny (){
        String figur = """
                |-------|
                |       |
                |_______|
                """;
        return figur;
    }
}
