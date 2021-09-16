import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        // standard declaration en initialization
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(7);
//        numbers.add(8);
//
//        numbers.remove(2);
//        numbers.set(2, 99);
//
//        System.out.println(numbers.get(2));
//
//        numbers.add(2, 999);

        // or with DoubleBraces - anonymous inner class & instance initialization block
//        List<Integer> numbers = new ArrayList<>() {
//            {
//                add(1);
//                add(4);
//                add(5);
//                add(2);
//                add(3);
//            }
//        };

        // or with an array
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 4, 5, 2, 3));

        System.out.println(numbers.size());

        for (int number: numbers) {
            System.out.println(number);
        }

    }

}
