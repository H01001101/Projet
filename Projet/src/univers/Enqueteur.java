package univers;

import java.util.ArrayList;

public class Enqueteur extends personnage_de_base {

		public Enqueteur() {
			super();
		}
		
		public Enqueteur(int a, int b, int c, ArrayList<String> d) {
			super(80,60,60,d);
		}
		
		public String toString() {
			return ("Le personnage est un enquêteur.\n"+super.toString());
		}
		
		public boolean equals(Object o) {
			return super.equals(o);
		}
}
