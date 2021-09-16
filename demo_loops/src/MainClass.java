public class MainClass {

    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i++) {
            System.out.println("Hallo 1");
        }

        int i = 1;
        while (i <= n) {
            System.out.println("Hallo 2");
            if (i == 2) {
                break;
            }
            i += 1;
        }

        i = 1;
        do {
            System.out.println("Hallo 3");
            i += 1;
        } while (i <= n);

        int getal = 12;
        if (getal < 10) {
            System.out.println("Kleiner dan 10");
        }
        else {
            if (getal < 20) {
                System.out.println("Kleiner dan 20");
            }
            else {
                System.out.println("Groter dan of gelijk aan 20");
            }
        }



    }

}
