public class MainClass {

    public static void main(String[] args) {
        int aantalSecondenInEenMinuut = 60;
        int aantalMinutenInEenUur = 60;
        int aantalUrenInEenDag = 24;
        int aantalDageInEenWeek = 7;

        long aantalSeconden =
                aantalSecondenInEenMinuut *
                aantalMinutenInEenUur *
                aantalUrenInEenDag *
                aantalDageInEenWeek;

        System.out.println("Aantal seconden in een week: " + aantalSeconden);
    }

}
