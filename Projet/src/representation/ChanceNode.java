package representation;

import java.util.ArrayList;
import java.util.Random;

public class ChanceNode extends InnerNode {

		public ChanceNode() {
			super();
		}
		
		public ChanceNode(String d, ArrayList<Node> n) {
			super(d,n);
		}
		
		@Override
		public String toString() {
			return super.toString();
		}
		
		@Override
		public boolean equals(Object o) {
			return super.equals(o);
		}
		
		public Node chooseNext() {
			Random rand = new Random();
			int n = rand.nextInt(1, this.getNoeuds().size()+1);
			return this.getNoeuds().get(n-1);
		}
}
