import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {

    public static void main(String[] args) {

        // standard declaration en initialization
        Map<String, String> codes = new HashMap<>();
        codes.put("NL", "+31");
        codes.put("B", "+32");
        codes.put("F", "+33");
        codes.put("D", "+40");
        codes.put("ES", "+34");

        // classic way, loop a Map
//        for (Map.Entry<String, String> entry : codes.entrySet()) {
//            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
//        }

        // or
        codes.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));

    }

}
