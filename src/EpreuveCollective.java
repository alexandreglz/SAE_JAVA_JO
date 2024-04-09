public class EpreuveCollective extends Epreuves{
    private List<Participer> equipes;

    public EpreuveCollective(List<Participer> equipes) {
        super(nom,scoreMax);
        this.equipes = equipes;
    }

    
}
