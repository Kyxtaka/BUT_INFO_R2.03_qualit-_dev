import java.util.HashMap;
import java.util.Map;

public class Auteur {
    private String nom;
    private Map<String, Performance> perfs;

    public Auteur(String nom, int tragedieNote, String tragedie, int comedieNote, String comedie, int dramaNote, String drama) {
        this.nom = nom;
        this.perfs = new HashMap<>();
        this.perfs.put("TRAGEDIE", new Performance(tragedie, tragedieNote));
        this.perfs.put("COMEDIE", new Performance(comedie, comedieNote));
        this.perfs.put("DRAMA", new Performance(drama, dramaNote));
        }

    public String getCitationTragedie() {
        return this.perfs.get("TRAGEDIE").getCitation();
    }
    public String getCitationComedie() {
        return this.perfs.get("COMEDIE").getCitation();
    }
    public String getCitationDrame() {
        return this.perfs.get("DRAME").getCitation();
    }
    @Override
    public String toString() {
       return new StringBuilder().append("L'Honorable ").append(this.nom).toString();
    }
}
