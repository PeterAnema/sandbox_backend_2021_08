public class MainClass {

    public static void main(String[] args) {

        int[] numbers = {1,4,5,2,3,9,8};

        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int number: numbers) {
            System.out.println(number);
        }

        String[] namen = new String[5];
        namen[0] = "Peter";
        namen[1] = "Jan";
        namen[2] = "Ali";
        namen[3] = "Jeroen";
        namen[4] = "Klaas";

        namen[1] = "Andre";

        for (String naam: namen) {
            System.out.println(naam);
        }

        String[] weekdagen = {"maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag", "zondag"};

        for (String weekdag: weekdagen) {
            System.out.println(weekdag);
        }

    }

}
