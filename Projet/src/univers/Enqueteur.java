package univers;

import java.util.ArrayList;
import representation.*;

/**
 * Cette classe représente le type de personnage enqueteur
 */

public class Enqueteur extends personnage_de_base {

		public Enqueteur() {
			super();
		}
		
		public Enqueteur(int a, int b, int c, ArrayList<Outils> d, ArrayList<Node> e) {
			super(a,b,c,d,e);
		}
		
		@Override
		public String toString() {
			return ("Voici les stats de l'enquêteur :\n"+super.toString());
		}
		
		@Override
		public boolean equals(Object o) {
			return super.equals(o);
		}
}
