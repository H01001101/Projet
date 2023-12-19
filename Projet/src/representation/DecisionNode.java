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
			//si il n'y a qu'un noeud suivant
			if(n==1) {
				return this.getNoeuds().get(n-1);
			}
			
			//si il y a plusieurs noeuds suivants mais selon le chemin parcouru, il y en a un de sélectionné d'office
			ArrayList<Node> chemin = Main.perso.getChemin();
			//suites de l'histoire
			//combats 1
			if(chemin.contains(Main.choixconfrontation1_1) && this.equals(Main.confrontation1_1)) {
				return this.getNoeuds().get(0);
			}
			if(chemin.contains(Main.choixconfrontation1_2) && this.equals(Main.confrontation1_1)) {
				return this.getNoeuds().get(1);
			}
			if(chemin.contains(Main.choixconfrontation1_3) && this.equals(Main.confrontation1_1)) {
				return this.getNoeuds().get(2);
			}
			if(chemin.contains(Main.choixconfrontation1_4) && this.equals(Main.confrontation1_1)) {
				return this.getNoeuds().get(3);
			}
			
			//fuites 1
			if(chemin.contains(Main.choixconfrontation1_1) && this.equals(Main.confrontation1_2)) {
				return this.getNoeuds().get(0);
			}
			if(chemin.contains(Main.choixconfrontation1_2) && this.equals(Main.confrontation1_2)) {
				return this.getNoeuds().get(1);
			}
			if(chemin.contains(Main.choixconfrontation1_3) && this.equals(Main.confrontation1_2)) {
				return this.getNoeuds().get(2);
			}
			if(chemin.contains(Main.choixconfrontation1_4) && this.equals(Main.confrontation1_2)) {
				return this.getNoeuds().get(3);
			}
			
			//negos 1
			if(chemin.contains(Main.choixconfrontation1_1) && this.equals(Main.confrontation1_3)) {
				return this.getNoeuds().get(0);
			}
			if(chemin.contains(Main.choixconfrontation1_2) && this.equals(Main.confrontation1_3)) {
				return this.getNoeuds().get(1);
			}
			if(chemin.contains(Main.choixconfrontation1_3) && this.equals(Main.confrontation1_3)) {
				return this.getNoeuds().get(2);
			}
			if(chemin.contains(Main.choixconfrontation1_4) && this.equals(Main.confrontation1_3)) {
				return this.getNoeuds().get(3);
			}
			
			//choixville 1
			if(this.equals(Main.choixville2) && this.getNoeuds().size()==3) {
				if(chemin.contains(Main.ville1_1)) {
					ArrayList<Node> villes = this.getNoeuds();
					villes.remove(Main.ville2_1);
					this.setNoeuds(villes);
				}
				if(chemin.contains(Main.ville1_2)) {
					ArrayList<Node> villes = this.getNoeuds();
					villes.remove(Main.ville2_2);
					this.setNoeuds(villes);
				}
				if(chemin.contains(Main.ville1_3)) {
					ArrayList<Node> villes = this.getNoeuds();
					villes.remove(Main.ville2_3);
					this.setNoeuds(villes);
				}
			}
			
			//combats 2
			if(chemin.contains(Main.choixconfrontation2_1) && this.equals(Main.confrontation2_1)) {
				return this.getNoeuds().get(0);
			}
			if(chemin.contains(Main.choixconfrontation2_2) && this.equals(Main.confrontation2_1)) {
				return this.getNoeuds().get(1);
			}
			if(chemin.contains(Main.choixconfrontation2_3) && this.equals(Main.confrontation2_1)) {
				return this.getNoeuds().get(2);
			}
			if(chemin.contains(Main.choixconfrontation2_4) && this.equals(Main.confrontation2_1)) {
				return this.getNoeuds().get(3);
			}
			
			//fuites 2
			if(chemin.contains(Main.choixconfrontation2_1) && this.equals(Main.confrontation2_2)) {
				return this.getNoeuds().get(0);
			}
			if(chemin.contains(Main.choixconfrontation2_2) && this.equals(Main.confrontation2_2)) {
				return this.getNoeuds().get(1);
			}
			if(chemin.contains(Main.choixconfrontation2_3) && this.equals(Main.confrontation2_2)) {
				return this.getNoeuds().get(2);
			}
			if(chemin.contains(Main.choixconfrontation2_4) && this.equals(Main.confrontation2_2)) {
				return this.getNoeuds().get(3);
			}
			
			//negos 2
			if(chemin.contains(Main.choixconfrontation2_1) && this.equals(Main.confrontation2_3)) {
				return this.getNoeuds().get(0);
			}
			if(chemin.contains(Main.choixconfrontation2_2) && this.equals(Main.confrontation2_3)) {
				return this.getNoeuds().get(1);
			}
			if(chemin.contains(Main.choixconfrontation2_3) && this.equals(Main.confrontation2_3)) {
				return this.getNoeuds().get(2);
			}
			if(chemin.contains(Main.choixconfrontation2_4) && this.equals(Main.confrontation2_3)) {
				return this.getNoeuds().get(3);
			}
			
			//choixville 2
			if(this.equals(Main.choixville5)) {
				if(chemin.contains(Main.ville1_1) && chemin.contains(Main.ville2_2)) {
					return this.getNoeuds().get(2);
				}
				if(chemin.contains(Main.ville1_1) && chemin.contains(Main.ville2_3)) {
					return this.getNoeuds().get(1);
				}
				if(chemin.contains(Main.ville1_2) && chemin.contains(Main.ville2_1)) {
					return this.getNoeuds().get(2);
				}
				if(chemin.contains(Main.ville1_2) && chemin.contains(Main.ville2_3)) {
					return this.getNoeuds().get(0);
				}
				if(chemin.contains(Main.ville1_3) && chemin.contains(Main.ville2_1)) {
					return this.getNoeuds().get(1);
				}
				if(chemin.contains(Main.ville1_3) && chemin.contains(Main.ville2_2)) {
					return this.getNoeuds().get(0);
				}
			}
			
			//fins de l'histoire 1
			if(this.equals(Main.enquete1_2)) {
				if(chemin.contains(Main.planque1_1)) {
					return this.getNoeuds().get(0);
				}
				return this.getNoeuds().get(1);
			}
			if(this.equals(Main.enquete1_3)) {
				if(chemin.contains(Main.planque1_2)) {
					return this.getNoeuds().get(0);
				}
				return this.getNoeuds().get(1);
			}
			if(this.equals(Main.enquete1_4)) {
				if(chemin.contains(Main.planque1_3)) {
					return this.getNoeuds().get(0);
				}
				return this.getNoeuds().get(1);
			}
			
			//fins de l'histoire 2
			if(this.equals(Main.enquete2_1)) {
				if(chemin.contains(Main.planque2_1)) {
					return this.getNoeuds().get(0);
				}
				return this.getNoeuds().get(1);
			}
			if(this.equals(Main.enquete2_3)) {
				if(chemin.contains(Main.planque2_3)) {
					return this.getNoeuds().get(0);
				}
				return this.getNoeuds().get(1);
			}
			if(this.equals(Main.enquete2_4)) {
				if(chemin.contains(Main.planque2_4) ) {
					return this.getNoeuds().get(0);
				}
				return this.getNoeuds().get(1);
			}
			
			//choix classiques
			System.out.println("Voici les différents choix :");
			for(int i = 0; i<this.getNoeuds().size(); i++) {
				System.out.println(this.getNoeuds().get(i).getDescription());
				this.getNoeuds().get(i).setDescription("");
			}
			Scanner scanner = new Scanner(System.in);
			System.out.println("Choisis l'une des "+n+" options :");
			int nombre = scanner.nextInt();
			return this.getNoeuds().get(nombre-1);
		}
}
