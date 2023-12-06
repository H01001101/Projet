package univers;

import java.util.ArrayList;

public class Espion extends personnage_de_base {
		
		public Espion() {
			super();
		}
		
		public Espion(int a, int b, int c, ArrayList<String> d) {
			super(60,80,40,d);
		}
		
		public String toString() {
			return ("Le personnage est un espion.\n"+super.toString());
		}
		
		public boolean equals(Object o) {
			return super.equals(o);
		}
}
