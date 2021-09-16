public class Kopje {

    // attributen
    String kleur;
    int maxVolume;
    String materiaal;
    int volume;
    String inhoud;
    boolean schoon;

    // constructor
    public Kopje(String kleur, int volume, String materiaal) {
        this.kleur = kleur;
        this.maxVolume = volume;
        this.materiaal = materiaal;
        this.schoon = true;
        this.volume = 0;
        this.inhoud = "";
    }

    // getters en setters
    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public int getVolume() {
        return maxVolume;
    }

    public void setVolume(int volume) {
        this.maxVolume = volume;
    }

    public String getMateriaal() {
        return materiaal;
    }

    public void setMateriaal(String materiaal) {
        this.materiaal = materiaal;
    }

    // methode
    public void info() {
        System.out.println(kleur + " kopje van " + materiaal + " met volume " + maxVolume + "ml.");
        if (volume == 0) {
            System.out.println("Er zit nu niets in.");
        } else {
            System.out.println("Er zit nu " + volume + "ml " + inhoud + " in.");
        }
    }

    public void vul(String inhoud, int volume) {
        this.schoon = false;
        this.inhoud = inhoud;
        this.volume = volume;
    }

    public void maakSchoon() {
        this.schoon = true;
    }

}
