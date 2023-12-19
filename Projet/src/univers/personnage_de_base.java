package univers;

import java.util.ArrayList;
import java.util.Objects;
<<<<<<< HEAD
import representation.*;
=======
>>>>>>> branch 'master' of https://github.com/H01001101/Projet.git

public class personnage_de_base {

<<<<<<< HEAD
    private ArrayList<Outils> outils;
    private int statsCombat;
    private int statsNegociation;
    private int statsFuite;
    private ArrayList<Node> chemin;
=======
    private ArrayList<String> outils;
>>>>>>> branch 'master' of https://github.com/H01001101/Projet.git

<<<<<<< HEAD
    // Constructeur par défaut
    public personnage_de_base() {
    	this.statsCombat = 0;
    	this.statsNegociation = 0;
    	this.statsFuite = 0;
        this.outils=null;
        this.chemin = null;
    }
=======
    // attributs pour les statistiques
    private int statsCombat;
    private int statsNegociation;
    private int statsFuite;
>>>>>>> branch 'master' of https://github.com/H01001101/Projet.git

<<<<<<< HEAD
    // Constructeur avec statistiques spécifiques
    public personnage_de_base(int statsCombat, int statsNegociation, int statsFuite, ArrayList<Outils> d, ArrayList<Node> c) {
        this.statsCombat = statsCombat;
        this.statsNegociation = statsNegociation;
        this.statsFuite = statsFuite;
        this.outils = d;
        this.chemin = c;
=======
    // Constructeur par défaut
    public personnage_de_base() {
        this(null, 5, 5, 5);
>>>>>>> branch 'master' of https://github.com/H01001101/Projet.git
    }

<<<<<<< HEAD
 
    // Getters et setters
    public int getStatsCombat() {
        return statsCombat;
=======
    // Constructeur avec statistiques spécifiques
    public personnage_de_base(ArrayList<String> outils,
                              int statsCombat, int statsNegociation, int statsFuite) {
        this.outils = outils;
        this.statsCombat = statsCombat;
        this.statsNegociation = statsNegociation;
        this.statsFuite = statsFuite;
>>>>>>> branch 'master' of https://github.com/H01001101/Projet.git
    }

<<<<<<< HEAD
    public void setStatsCombat(int statsCombat) {
        this.statsCombat = statsCombat;
=======
    // Getters et setters
    public int getStatsCombat() {
        return statsCombat;
>>>>>>> branch 'master' of https://github.com/H01001101/Projet.git
    }

<<<<<<< HEAD
    public int getStatsNegociation() {
        return statsNegociation;
=======
    public void setStatsCombat(int statsCombat) {
        this.statsCombat = statsCombat;
>>>>>>> branch 'master' of https://github.com/H01001101/Projet.git
    }

<<<<<<< HEAD
    public void setStatsNegociation(int statsNegociation) {
        this.statsNegociation = statsNegociation;
=======
    public int getStatsNegociation() {
        return statsNegociation;
>>>>>>> branch 'master' of https://github.com/H01001101/Projet.git
    }

<<<<<<< HEAD
    public int getStatsFuite() {
        return statsFuite;
    }

    public void setStatsFuite(int statsFuite) {
        this.statsFuite = statsFuite;
    }

    public ArrayList<Outils> getOutils() {
        return outils;
    }

    public void setOutils(ArrayList<Outils> outils) {
        this.outils = outils;
    }
    
    public void setChemin(ArrayList<Node> chemin) {
    	this.chemin = chemin;
    }
    
    public ArrayList<Node> getChemin() {
    	return chemin;
    }

    @Override
    public String toString() {
        return "Personnage : " + "\nStatistiques de combat : " + statsCombat + ", Négociation : " + statsNegociation + ", Fuite : " + statsFuite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof personnage_de_base)) return false;
        personnage_de_base that = (personnage_de_base) o;
        return statsCombat == that.statsCombat && statsNegociation == that.statsNegociation && statsFuite == that.statsFuite && Objects.equals(outils, that.outils);
    }
}
=======
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
>>>>>>> branch 'master' of https://github.com/H01001101/Projet.git
