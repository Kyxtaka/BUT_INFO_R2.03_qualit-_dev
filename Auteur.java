import java.util.*;
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
        return this.perfs.get("DRAMA").getCitation();
    }

    public Integer getQualiteTragedie() {
        return this.perfs.get("TRAGEDIE").getQualite();
    }
    public Integer getQualiteComedie() {
        return this.perfs.get("COMEDIE").getQualite();
    }
    public Integer getQualiteDrame() {
        return this.perfs.get("DRAMA").getQualite();
    }

    public String getPerfsTragedie() {
        return this.getCitationTragedie()+","+this.getQualiteTragedie();
    }
    public String getPerfsComedie() {
        return this.getCitationComedie()+","+this.getQualiteComedie();
    }
    public String getPerfsDrame() {
        return this.getCitationDrame()+","+this.getQualiteDrame();
    }
    /** 
    public String pointFort() {
        Integer tempNote = null;
        Style tempStyle = null;
        List<Performance> perfs = new ArrayList<Performance>(this.perfs.get());
        for (Performance perf : List perfs)
    }
    */
    @Override
    public String toString() {
       return new StringBuilder().append("L'Honorable ").append(this.nom).toString();
    }
}
