package univers;

import java.util.ArrayList;
import representation.*;

public class Enqueteur extends personnage_de_base {

<<<<<<< HEAD
		public Enqueteur() {
			super();
		}
		
		public Enqueteur(int a, int b, int c, ArrayList<Outils> d, ArrayList<Node> e) {
			super(a,b,c,d,e);
		}
		
		public String toString() {
			return ("Le personnage est un enquêteur.\n"+super.toString());
		}
		
		public boolean equals(Object o) {
			return super.equals(o);
		}
=======
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
>>>>>>> branch 'master' of https://github.com/H01001101/Projet.git
}
