package src;
import java.util.List;
import java.util.ArrayList;

public class Journee {
    private Auteur auteur;
    private List<Epreuve> epreuveList;

    public Journee(Auteur auteur, Epreuve e1, Epreuve e2, Epreuve e3) {
        this.epreuveList = new ArrayList<>();
    }
    public String getAuteur() {
        return this.auteur.getNom();
    }
    public int volumeApplaudissement() {
        return 0;
    }
}
