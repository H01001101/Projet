package univers;

import java.util.ArrayList;
import representation.*;

public class Espion extends personnage_de_base {
		
		public Espion() {
			super();
		}
		
		public Espion(int a, int b, int c, ArrayList<Outils> d, ArrayList<Node> e) {
			super(a,b,c,d,e);
		}
		
		public String toString() {
			return ("Le personnage est un espion.\n"+super.toString());
		}
		
		public boolean equals(Object o) {
			return super.equals(o);
		}
}
