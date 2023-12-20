package representation;

/**
 * Cette classe représente les feuilles de notre histoire
 * Elle contient les méthodes permettant de construire ces objets
 */

public class TerminalNode extends Node {
		
		public TerminalNode() {
			super();
		}
		
		/**
		 * Crée un TerminalNode
		 * 
		 * @param description la description du noeud
		 */
		public TerminalNode(String description) {
			super(description);
		}
		
		@Override
		public String toString() {
			return super.toString();
		}
		
		@Override
		public boolean equals(Object o) {
			return super.equals(o);
		}
		
		@Override
		public Node chooseNext() {
			return this;
		}
}
