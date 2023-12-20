package representation;

import java.util.ArrayList;
import univers.*;

/**
 * Cette classe permet de modéliser la partie en cours
 * Elle contient les méthodes permettant de continuer la partie et de la finir
 */

public class Game {
		
		private Node currentNode;
		private boolean gagne;
		private boolean perds;
		
		public Game() {
			this.currentNode = null;
			this.gagne = false;
			this.perds = false;
		}
		
		/**
		 * initialise une partie
		 * 
		 * @param initial le premier noeud de l'histoire
		 */
		public Game(Node initial) {
			this.currentNode = initial;
			this.gagne = false;
			this.perds = false;
		}
		
		/**
		 * gère le déroulement de la partie
		 */
		public void play() {
			while(!gagne && !perds) {
				//actualise le chemin parcouru
				ArrayList<Node> t = Main.perso.getChemin();
				t.add(currentNode);
				Main.perso.setChemin(t);
				
				//actualise les outils
				if(currentNode.equals(Main.planque1_1)) {
					ArrayList<Outils> o = Main.perso.getOutils();
					o.add(Outils.ARME_A_FEU);
					o.add(Outils.VEHICULE);
					Main.perso.setOutils(o);
					System.out.println("Avec ta planque tu as obtenu une arme et un véhicule");
				}
				
				if(currentNode.equals(Main.planque1_2)) {
					ArrayList<Outils> o = Main.perso.getOutils();
					o.add(Outils.ALLIE);
					o.add(Outils.VEHICULE);
					Main.perso.setOutils(o);
					System.out.println("Avec ta planque tu as obtenu un allié et un véhicule");
				}
				
				if(currentNode.equals(Main.planque1_3)) {
					ArrayList<Outils> o = Main.perso.getOutils();
					o.add(Outils.ARME_A_FEU);
					o.add(Outils.INFORMATION);
					Main.perso.setOutils(o);
					System.out.println("Avec ta planque tu as obtenu une arme et une information");
				}
				
				if(currentNode.equals(Main.planque2_2)) {
					ArrayList<Outils> o = Main.perso.getOutils();
					o.add(Outils.ARME_A_FEU);
					o.add(Outils.VEHICULE);
					Main.perso.setOutils(o);
					System.out.println("Avec ta planque tu as obtenu une arme et un véhicule");
				}
				
				if(currentNode.equals(Main.planque2_3)) {
					ArrayList<Outils> o = Main.perso.getOutils();
					o.add(Outils.ARME_A_FEU);
					o.add(Outils.INFORMATION);
					Main.perso.setOutils(o);
					System.out.println("Avec ta planque tu as obtenu une arme et une information");
				}
				
				if(currentNode.equals(Main.planque2_4)) {
					ArrayList<Outils> o = Main.perso.getOutils();
					o.add(Outils.ALLIE);
					o.add(Outils.INFORMATION);
					Main.perso.setOutils(o);
					System.out.println("Avec ta planque tu as obtenu un allié et une information");
				}
				
				//test si le joueur a le choix ou non du noeud suivant
				if(currentNode instanceof InnerNode) {
					InnerNode i = (InnerNode) currentNode;
					if(i.getNoeuds().size()!=1) {
						currentNode.display();
					}
				}
				
				//test si fin
				if(currentNode instanceof TerminalNode) {
					currentNode.display();
					FinDuJeu((TerminalNode) currentNode);
				}
				
				//suite du jeu
				currentNode = currentNode.chooseNext();
			}
		}
		
		/**
		 * Met fin à la partie
		 * 
		 * @param fin un TerminalNode signifiant la fin de la partie
		 */
		private void FinDuJeu(TerminalNode fin) {
			if (fin.getDescription().contains("Bravo")) {
				gagne = true;
				System.out.println("Merci d'avoir joué !");
			}
			else {
				perds = true;
				System.out.println("Réessaye !");
			}
		}
}
