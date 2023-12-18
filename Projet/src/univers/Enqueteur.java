
package univers;

import java.util.ArrayList;

public class Enqueteur extends personnage_de_base {

    public Enqueteur() {
        super();
    }

    public Enqueteur(String nom, int niveau, int intelligence, int physique, int contacts, ArrayList<String> outils,
                     int statsCombat, int statsNegociation, int statsFuite) {
        super(nom, niveau, intelligence, physique, contacts, outils, statsCombat, statsNegociation, statsFuite);
    }

        @Override
    public String toString() {
        return "Le personnage est un enqueteur.\n" + super.toString();
    }

      @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    
}

