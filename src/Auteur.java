package src;
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
    
    public String getNom() {
        return this.nom;
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
    
    @SuppressWarnings("unlikely-arg-type")
    public String pointFort() {
        List<Style> keys = new ArrayList<>();
        Integer note = null;
        Style style = null;
        keys.add(Style.DRAME);
        keys.add(Style.TRAGÉDIE);
        keys.add(Style.COMÉDIE);
        for (Style key: keys) {
            if (this.perfs.containsKey(key)) {
                if (this.perfs.get(key).getQualite() > note)
                    note = this.perfs.get(key).getQualite();
                    style = key;
            }
        }
        return style.toString();
        
    }
    @Override
    public String toString() {
       return new StringBuilder().append("L'Honorable ").append(this.nom).toString();
    }
}
