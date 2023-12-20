package univers;

import java.util.ArrayList;
import representation.*;

/**
 * Cette classe représente un personnage
 * Elle contient les méthodes permettant de construire ces objets
 */

public class personnage_de_base {

    private ArrayList<Outils> outils;
    private int statsCombat;
    private int statsNegociation;
    private int statsFuite;
    private ArrayList<Node> chemin;

    public personnage_de_base() {
    	this.statsCombat = 0;
    	this.statsNegociation = 0;
    	this.statsFuite = 0;
        this.outils=new ArrayList<Outils>();
        this.chemin = null;
    }
    
    /**
     * Crée un personnage
     * 
     * @param statsCombat défini les compétences de combat du personnage
     * @param statsNegociation défini les compétences de négociation du personnage
     * @param statsFuite défini les compétences de fuite du personnage
     * @param o défini les outils détenus par le personnage
     * @param c défini le chemin parcouru par le personnage
     */
    public personnage_de_base(int statsCombat, int statsNegociation, int statsFuite, ArrayList<Outils> o, ArrayList<Node> c) {
        this.statsCombat = statsCombat;
        this.statsNegociation = statsNegociation;
        this.statsFuite = statsFuite;
        this.outils = o;
        this.chemin = c;
    }

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
        return "Statistiques de combat : " + statsCombat + ", Statistiques de négociation : " + statsNegociation + ", Statistiques de fuite : " + statsFuite;
    }    

    @Override
    public boolean equals(Object o) {
        if (o instanceof personnage_de_base) {
        	personnage_de_base p = (personnage_de_base) o;
        	if(this.statsCombat==p.statsCombat && this.statsNegociation==p.statsNegociation && this.statsFuite==p.statsFuite && this.outils.equals(p.outils) && this.chemin.equals(p.chemin)) {
        		return true;
        	}
        }
        return false;
    }
}