import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<>();

        // Get names
        while (true) {
            System.out.print("Geef een naam: ");
            String name = scanner.nextLine();
            if (name.isEmpty())
                break;
            names.add(name);
        };

        // Print names
        System.out.println("De ingevoerde namen zijn:");
        for (String name: names) {
            System.out.println(name);
        }

    }

}
