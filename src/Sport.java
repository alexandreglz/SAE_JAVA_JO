import java.util.ArrayList;
import java.util.List;

public class Sport {
    private List<Epreuves> lesEpreuves;
    private String nom;

    public Sport(String nom) {
        this.nom = nom;
        this.lesEpreuves = new ArrayList<>();
    }

    public Sport(String nom, List<Epreuves> lesEpreuves) {
        this.nom = nom;
        this.lesEpreuves = new ArrayList<>(lesEpreuves);
    }

    public void enregistrerEpreuve(Epreuves Epreuves) {
        this.lesEpreuves.add(Epreuves);
    }

    public void supprimerEpreuve(Epreuves Epreuves) {
        this.lesEpreuves.remove(Epreuves);
    }

    public List<Epreuves> getLesEpreuves() {
        return lesEpreuves;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
