package univers;

import java.util.ArrayList;
import java.util.Random;

public class Espion extends personnage_de_base {

    public Espion() {
        super();
    }

    public Espion(String nom, int niveau, int a, int b, int c, ArrayList<String> d,
                  int statsCombat, int statsNegociation, int statsFuite) {
        super(nom, niveau, a, b, c, d, statsCombat, statsNegociation, statsFuite);
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
