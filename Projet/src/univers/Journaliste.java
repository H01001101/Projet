package univers;

import java.util.ArrayList;

public class Journaliste extends personnage_de_base {

		public Journaliste() {
			super();
		}
		
		public Journaliste(int a, int b, int c, ArrayList<String> d) {
			super(40,40,80,d);
		}
		
		public String toString() {
			return ("Le personnage est un journaliste.\n"+super.toString());
		}
		
		public boolean equals(Object o) {
			return super.equals(o);
		}
}
