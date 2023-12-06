package representation;

import java.util.ArrayList;

public abstract class InnerNode extends Node {
		
		private ArrayList<Node> noeuds;
		
		public InnerNode() {
			super();
			this.noeuds = null;
		}
		
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
