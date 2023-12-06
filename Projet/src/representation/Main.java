package representation;

import java.util.ArrayList;

public class Main {
	//configure la partie et lance le jeu (avec une instance de la classe Game)
		public static void main(String[] args) {
			//test seulement le package representation car le package univers est en chantier
			DecisionNode DN = new DecisionNode();
			ChanceNode CN1 = new ChanceNode();
			ChanceNode CN2 = new ChanceNode();
			TerminalNode TN1 = new TerminalNode();
			TerminalNode TN2 = new TerminalNode();
			TerminalNode TN3 = new TerminalNode();
			TerminalNode TN4 = new TerminalNode();
			
			DN.setDescription("Tu as deux chemins devant toi, lequel veux tu choisir ?");
			ArrayList<Node> dn = new ArrayList<Node>();
			dn.add(CN1);
			dn.add(CN2);
			DN.setNoeuds(dn);
			
			CN1.setDescription("Le prochain évènement sera choisi aléatoirement et tu as une chance d'avoir la bonne fin");
			ArrayList<Node> cn1 = new ArrayList<Node>();
			cn1.add(TN1);
			cn1.add(TN2);
			CN1.setNoeuds(cn1);
			
			CN2.setDescription("Le prochain évènement sera choisi aléatoirement et tu n'as aucune chance d'avoir la bonne fin");
			ArrayList<Node> cn2 = new ArrayList<Node>();
			cn2.add(TN3);
			cn2.add(TN4);
			CN2.setNoeuds(cn2);
			
			TN1.setDescription("Bravo, tu es tombé sur la bonne fin !");
			
			TN2.setDescription("Dommage, tu es tombé sur la mauvaise fin");
			
			TN3.setDescription("Dommage, tu es tombé sur la mauvaise fin");
			
			TN4.setDescription("Dommage, tu es tombé sur la mauvaise fin");
			
			DN.display();
			Node CN = DN.chooseNext();
			Node TN = CN.chooseNext();
			TN.display();
		}
}
