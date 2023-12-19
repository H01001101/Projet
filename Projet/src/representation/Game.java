package representation;

import java.util.ArrayList;

public class Game {
		
		private Node currentNode;
		private boolean gagne;
		private boolean perds;
		
		public Game() {
			this.currentNode = null;
			this.gagne = false;
			this.perds = false;
		}
		
		public Game(Node initial) {
			this.currentNode = initial;
			this.gagne = false;
			this.perds = false;
		}
		
		public void play() {
			while(!gagne && !perds) {
				//actualise le chemin parcouru
				ArrayList<Node> t = Main.perso.getChemin();
				t.add(currentNode);
				Main.perso.setChemin(t);
				
				//test si le joueur a le choix ou pas du noeuds suivant
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
