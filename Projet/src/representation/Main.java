package representation;

import java.util.ArrayList;

public class Main {

		public static void main(String[] args) {
			//créer tous les nodes
			DecisionNode debut = new DecisionNode("Quel personnage voulez vous incarner ?",null);
			
			//ajouter tous les nodes dans la liste histoire
			ArrayList<Node> histoire = new ArrayList<Node>();
			histoire.add(debut);
			
			//lancer la partie depuis le premier node
			Game partie = new Game(debut);
			partie.play();
		}
}
