package univers;

import java.util.ArrayList;
import representation.*;

public class Journaliste extends personnage_de_base {

		public Journaliste() {
			super();
		}
		
		public Journaliste(int a, int b, int c, ArrayList<Outils> d, ArrayList<Node> e) {
			super(a,b,c,d,e);
		}
		
		public String toString() {
			return ("Le personnage est un journaliste.\n"+super.toString());
		}
		
		public boolean equals(Object o) {
			return super.equals(o);
		}
}
