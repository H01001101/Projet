package univers;

import java.util.ArrayList;

public class personnage_de_base {
		
		private int intelligence;
		private int physique;
		private int contacts;
		private ArrayList<String> outils;
	
		public personnage_de_base() {
			this.intelligence = 0;
			this.physique = 0;
			this.contacts = 0;
			this.outils = null;
		}
		
		public personnage_de_base(int a, int b, int c, ArrayList<String> d) {
			this.intelligence = a;
			this.physique = b;
			this.contacts = c;
			this.outils = d;
		}

		public int getIntelligence() {
			return intelligence;
		}

		public void setIntelligence(int intelligence) {
			this.intelligence = intelligence;
		}

		public int getPhysique() {
			return physique;
		}

		public void setPhysique(int physique) {
			this.physique = physique;
		}

		public int getContacts() {
			return contacts;
		}

		public void setContacts(int contacts) {
			this.contacts = contacts;
		}

		public ArrayList<String> getOutils() {
			return outils;
		}

		public void setOutils(ArrayList<String> outils) {
			this.outils = outils;
		}
		
		public String toString() {
			return ("Les caractéristiques du personnage sont : \nintelligence : "+this.intelligence+"\nphysique : "+this.physique+"\ncontacts : "+this.contacts);
		}
		
		public boolean equals(Object o) {
			if(o instanceof personnage_de_base) {
				personnage_de_base pdb = (personnage_de_base) o;
				if(pdb.intelligence==this.intelligence && pdb.physique==this.physique && pdb.contacts==this.contacts && pdb.outils==this.outils) {
					return true;
				}
			}
			return false;
		}
}
