import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        System.out.print("Hoe heet je? ");

        Scanner userInput = new Scanner(System.in);
        String naam = userInput.nextLine();

        System.out.println("Hallo " + naam);

        System.out.print("Hoe oud ben je? ");
        String invoer = userInput.nextLine();
        int leeftijd = Integer.parseInt(invoer);

        System.out.println("Dan wordt je volgend jaar " + (leeftijd + 1));
    }

}
