package representation;

import java.util.ArrayList;

/**
 * Cette classe abstraite représente les noeuds qui peuvent mener à d'autres noeuds
 * Elle contient les méthodes permettant de construire ces objets
 */

public abstract class InnerNode extends Node {
		
		private ArrayList<Node> noeuds;
		
		public InnerNode() {
			super();
			this.noeuds = null;
		}
		
		/**
		 * Crée un InnerNode
		 * 
		 * @param description La description du noeud
		 * @param noeuds La liste de ses successeurs
		 */
		public InnerNode(String description, ArrayList<Node> noeuds) {
			super(description);
			this.noeuds = noeuds;
		}
		
		public ArrayList<Node> getNoeuds() {
			return noeuds;
		}

		public void setNoeuds(ArrayList<Node> noeuds) {
			this.noeuds = noeuds;
		}

		@Override
		public String toString() {
			return (super.toString());
		}
		
		@Override
		public boolean equals(Object o) {
			if(o instanceof InnerNode) {
				InnerNode in = (InnerNode) o;
				if(super.equals(o)) {
					for(int i = 0; i<in.noeuds.size(); i++) {
						if(in.noeuds.get(i) != this.noeuds.get(i)) {
							return false;
						}
					}
					return true;
				}
			}
			return false;
		}
		
		public abstract Node chooseNext() ;
}
