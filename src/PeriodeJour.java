package src;

public enum PeriodeJour {
    MATIN("Matin"),
    APRESMIDI("Après-midi"),
    SOIREE("Soirée");
    
    private String label;

    private PeriodeJour(String label) {
        this.label = label;
    }
    public String toString() {
        return this.label;
    }
}
