package src;

public class Epreuve {
    private Style style;
    private PeriodeJour pJour;
    private int nbSpec;

    public Epreuve(Style style, PeriodeJour pJour, int nbSpec) {
        this.style = style;
        this.pJour = pJour;
        this.nbSpec = nbSpec;
    }

    public String getStyle() {
        return style.toString();
    }
    public String getPeriodeJour() {
        return pJour.toString();
    }
    public int getNbSpectateur() {
        return this.nbSpec;
    }

    public String winner(Auteur auteur1, Auteur auteur2) {
        return "";
    }

    public int getWinnerScore(Auteur auteur1, Auteur auteur2) {
        return 0;
    }
}
