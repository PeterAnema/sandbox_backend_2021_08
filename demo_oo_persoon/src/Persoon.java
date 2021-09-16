public class Persoon {

    // attributen
    private String naam;
    private String woonplaats;

    // constructor
    public Persoon(String naam, String woonplaats) {
        this.naam = naam;
        this.woonplaats = woonplaats;
    }

    // getters en setters

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    // methoden
    public void vertel() {
        System.out.println("Ik ben " + naam + " en ik woon in " + woonplaats);
    }

    public void verhuis(String nieuweWoonplaats) {
        this.woonplaats = nieuweWoonplaats.toUpperCase();
    }

}
