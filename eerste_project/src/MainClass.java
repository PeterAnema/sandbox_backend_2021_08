public class MainClass {

    public static void main(String[] args) {
        sayHello();
        sayHello();
        sayHello();
        sayHello();
        askQuestion("Hoe gaat het?");
        bereken();
        sayGoodbye();
    }

    public static void sayHello() {
        System.out.println("Hello world!");
    }

    public static void sayGoodbye() {
        System.out.println("Goodbye!");
    }

    public static void askQuestion(String question) {
        System.out.println("> " + question + "?????"); // concatenation
    }

    public static void bereken() {
        int aantal = 5;
        System.out.println(aantal);
        aantal = aantal + 10;
        aantal += 10;
        aantal -= 1;
        aantal--;
        System.out.println(aantal);

        float factor = 2.5F;
        double getal1 = 0.1D;    // standaard double
        double getal2 = 0.2;    // standaard double
        double groot = 10E19;

        System.out.println(getal1 + getal1);
        System.out.println(getal1 + getal2);
        System.out.println(getal2 + getal2);

        System.out.println(groot);

        System.out.println((getal1 + getal1) == 0.2);
        System.out.println((getal1 + getal2) == 0.3);
        System.out.println((getal2 + getal2) == 0.4);
    }


}
