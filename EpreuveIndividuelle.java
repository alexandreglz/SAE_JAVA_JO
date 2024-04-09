import java.util.ArrayList;
import java.util.List;

public class EpreuveIndividuelle extends Epreuves{
    private List<Participer> equipes;

    public EpreuveIndividuelle(List<Participer> athletes) {
        super(nom,scoreMax);
        this.athletes = new ArrayList<>();
    }

    
}
}
