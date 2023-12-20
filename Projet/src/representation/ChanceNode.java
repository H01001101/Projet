package representation;

import java.util.ArrayList;
import java.util.Random;
import univers.*;

/**
 * Cette classe représente les noeuds qui mènent vers d'autres noeuds de manière aléatoire
 * Elle contient les méthodes permettant de déterminer aléatoirement le noeud suivant
 */

public class ChanceNode extends InnerNode implements Combat, Fuite, Negociation {

		public ChanceNode() {
			super();
		}
		
		/**
		 * Crée un ChanceNode
		 * 
		 * @param d la description du noeud
		 * @param n la liste de ses successeurs
		 */
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
		
		/**
		 * Choisis aléatoirement le noeud suivant
		 * 
		 * @return le noeud choisis aléatoirement
		 */
		@Override
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
		
		/**
		 * Choisis aléatoirement l'issue d'un combat
		 * 
		 * @return l'issue du combat
		 */
		@Override
		public Node combat() {
			Random rand = new Random();
			int n = rand.nextInt(1,101);
			if(Main.perso.getOutils().contains(Outils.ARME_A_FEU)) {
				if(Main.perso.getOutils().contains(Outils.ALLIE)) {
					if(Main.perso.getStatsCombat()+20>n) {
						Main.perso.getOutils().remove(Outils.ARME_A_FEU);
						Main.perso.getOutils().remove(Outils.ALLIE);
						Main.perso.setStatsCombat(Main.perso.getStatsCombat()+5);
						System.out.println("Tu as perdu un allié et une arme à feu mais tu as gagné 5 points de combat");
						return this.getNoeuds().get(1);
					}
					else {
						Main.perso.getOutils().remove(Outils.ARME_A_FEU);
						Main.perso.getOutils().remove(Outils.ALLIE);
						return this.getNoeuds().get(0);
					}
				}
				else {
					if(Main.perso.getStatsCombat()+10>n) {
						Main.perso.getOutils().remove(Outils.ARME_A_FEU);
						Main.perso.setStatsCombat(Main.perso.getStatsCombat()+5);
						System.out.println("Tu as perdu une arme à feu mais tu as gagné 5 points de combat");
						return this.getNoeuds().get(1);
					}
					else {
						Main.perso.getOutils().remove(Outils.ARME_A_FEU);
						return this.getNoeuds().get(0);
					}
				}
			}
			if(Main.perso.getOutils().contains(Outils.ALLIE)) {
				if(Main.perso.getOutils().contains(Outils.ARME_A_FEU)) {
					if(Main.perso.getStatsCombat()+20>n) {
						Main.perso.getOutils().remove(Outils.ARME_A_FEU);
						Main.perso.getOutils().remove(Outils.ALLIE);
						Main.perso.setStatsCombat(Main.perso.getStatsCombat()+5);
						System.out.println("Tu as perdu un allié et une arme à feu mais tu as gagné 5 points de comba");
						return this.getNoeuds().get(1);
					}
					else {
						Main.perso.getOutils().remove(Outils.ARME_A_FEU);
						Main.perso.getOutils().remove(Outils.ALLIE);
						return this.getNoeuds().get(0);
					}
				}
				else {
					if(Main.perso.getStatsCombat()+10>n) {
						Main.perso.getOutils().remove(Outils.ALLIE);
						Main.perso.setStatsCombat(Main.perso.getStatsCombat()+5);
						System.out.println("Tu as perdu un allié mais tu as gagné 5 points de combat");
						return this.getNoeuds().get(1);
					}
					else {
						Main.perso.getOutils().remove(Outils.ALLIE);
						return this.getNoeuds().get(0);
					}
				}
			}
			if(Main.perso.getStatsCombat()>n) {
				Main.perso.setStatsCombat(Main.perso.getStatsCombat()+5);
				System.out.println("Tu as gagné 5 points de combat");
				return this.getNoeuds().get(1);
			}
			else {
				return this.getNoeuds().get(0);
			}
		}
		
		/**
		 * Choisis aléatoirement l'issue d'une fuite
		 * 
		 * @return l'issue de la fuite
		 */
		@Override
		public Node fuite() {
			Random rand = new Random();
			int n = rand.nextInt(1,101);
			if(Main.perso.getOutils().contains(Outils.VEHICULE)) {
				if(Main.perso.getStatsFuite()+10>n) {
					Main.perso.getOutils().remove(Outils.VEHICULE);
					Main.perso.setStatsCombat(Main.perso.getStatsFuite()+5);
					System.out.println("Tu as perdu ton véhicule dans la fuite mais tu as gagné 5 points de fuite");
					return this.getNoeuds().get(1);
				}
				else {
					return this.getNoeuds().get(0);
				}
			}
			if(Main.perso.getStatsFuite()>n) {
				Main.perso.setStatsCombat(Main.perso.getStatsFuite()+5);
				System.out.println("Tu as gagné 5 points de fuite");
				return this.getNoeuds().get(1);
			}
			else {
				return this.getNoeuds().get(0);
			}
		}
		
		/**
		 * Choisis aléatoirement l'issue d'une négociation
		 * 
		 * @return l'issue de la négociation
		 */
		@Override
		public Node negociation() {
			Random rand = new Random();
			int n = rand.nextInt(1,101);
			if(Main.perso.getOutils().contains(Outils.INFORMATION)) {
				if(this.equals(Main.arg1_3) || this.equals(Main.arg2_3)) {
					if(n<30) {
						Main.perso.getOutils().remove(Outils.INFORMATION);
						Main.perso.setStatsCombat(Main.perso.getStatsNegociation()+5);
						System.out.println("Tu as perdu une information mais tu as gagné 5 points de négociation");
						return this.getNoeuds().get(1);
					}
					else {
						Main.perso.getOutils().remove(Outils.INFORMATION);
						return this.getNoeuds().get(0);
					}
				}
				if(Main.perso.getStatsNegociation()+10>n) {
					Main.perso.getOutils().remove(Outils.INFORMATION);
					Main.perso.setStatsCombat(Main.perso.getStatsNegociation()+5);
					System.out.println("Tu as perdu une information mais tu as gagné 5 points de négociation");
					return this.getNoeuds().get(1);
				}
				else {
					Main.perso.getOutils().remove(Outils.INFORMATION);
					return this.getNoeuds().get(0);
				}
			}
			
			if(this.equals(Main.arg1_3) || this.equals(Main.arg2_3)) {
				if(n<20) {
					Main.perso.setStatsCombat(Main.perso.getStatsNegociation()+5);
					System.out.println("Tu as gagné 5 points de négociation");
					return this.getNoeuds().get(1);
				}
				else {
					return this.getNoeuds().get(0);
				}
			}
			if(Main.perso.getStatsNegociation()>n) {
				Main.perso.setStatsCombat(Main.perso.getStatsNegociation()+5);
				System.out.println("Tu as gagné 5 points de négociation");
				return this.getNoeuds().get(1);
			}
			else {
				return this.getNoeuds().get(0);
			}
		}
}
