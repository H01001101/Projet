package univers;

import java.util.ArrayList;

public class Journaliste extends personnage_de_base {

    public Journaliste() {
        super();
    }

    public Journaliste(String nom, int niveau, int a, int b, int c, ArrayList<String> d,
                       int statsCombat, int statsNegociation, int statsFuite) {
        super(nom, niveau, a, b, c, d, statsCombat, statsNegociation, statsFuite);
    }

    @Override
    public String toString() {
        return "Le personnage est un journaliste.\n" + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
