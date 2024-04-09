import java.util.ArrayList;
import java.util.List;

public class Pays {

    private String nom;
    private List<Equipe> lesEquipes;
    private List<Athlete> lesAthletes;

    public Pays(String nom) {
        this.nom = nom;
        this.lesEquipes = new ArrayList<>();
        this.lesAthletes = new ArrayList<>();
    }

    public void enregistrerEquipe(Equipe equipe) {
        this.lesEquipes.add(equipe);
    }

    public void enregistrerAthlete(Athlete athlete) {
        this.lesAthletes.add(athlete);
    }

    public void supprimerEquipe(Equipe equipe) {
        this.lesEquipes.remove(equipe);
    }

    public void supprimerAthlete(Athlete athlete) {
        this.lesAthletes.remove(athlete);
    }

    public List<Equipe> getLesEquipes() {
        return lesEquipes;
    }

    public List<Athlete> getLesAthletes() {
        return lesAthletes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int nombreAthletes() {
        return this.lesAthletes.size();
    }
}