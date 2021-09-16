public class Main {

    public static void main(String[] args) {
        Auto mijnAuto = new Auto("Rode", "Volkswagen", "Kever", 1978, false, 120000);

        mijnAuto.stukjeRijden(200);
        mijnAuto.stukjeRijden(23);

        System.out.println( mijnAuto.toString() );

        mijnAuto.info();
    }

}
