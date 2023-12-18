package univers;

import java.util.ArrayList;

public class Espion extends personnage_de_base {

    public Espion() {
        super();
    }

    public Espion(ArrayList<String> outils,
                  int statsCombat, int statsNegociation, int statsFuite) {
        super(outils, statsCombat, statsNegociation, statsFuite);
    }

    @Override
    public String toString() {
        return "Le personnage est un espion.\n" + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

}
