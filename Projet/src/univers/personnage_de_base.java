package univers;

import java.util.ArrayList;
import java.util.Objects;

public class personnage_de_base {

    private int intelligence;
    private int physique;
    private int contacts;
    private ArrayList<String> outils;

    private String nom;
    private int niveau;

    // attributs pour les statistiques
    private int statsCombat;
    private int statsNegociation;
    private int statsFuite;

    // Constructeur par défaut
    public personnage_de_base() {
        this("Personnage de base", 1, 0, 0, 0, null, 5, 5, 5);
    }

    // Constructeur avec statistiques spécifiques
    public personnage_de_base(String nom, int niveau, int a, int b, int c, ArrayList<String> d,
                              int statsCombat, int statsNegociation, int statsFuite) {
        this.intelligence = a;
        this.physique = b;
        this.contacts = c;
        this.outils = d;
        this.nom = nom;
        this.niveau = niveau;
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

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getPhysique() {
        return physique;
    }

    public void setPhysique(int physique) {
        this.physique = physique;
    }

    public int getContacts() {
        return contacts;
    }

    public void setContacts(int contacts) {
        this.contacts = contacts;
    }

    public ArrayList<String> getOutils() {
        return outils;
    }

    public void setOutils(ArrayList<String> outils) {
        this.outils = outils;
    }

    @Override
    public String toString() {
        return "Personnage : " + nom + ", Niveau : " + niveau +
               "\nIntelligence : " + intelligence + ", Physique : " + physique + ", Contacts : " + contacts +
               "\nStatistiques de combat : " + statsCombat + ", Négociation : " + statsNegociation + ", Fuite : " + statsFuite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof personnage_de_base)) return false;
        personnage_de_base that = (personnage_de_base) o;
        return intelligence == that.intelligence &&
               physique == that.physique &&
               contacts == that.contacts &&
               niveau == that.niveau &&
               statsCombat == that.statsCombat &&
               statsNegociation == that.statsNegociation &&
               statsFuite == that.statsFuite &&
               nom.equals(that.nom) &&
               Objects.equals(outils, that.outils);
    }
}
