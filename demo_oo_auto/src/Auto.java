public class Auto {

    // attributen
    String kleur;
    String merk;
    String type;
    int bouwjaar;
    boolean automaat;
    int kilometerstand = 0;

    // constructor
    public Auto(String kleur,
                String merk,
                String type,
                int bouwjaar,
                boolean automaat) {
        this(kleur, merk, type, bouwjaar, automaat, 0);
    }
    public Auto(String kleur,
                String merk,
                String type,
                int bouwjaar,
                boolean automaat,
                int kilometerstand) {
        this.kleur = kleur;
        this.merk = merk;
        this.type = type;
        this.bouwjaar = bouwjaar;
        this.automaat = automaat;
        this.kilometerstand = kilometerstand;
    }

    // getters en setters

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBouwjaar() {
        return bouwjaar;
    }

    public void setBouwjaar(int bouwjaar) {
        this.bouwjaar = bouwjaar;
    }

    public boolean isAutomaat() {
        return automaat;
    }

    public void setAutomaat(boolean automaat) {
        this.automaat = automaat;
    }

    public int getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    // methodes
    public void stukjeRijden(int afstand) {
        this.kilometerstand += afstand;
    }

    public String beschrijving() {
        return kleur + " " + merk + " " + type + " uit " + bouwjaar + ".";
    }

    public void info() {
        System.out.println(beschrijving() + " Met " + kilometerstand + " op de teller.");
    }

    @Override
    public String toString() {
        return "Auto{" +
                "kleur='" + kleur + '\'' +
                ", merk='" + merk + '\'' +
                ", type='" + type + '\'' +
                ", bouwjaar=" + bouwjaar +
                ", automaat=" + automaat +
                ", kilometerstand=" + kilometerstand +
                '}';
    }
}
