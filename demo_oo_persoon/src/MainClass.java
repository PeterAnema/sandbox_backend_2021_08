public class MainClass {

    public static void main(String[] args) {

        System.out.println("Hello");

        Persoon p = new Persoon("Peter", "Lhee");
        p.vertel();

        Persoon p2 = new Persoon("Henk", "Utrecht");
        p2.vertel();

        p.verhuis("AmsTERdAM");
        p.vertel();

        p.setWoonplaats("Rotterdam");
        System.out.println(p.getNaam());
        p.vertel();

        Kopje k = new Kopje("Wit", 200, "Porcelein");
        k.info();

        k.vul("koffie", 150);
        k.info();
    }

}
