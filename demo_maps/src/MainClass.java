import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainClass {

    public static void main(String[] args) {

        // standard declaration en initialization
        Map<String, String> codes = new HashMap<>();

        codes.put("NL", "+31");
        codes.put("B", "+32");
        codes.put("F", "+99");
        codes.put("D", "+40");
        codes.put("ES", "+34");

        codes.put("F", "+33");

        codes.remove("F");

        // Ga over elke key-value-pair in de HashMap.
//        Iterator<Map.Entry<String, String>> iterator = codes.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, String> result = (Map.Entry<String, String>) iterator.next();
//            System.out.println("Key: " + result.getKey() + " en value: " + result.getValue());
//        }

        // classic way, loop a Map
        for (Map.Entry<String, String> entry : codes.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }

        // or
//        codes.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));

    }

}
