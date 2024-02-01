public class Auteur {
    private String nom;
    private String qualiteTragedie;
    private String qualiteComedie;
    private String qualiteDrama;

    public Auteur(String nom, int tragedieNote, String tragedie, int comedieNote, String comedie, int dramaNote, String drama) {
        this.nom = nom;
        this.qualiteTragedie = "["+tragedieNote+", "+tragedie+"]";
        this.qualiteTragedie = "["+comedieNote+", "+comedie+"]";
        this.qualiteTragedie = "["+dramaNote+", "+drama+"]";
    }
    @Override
    public String toString() {
       return new StringBuilder().append("L'Honorable").append(this.nom).toString();
    }
}
