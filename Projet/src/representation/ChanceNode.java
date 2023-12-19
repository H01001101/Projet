package representation;

import java.util.ArrayList;
import java.util.Random;

public class ChanceNode extends InnerNode implements Combat, Fuite, Negociation {

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
			if(this.equals(Main.combat1_1) || this.equals(Main.combat1_2) || this.equals(Main.combat1_3) || this.equals(Main.combat1_4) || this.equals(Main.combat2_1) || this.equals(Main.combat2_2) || this.equals(Main.combat2_3) || this.equals(Main.combat2_4) || this.equals(Main.combat3_1)) {
				return this.combat();
			}
			if(this.equals(Main.fuite1_1) || this.equals(Main.fuite1_2) || this.equals(Main.fuite1_3) || this.equals(Main.fuite1_4) || this.equals(Main.fuite2_1) || this.equals(Main.fuite2_2) || this.equals(Main.fuite2_3) || this.equals(Main.fuite2_4) || this.equals(Main.fuite3_1)) {
				return this.fuite();
			}
			else {
				return this.negociation();
			}
		}
		
		public Node combat() {
			Random rand = new Random();
			int n = rand.nextInt(1,101);
			if(Main.perso.getStatsCombat()>n) {
				return this.getNoeuds().get(1);
			}
			else {
				return this.getNoeuds().get(0);
			}
		}
		
		public Node fuite() {
			Random rand = new Random();
			int n = rand.nextInt(1,101);
			if(Main.perso.getStatsFuite()>n) {
				return this.getNoeuds().get(1);
			}
			else {
				return this.getNoeuds().get(0);
			}
		}
		
		public Node negociation() {
			Random rand = new Random();
			int n = rand.nextInt(1,101);
			if(Main.perso.getStatsNegociation()>n) {
				return this.getNoeuds().get(1);
			}
			else {
				return this.getNoeuds().get(0);
			}
		}
}
