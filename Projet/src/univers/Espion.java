package univers;

import java.util.ArrayList;
import representation.*;

/**
 * Cette classe représente le type de personnage espion
 */

public class Espion extends personnage_de_base {
		
		public Espion() {
			super();
		}
		
		public Espion(int a, int b, int c, ArrayList<Outils> d, ArrayList<Node> e) {
			super(a,b,c,d,e);
		}
		
		@Override
		public String toString() {
			return ("Voici les stats de l'espion :\n"+super.toString());
		}
		
		@Override
		public boolean equals(Object o) {
			return super.equals(o);
		}
}
