package representation;

import java.util.Scanner;

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
				currentNode.display();
				currentNode = currentNode.chooseNext();
				if(currentNode instanceof TerminalNode) {
					FinDuJeu((TerminalNode) currentNode);
				}
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
