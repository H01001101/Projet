package univers;

import java.util.ArrayList;
import representation.*;

/**
 * Cette classe représente le type de personnage journaliste
 */

public class Journaliste extends personnage_de_base {

		public Journaliste() {
			super();
		}
		
		public Journaliste(int a, int b, int c, ArrayList<Outils> d, ArrayList<Node> e) {
			super(a,b,c,d,e);
		}
		
		@Override
		public String toString() {
			return ("Voici les stats du journaliste :\n"+super.toString());
		}
		
		@Override
		public boolean equals(Object o) {
			return super.equals(o);
		}
}
