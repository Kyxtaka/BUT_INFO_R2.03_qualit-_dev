import java.util.HashMap;
import java.util.Map;

public class Auteur {
    private String nom;
    private String citationTragedie;
    private String citationComedie;
    private String citationDrama;
    private Map<String, Integer> perfs;

    public Auteur(String nom, int tragedieNote, String tragedie, int comedieNote, String comedie, int dramaNote, String drama) {
        this.nom = nom;
        this.citationTragedie = tragedie;
        this.citationComedie = comedie;
        this.citationDrama = drama;
        this.perfs = new HashMap<>();
        this.perfs.put("TRAGEDIE", tragedieNote);
        this.perfs.put("COMEDIE", comedieNote);
        this.perfs.put("DRAMA", dramaNote);
        }
    public String getCitationTragedie() {
        return this.citationTragedie;
    }
    @Override
    public String toString() {
       return new StringBuilder().append("L'Honorable ").append(this.nom).toString();
    }
}
