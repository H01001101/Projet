package univers;

public class Lieu {

		private String ville;
		private String lieu;
		
		public Lieu() {
			this.ville = null;
			this.lieu = null;
		}
		
		public Lieu(String v, String l) {
			this.ville = v;
			this.lieu = l;
		}

		public String getVille() {
			return ville;
		}

		public void setVille(String ville) {
			this.ville = ville;
		}

		public String getLieu() {
			return lieu;
		}

		public void setLieu(String lieu) {
			this.lieu = lieu;
		}
		
		public String toString() {
			return ("On est à "+this.ville+" dans "+this.lieu);
		}
		
		public boolean equals(Object o) {
			if(o instanceof Lieu) {
				Lieu l = (Lieu) o;
				if(l.ville==this.ville && l.lieu==this.lieu) {
					return true;
				}
			}
			return false;
		}
}
