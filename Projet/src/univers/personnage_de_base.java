package univers;

import java.util.ArrayList;
import java.util.Objects;

public class personnage_de_base {

    private ArrayList<String> outils;

    // attributs pour les statistiques
    private int statsCombat;
    private int statsNegociation;
    private int statsFuite;

    // Constructeur par défaut
    public personnage_de_base() {
        this(null, 5, 5, 5);
    }

    // Constructeur avec statistiques spécifiques
    public personnage_de_base(ArrayList<String> outils,
                              int statsCombat, int statsNegociation, int statsFuite) {
        this.outils = outils;
        this.statsCombat = statsCombat;
        this.statsNegociation = statsNegociation;
        this.statsFuite = statsFuite;
    }

    // Getters et setters
    public int getStatsCombat() {
        return statsCombat;
    }

    public void setStatsCombat(int statsCombat) {
        this.statsCombat = statsCombat;
    }

    public int getStatsNegociation() {
        return statsNegociation;
    }

    public void setStatsNegociation(int statsNegociation) {
        this.statsNegociation = statsNegociation;
    }

    public int getStatsFuite() {
        return statsFuite;
    }

    public void setStatsFuite(int statsFuite) {
        this.statsFuite = statsFuite;
    }

    public ArrayList<String> getOutils() {
        return outils;
    }

    public void setOutils(ArrayList<String> outils) {
        this.outils = outils;
    }

    @Override
    public String toString() {
        return "Statistiques du personnage :" +
               "\nStatistiques de combat : " + statsCombat + ", Négociation : " + statsNegociation + ", Fuite : " + statsFuite +
               "\nOutils : " + outils;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof personnage_de_base)) return false;
        personnage_de_base that = (personnage_de_base) o;
        return statsCombat == that.statsCombat &&
               statsNegociation == that.statsNegociation &&
               statsFuite == that.statsFuite &&
               Objects.equals(outils, that.outils);
    }
}
