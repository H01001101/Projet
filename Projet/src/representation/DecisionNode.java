package representation;

import java.util.ArrayList;
import java.util.Scanner;

public class DecisionNode extends InnerNode {
		
		public DecisionNode() {
			super();
		}
		
		public DecisionNode(String d, ArrayList<Node> n) {
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
			int n = this.getNoeuds().size();
			if(n==1) {
				return this.getNoeuds().get(n-1);
			}
			System.out.println("Voici les différents choix :");
			for(int i = 0; i<this.getNoeuds().size(); i++) {
				System.out.println(this.getNoeuds().get(i).getDescription());
			}
			Scanner scanner = new Scanner(System.in);
			System.out.println("Choisis l'une des "+n+" options :");
			int nombre = scanner.nextInt();
			scanner.close();
			//le try catch est encore en chantier, ne fonctionne pas parfaitement
			try {
				return this.getNoeuds().get(nombre-1);
			} catch(Exception e) {
				System.out.println("Ce numéro ne correspond à aucun choix proposé");
				this.chooseNext();
			}
			return this.getNoeuds().get(nombre-1);
		}
}
