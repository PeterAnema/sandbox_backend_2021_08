import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personen = new ArrayList<>();

        // Get names
        while (true) {
            System.out.print("Geef voornaam: ");
            String firstName = scanner.nextLine();
            System.out.print("Geef achternaam: ");
            String lastName = scanner.nextLine();

            if (lastName.isEmpty()) {
                break;
            }

            Person p = new Person(firstName, lastName);

            personen.add(p);
        };

        // Print names
        System.out.println("De ingevoerde personen zijn:");
        for (Person person: personen) {
            System.out.println(person);
        }

    }

}
