public abstract class Epreuves {
    protected String nom;
    protected int scoreMax;
    protected String sexe;
    
    public Epreuves(String nom, int scoreMax, String sexe) {
        this.nom = nom;
        this.scoreMax = scoreMax;
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getScoreMax() {
        return scoreMax;
    }

    public void setScoreMax(int scoreMax) {
        this.scoreMax = scoreMax;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    
}
