import java.util.Random;

public class MainClass {

    public static void main(String[] args) {

        String naam = "Peter";
        String geslacht = "m";   // 0 - man; 1 - vrouw

        if (geslacht.equals("m")) {
            System.out.println("Beste meneer " + naam);
        }
        else {
            System.out.println("Beste mevrouw " + naam);
        }

        switch (geslacht) {
            case "m":
                System.out.println("Beste meneer " + naam);
                break;
            case "v":
                System.out.println("Beste mevrouw " + naam);
                break;
            default:
                System.out.println("Beste " + naam);
                break;
        }



        Random random = new Random();
        int geheimGetal = random.nextInt(100);

    }
}
