package univers;

import java.util.ArrayList;

public class Enqueteur extends personnage_de_base {

    public Enqueteur() {
        super();
    }

    public Enqueteur(ArrayList<String> outils,
                     int statsCombat, int statsNegociation, int statsFuite) {
        super(outils, statsCombat, statsNegociation, statsFuite);
    }

    @Override
    public String toString() {
        return "Le personnage est un enquêteur.\n" + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
