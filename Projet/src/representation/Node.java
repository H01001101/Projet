package representation;	

/**
 * Cette classe abstraite permet de représenter les noeuds de notre histoire
 * Elle contient les méthodes permettant de construire ces objets
 */

public abstract class Node implements Event{
		
		private String description;
		static private int nombreObjetsNode = 1;
		final private int id;
		
		public Node() {
			this.description = null;
			this.id = nombreObjetsNode;
			nombreObjetsNode++;
		}
		
		/**
		 * Crée un noeud
		 * 
		 * @param description la description du noeud
		 */
		public Node(String description) {
			this.description = description;
			this.id = nombreObjetsNode;
			nombreObjetsNode++;
		}
		
		public String getDescription() {
			return description;
		}
		
		public int getId() {
			return id;
		}
		
		void setDescription(String description) {
			this.description = description;
		}

		public String toString() {
			return ("Evenement : "+this.description);
		}
		
		public boolean equals(Object o) {
			if(o instanceof Node) {
				Node n = (Node) o;
				if(this.description==n.description) {
					return true;
				}
			}
			return false;
		}
		
		public void display() {
			System.out.println(this.description);
		}
		
		public abstract Node chooseNext() ;
}
