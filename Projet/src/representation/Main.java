package representation;

import java.util.ArrayList;

public class Main {

		public static void main(String[] args) {
			//créer tous les nodes
			DecisionNode debut = new DecisionNode("Quel personnage veux-tu incarner ?",null);
			
			DecisionNode espion = new DecisionNode("Espion",null);
			DecisionNode journaliste = new DecisionNode("Journaliste",null);
			DecisionNode enqueteur = new DecisionNode("Enquêteur",null);
			
			//Espion
			DecisionNode choixville1 = new DecisionNode("Tu as reçu un ordre de mission de ton organisation, tu vas devoir déjouer un attentat nucléaire qu'un groupe terroriste est en train de préparer, avec les informations que tu as tu as le choix entre trois villes pour commencer ta mission :",null);
			
			DecisionNode ville1_1 = new DecisionNode("Paris",null);
			DecisionNode ville1_2 = new DecisionNode("New York",null);
			DecisionNode ville1_3 = new DecisionNode("Hong Kong",null);
			
			DecisionNode choixplanque1_1 = new DecisionNode("Tu viens d'arriver à Paris, il faut maintenant que tu trouves une planque, où vas tu t'installer ?",null);
			DecisionNode choixplanque1_2 = new DecisionNode("Tu viens d'arriver à New York, il faut maintenant que tu trouves une planque, où vas tu t'installer ?",null);
			DecisionNode choixplanque1_3 = new DecisionNode("Tu viens d'arriver à Hong Kong, il faut maintenant que tu trouves une planque, où vas tu t'installer ?",null);
			
			DecisionNode planque1_1 = new DecisionNode("Dans un entrepôt",null);
			DecisionNode planque1_2 = new DecisionNode("Dans une suite luxueuse",null);
			DecisionNode planque1_3 = new DecisionNode("Dans un appartement",null);
			DecisionNode planque1_4 = new DecisionNode("Dans un lieu inconnu dont tu connais seulement l'adresse, envoyée par un informateur anonyme",null);
			
			TerminalNode fin1_1 = new TerminalNode("C'était un piège tendu par le groupe terroriste, on n'entendra plus jamais parler de toi");
			
			DecisionNode choixenquete1_1 = new DecisionNode("Maintenant que tu es installé dans ton entrepôt, comment veux tu commencer ta mission ?",null);
			DecisionNode choixenquete1_2 = new DecisionNode("Maintenant que tu es installé dans ta suite, comment veux tu commencer ta mission ?",null);
			DecisionNode choixenquete1_3 = new DecisionNode("Maintenant que tu es installé dans ton appartement, comment veux tu commencer ta mission ?",null);
			
			DecisionNode enquete1_1 = new DecisionNode("En infiltrant les milieux criminels locaux",null);
			DecisionNode enquete1_2 = new DecisionNode("En hackant des bases de données gouvernementales",null);
			DecisionNode enquete1_3 = new DecisionNode("En interrogeant des sources fiables",null);
			DecisionNode enquete1_4 = new DecisionNode("En suivant des membres suspects du groupe terroriste",null);
			
			TerminalNode fin1_2 = new TerminalNode("le matériel que tu as utilisé dans l'entrepôt n'était pas sécurisé, tu t'es fait arrêter");
			TerminalNode fin1_3 = new TerminalNode("La source que tu as voulu interroger est recherchée, quand tu l'as accueilli à l'hotel elle était suivie, vous etes tombés tous les deux");
			TerminalNode fin1_4 = new TerminalNode("Les membres que tu as suivi t'ont ensuite suivi jusqu'à ton appart sans que tu t'en rendes compte, tu es mort");
			
			DecisionNode choixconfrontation1_1 = new DecisionNode("Le groupe que tu infiltres commence à avoir des soupçons",null);
			DecisionNode choixconfrontation1_2 = new DecisionNode("Tu as fait une erreur en hackant une base de donnée, des inspecteurs sont à ta porte, que comptes tu faire ?",null);
			DecisionNode choixconfrontation1_3 = new DecisionNode("Ta source fiable était surveillée, tu es maintenant entouré d'agent d'une organisation inconnue, que comptes tu faire ?",null);
			DecisionNode choixconfrontation1_4 = new DecisionNode("Les terroristes que tu suivais s'en sont rendu compte, que comptes tu faire ?",null);
			
			DecisionNode confrontation1_1 = new DecisionNode("Combattre",null);
			DecisionNode confrontation1_2 = new DecisionNode("Fuir",null);
			DecisionNode confrontation1_3 = new DecisionNode("Négocier",null);
			
			ChanceNode combat1_1 = new ChanceNode("Tu choisis de les mettre hors d'état de nuire car ils ne t'inspirent pas confiance",null);
			ChanceNode combat1_2 = new ChanceNode("Tu décides de les combattre avec ta source",null);
			ChanceNode combat1_3 = new ChanceNode("Tu décides de les éliminer",null);
			
			TerminalNode fin1_5 = new TerminalNode("Tu t'es fait tuer pendant le combat");
			
			ChanceNode fuite1_1 = new ChanceNode("Tu décides de fuir car tu ne leur fais pas confiance, mais tu veux éviter les problèmes au maximum",null);
			ChanceNode fuite1_2 = new ChanceNode("Tu décides d'aider ta source à fuir",null);
			ChanceNode fuite1_3 = new ChanceNode("Tu décides de fuir",null);
			
			TerminalNode fin1_6 = new TerminalNode("Tu t'es fait attraper en fuyant");
			
			DecisionNode nego1_1 = new DecisionNode("Tu essayes de parler avec eux pour t'en sortir sans problèmes",null);
			DecisionNode nego1_2 = new DecisionNode("Tu essayes de parlementer pour t'en soritr avec ta source",null);
			DecisionNode nego1_3 = new DecisionNode("Tu essayes de négocier avec eux",null);
			ChanceNode arg1_1 = new ChanceNode("Tu essayes de leur faire croire que tu es de leur côté",null);
			ChanceNode arg1_2 = new ChanceNode("Tu essayes de les rallier à ta cause",null);
			ChanceNode arg1_3 = new ChanceNode("Tu fais l'ignorant",null);
			
			TerminalNode fin1_7 = new TerminalNode("Tu n'as pas réussi à négocier, tu t'es fait arrêter");
			
			DecisionNode choixville2 = new DecisionNode("Tu as réussi ton combat, quelle prochaine ville ?",null);
			DecisionNode choixville3 = new DecisionNode("Tu as réussi ta fuite, quelle prochaine ville ?",null);
			DecisionNode choixville4 = new DecisionNode("Tu as réussi ta négociation, quelle prochaine ville ?",null);
			
			DecisionNode ville2_1 = new DecisionNode("Paris",null);
			DecisionNode ville2_2 = new DecisionNode("New York",null);
			DecisionNode ville2_3 = new DecisionNode("Hong Kong",null);
			
			DecisionNode choixplanque2_1 = new DecisionNode("Tu viens d'arriver à Paris, dans quelle planque veux tu t'installer ?",null);
			DecisionNode choixplanque2_2 = new DecisionNode("Tu viens d'arriver à New York, dans quelle planque veux tu t'installer ?",null);
			DecisionNode choixplanque2_3 = new DecisionNode("Tu viens d'arriver à Hong Kong, dans quelle planque veux tu t'installer ?",null);
			
			DecisionNode planque2_1 = new DecisionNode("Une planque dans un quartier mal famé",null);
			DecisionNode planque2_2 = new DecisionNode("Un hotel discret près d'un port",null);
			DecisionNode planque2_3 = new DecisionNode("Un appartement dans une ruelle sombre dans le centre ville",null);
			DecisionNode planque2_4 = new DecisionNode("Un lieu mystétieux suggéré par un message cryptique",null);
			
			TerminalNode fin1_8 = new TerminalNode("Tu t'es fait tué lors d'une rixe en arrivant");
			
			DecisionNode choixenquete2_1 = new DecisionNode("Maintenant que tu es installé dans ton hotel, comment veux tu commencer ta mission ?",null);
			DecisionNode choixenquete2_2 = new DecisionNode("Maintenant que tu es installé dans ton appart, comment veux tu commencer ta mission ?",null);
			DecisionNode choixenquete2_3 = new DecisionNode("Maintenant que tu es installé dans ton lieu mystérieux, qui s'est avérer être ..., comment veux tu commencer ta mission ?",null);
			
			DecisionNode enquete2_1 = new DecisionNode("Infiltrer les milieux politiques locaux",null);
			DecisionNode enquete2_2 = new DecisionNode("Décrypter des communications codées du groupe terroriste",null);
			DecisionNode enquete2_3 = new DecisionNode("Corrompre un membre du groupe terroriste",null);
			DecisionNode enquete2_4 = new DecisionNode("Observer et suivre des hauts responsables gouvernementaux suspects",null);
			
			TerminalNode fin1_9 = new TerminalNode("");
			TerminalNode fin1_10 = new TerminalNode("");
			TerminalNode fin1_11 = new TerminalNode("");
			
			DecisionNode choixconfrontation2_1 = new DecisionNode("",null);
			DecisionNode choixconfrontation2_2 = new DecisionNode("",null);
			DecisionNode choixconfrontation2_3 = new DecisionNode("",null);
			DecisionNode choixconfrontation2_4 = new DecisionNode("",null);
			
			DecisionNode confrontation2_1 = new DecisionNode("Combattre",null);
			DecisionNode confrontation2_2 = new DecisionNode("Fuir",null);
			DecisionNode confrontation2_3 = new DecisionNode("Négocier",null);
			
			ChanceNode combat2_1 = new ChanceNode("",null);
			ChanceNode combat2_2 = new ChanceNode("",null);
			ChanceNode combat2_3 = new ChanceNode("",null);
			
			TerminalNode fin1_12 = new TerminalNode("Tu t'es fait tuer pendant le combat");
			
			ChanceNode fuite2_1 = new ChanceNode("",null);
			ChanceNode fuite2_2 = new ChanceNode("",null);
			ChanceNode fuite2_3 = new ChanceNode("",null);
			
			TerminalNode fin1_13 = new TerminalNode("Tu t'es fait attraper en fuyant");
			
			DecisionNode nego2_1 = new DecisionNode("",null);
			DecisionNode nego2_2 = new DecisionNode("",null);
			DecisionNode nego2_3 = new DecisionNode("",null);
			ChanceNode arg2_1 = new ChanceNode("",null);
			ChanceNode arg2_2 = new ChanceNode("",null);
			ChanceNode arg2_3 = new ChanceNode("",null);
			
			TerminalNode fin1_14 = new TerminalNode("Tu n'as pas réussi à négocier, tu t'es fait arrêter");
			
			DecisionNode choixville5 = new DecisionNode("Tu as réussi ton combat, tu sais maintenant où te rendre pour déjour l'attentat",null);
			DecisionNode choixville6 = new DecisionNode("Tu as réussi ta fuite, tu sais maintenant où te rendre pour déjour l'attentat",null);
			DecisionNode choixville7 = new DecisionNode("Tu as réussi ta négociation, tu sais maintenant où te rendre pour déjour l'attentat",null);
			
			DecisionNode choixconfrontation3_1 = new DecisionNode("En arrivant à Paris, tu te rends sur le lieux où aura lieu l'attentat grâce aux informations que tu as récolter, que comptes tu faire sur place ?",null);
			DecisionNode choixconfrontation3_2 = new DecisionNode("En arrivant à New York, tu te rends sur le lieux où aura lieu l'attentat grâce aux informations que tu as récolter, que comptes tu faire sur place ?",null);
			DecisionNode choixconfrontation3_3 = new DecisionNode("En arrivant à Hong Kong, tu te rends sur le lieux où aura lieu l'attentat grâce aux informations que tu as récolter, que comptes tu faire sur place ?",null);
			
			DecisionNode confrontation3_1 = new DecisionNode("Combattre",null);
			DecisionNode confrontation3_2 = new DecisionNode("Fuir",null);
			DecisionNode confrontation3_3 = new DecisionNode("Négocier",null);
			
			ChanceNode combat3_1 = new ChanceNode("Tu décides de combattre et d'empêcher l'attentat par la force",null);
			
			ChanceNode fuite3_1 = new ChanceNode("Tu décides de fuir, déjouer l'attentat te paraît impossible",null);
			
			DecisionNode nego3_1 = new DecisionNode("Tu choisis d'essayer de convaincre les instigateurs de renoncer à leurs plans",null);
			ChanceNode arg3_1 = new ChanceNode("Tu leur dis que tu as des informations qui les ferait tomber",null);
			ChanceNode arg3_2 = new ChanceNode("Tu bluff en leur disant que tu es de leur côté et que tu as un meilleur plan",null);
			ChanceNode arg3_3 = new ChanceNode("Tu veux leur faire prendre conscience de leurs actes pour qu'ils renoncent",null);
			
			TerminalNode reussitetotale = new TerminalNode("Bravo tu as réussi à déjouer l'attentat et à faire condamner tous les coupables, sauvant des millions de vies");
			
			TerminalNode reussitepartielle = new TerminalNode("Bravo, tu as réussi à déjouer l'attentat mais les instigateurs restent impunis, ils pourraient de nouveau comploter quelque chose");
			
			TerminalNode echec = new TerminalNode("C'est un échec, l'attentat a eu lieu et on te fait porter le chapeau, tu passeras donc la fin de tes jours en prison");
			
			
			//Journaliste
			
			//Enqueteur
			
			
			//Ajouter tous les nodes nextNode
			ArrayList<Node> nextdebut = new ArrayList<Node>();
			nextdebut.add(espion);
			nextdebut.add(journaliste);
			nextdebut.add(enqueteur);
			debut.setNoeuds(nextdebut);
			
			ArrayList<Node> nextespion = new ArrayList<Node>();
			nextespion.add(choixville1);
			espion.setNoeuds(nextespion);
			
			ArrayList<Node> nextjournaliste = new ArrayList<Node>();
			nextjournaliste.add(null);
			journaliste.setNoeuds(nextjournaliste);
			
			ArrayList<Node> nextenqueteur = new ArrayList<Node>();
			nextenqueteur.add(null);
			enqueteur.setNoeuds(nextenqueteur);
			
			ArrayList<Node> nextchoixville1 = new ArrayList<Node>();
			nextchoixville1.add(ville1_1);
			nextchoixville1.add(ville1_2);
			nextchoixville1.add(ville1_3);
			choixville1.setNoeuds(nextchoixville1);
			
			ArrayList<Node> nextville1_1 = new ArrayList<Node>();
			nextville1_1.add(choixplanque1_1);
			ville1_1.setNoeuds(nextville1_1);
			
			ArrayList<Node> nextville1_2 = new ArrayList<Node>();
			nextville1_2.add(choixplanque1_2);
			ville1_2.setNoeuds(nextville1_2);
			
			ArrayList<Node> nextville1_3 = new ArrayList<Node>();
			nextville1_3.add(choixplanque1_3);
			ville1_3.setNoeuds(nextville1_3);
			
			ArrayList<Node> nextchoixplanque1_1 = new ArrayList<Node>();
			nextchoixplanque1_1.add(planque1_1);
			nextchoixplanque1_1.add(planque1_2);
			nextchoixplanque1_1.add(planque1_3);
			nextchoixplanque1_1.add(planque1_4);
			choixplanque1_1.setNoeuds(nextchoixplanque1_1);
			
			ArrayList<Node> nextchoixplanque1_2 = new ArrayList<Node>();
			nextchoixplanque1_2.add(planque1_1);
			nextchoixplanque1_2.add(planque1_2);
			nextchoixplanque1_2.add(planque1_3);
			nextchoixplanque1_2.add(planque1_4);
			choixplanque1_2.setNoeuds(nextchoixplanque1_2);
			
			ArrayList<Node> nextchoixplanque1_3 = new ArrayList<Node>();
			nextchoixplanque1_3.add(planque1_1);
			nextchoixplanque1_3.add(planque1_2);
			nextchoixplanque1_3.add(planque1_3);
			nextchoixplanque1_3.add(planque1_4);
			choixplanque1_3.setNoeuds(nextchoixplanque1_3);
			
			ArrayList<Node> nextplanque1_1 = new ArrayList<Node>();
			nextplanque1_1.add(choixenquete1_1);
			nextplanque1_1.add(choixenquete1_2);
			nextplanque1_1.add(choixenquete1_3);
			planque1_1.setNoeuds(nextplanque1_1);
			
			ArrayList<Node> nextplanque1_2 = new ArrayList<Node>();
			nextplanque1_2.add(choixenquete1_1);
			nextplanque1_2.add(choixenquete1_2);
			nextplanque1_2.add(choixenquete1_3);
			planque1_2.setNoeuds(nextplanque1_2);
			
			ArrayList<Node> nextplanque1_3 = new ArrayList<Node>();
			nextplanque1_3.add(choixenquete1_1);
			nextplanque1_3.add(choixenquete1_2);
			nextplanque1_3.add(choixenquete1_3);
			planque1_3.setNoeuds(nextplanque1_3);
			
			ArrayList<Node> nextplanque1_4 = new ArrayList<Node>();
			nextplanque1_4.add(fin1_1);
			planque1_4.setNoeuds(nextplanque1_4);
			
			ArrayList<Node> nextchoixenquete1_1 = new ArrayList<Node>();
			nextchoixenquete1_1.add(enquete1_1);
			nextchoixenquete1_1.add(enquete1_2);
			nextchoixenquete1_1.add(enquete1_3);
			nextchoixenquete1_1.add(enquete1_4);
			choixenquete1_1.setNoeuds(nextchoixenquete1_1);
			
			ArrayList<Node> nextchoixenquete1_2 = new ArrayList<Node>();
			nextchoixenquete1_2.add(enquete1_1);
			nextchoixenquete1_2.add(enquete1_2);
			nextchoixenquete1_2.add(enquete1_3);
			nextchoixenquete1_2.add(enquete1_4);
			choixenquete1_2.setNoeuds(nextchoixenquete1_2);
			
			ArrayList<Node> nextchoixenquete1_3 = new ArrayList<Node>();
			nextchoixenquete1_3.add(enquete1_1);
			nextchoixenquete1_3.add(enquete1_2);
			nextchoixenquete1_3.add(enquete1_3);
			nextchoixenquete1_3.add(enquete1_4);
			choixenquete1_3.setNoeuds(nextchoixenquete1_3);
			
			ArrayList<Node> nextenquete1_1 = new ArrayList<Node>();
			nextenquete1_1.add(choixconfrontation1_1);
			enquete1_1.setNoeuds(nextenquete1_1);
			
			ArrayList<Node> nextenquete1_2 = new ArrayList<Node>();
			nextenquete1_2.add(choixconfrontation1_2);
			nextenquete1_2.add(fin1_2);
			enquete1_2.setNoeuds(nextenquete1_2);
			
			ArrayList<Node> nextenquete1_3 = new ArrayList<Node>();
			nextenquete1_3.add(choixconfrontation1_3);
			nextenquete1_3.add(fin1_3);
			enquete1_3.setNoeuds(nextenquete1_3);
			
			ArrayList<Node> nextenquete1_4 = new ArrayList<Node>();
			nextenquete1_4.add(choixconfrontation1_4);
			nextenquete1_4.add(fin1_4);
			enquete1_4.setNoeuds(nextenquete1_4);
			
			ArrayList<Node> nextchoixconfrontation1_1 = new ArrayList<Node>();
			nextchoixconfrontation1_1.add(confrontation1_1);
			nextchoixconfrontation1_1.add(confrontation1_2);
			nextchoixconfrontation1_1.add(confrontation1_3);
			choixconfrontation1_1.setNoeuds(nextchoixconfrontation1_1);
			
			ArrayList<Node> nextchoixconfrontation1_2 = new ArrayList<Node>();
			nextchoixconfrontation1_2.add(confrontation1_1);
			nextchoixconfrontation1_2.add(confrontation1_2);
			nextchoixconfrontation1_2.add(confrontation1_3);
			choixconfrontation1_2.setNoeuds(nextchoixconfrontation1_2);
			
			ArrayList<Node> nextchoixconfrontation1_3 = new ArrayList<Node>();
			nextchoixconfrontation1_3.add(confrontation1_1);
			nextchoixconfrontation1_3.add(confrontation1_2);
			nextchoixconfrontation1_3.add(confrontation1_3);
			choixconfrontation1_3.setNoeuds(nextchoixconfrontation1_3);
			
			ArrayList<Node> nextchoixconfrontation1_4 = new ArrayList<Node>();
			nextchoixconfrontation1_4.add(confrontation1_1);
			nextchoixconfrontation1_4.add(confrontation1_2);
			nextchoixconfrontation1_4.add(confrontation1_3);
			choixconfrontation1_4.setNoeuds(nextchoixconfrontation1_4);
			
			ArrayList<Node> nextconfrontation1_1 = new ArrayList<Node>();
			nextconfrontation1_1.add(combat1_1);
			nextconfrontation1_1.add(combat1_2);
			nextconfrontation1_1.add(combat1_3);
			confrontation1_1.setNoeuds(nextconfrontation1_1);
			
			ArrayList<Node> nextconfrontation1_2 = new ArrayList<Node>();
			nextconfrontation1_2.add(fuite1_1);
			nextconfrontation1_2.add(fuite1_2);
			nextconfrontation1_2.add(fuite1_3);
			confrontation1_2.setNoeuds(nextconfrontation1_2);
			
			ArrayList<Node> nextconfrontation1_3 = new ArrayList<Node>();
			nextconfrontation1_3.add(nego1_1);
			nextconfrontation1_3.add(nego1_2);
			nextconfrontation1_3.add(nego1_3);
			confrontation1_3.setNoeuds(nextconfrontation1_3);
			
			ArrayList<Node> nextcombat1_1 = new ArrayList<Node>();
			nextcombat1_1.add(fin1_5);
			nextcombat1_1.add(choixville2);
			combat1_1.setNoeuds(nextcombat1_1);
			
			ArrayList<Node> nextcombat1_2 = new ArrayList<Node>();
			nextcombat1_2.add(fin1_5);
			nextcombat1_2.add(choixville2);
			combat1_2.setNoeuds(nextcombat1_2);
			
			ArrayList<Node> nextcombat1_3 = new ArrayList<Node>();
			nextcombat1_3.add(fin1_5);
			nextcombat1_3.add(choixville2);
			combat1_3.setNoeuds(nextcombat1_3);
			
			ArrayList<Node> nextfuite1_1 = new ArrayList<Node>();
			nextfuite1_1.add(fin1_6);
			nextfuite1_1.add(choixville3);
			fuite1_1.setNoeuds(nextfuite1_1);
			
			ArrayList<Node> nextfuite1_2 = new ArrayList<Node>();
			nextfuite1_2.add(fin1_6);
			nextfuite1_2.add(choixville3);
			fuite1_2.setNoeuds(nextfuite1_2);
			
			ArrayList<Node> nextfuite1_3 = new ArrayList<Node>();
			nextfuite1_3.add(fin1_6);
			nextfuite1_3.add(choixville3);
			fuite1_3.setNoeuds(nextfuite1_3);
			
			ArrayList<Node> nextnego1_1 = new ArrayList<Node>();
			nextnego1_1.add(arg1_1);
			nextnego1_1.add(arg1_2);
			nextnego1_1.add(arg1_3);
			nego1_1.setNoeuds(nextnego1_1);
			
			ArrayList<Node> nextnego1_2 = new ArrayList<Node>();
			nextnego1_2.add(arg1_1);
			nextnego1_2.add(arg1_2);
			nextnego1_2.add(arg1_3);
			nego1_2.setNoeuds(nextnego1_2);
			
			ArrayList<Node> nextnego1_3 = new ArrayList<Node>();
			nextnego1_3.add(arg1_1);
			nextnego1_3.add(arg1_2);
			nextnego1_3.add(arg1_3);
			nego1_3.setNoeuds(nextnego1_3);
			
			ArrayList<Node> nextarg1_1 = new ArrayList<Node>();
			nextarg1_1.add(fin1_7);
			nextarg1_1.add(choixville4);
			arg1_1.setNoeuds(nextarg1_1);
			
			ArrayList<Node> nextarg1_2 = new ArrayList<Node>();
			nextarg1_2.add(fin1_7);
			nextarg1_2.add(choixville4);
			arg1_2.setNoeuds(nextarg1_2);
			
			ArrayList<Node> nextarg1_3 = new ArrayList<Node>();
			nextarg1_3.add(fin1_7);
			nextarg1_3.add(choixville4);
			arg1_3.setNoeuds(nextarg1_3);
			
			ArrayList<Node> nextchoixville2 = new ArrayList<Node>();
			nextchoixville2.add(ville2_1);
			nextchoixville2.add(ville2_2);
			nextchoixville2.add(ville2_3);
			choixville2.setNoeuds(nextchoixville2);
			
			ArrayList<Node> nextchoixville3 = new ArrayList<Node>();
			nextchoixville3.add(ville2_1);
			nextchoixville3.add(ville2_2);
			nextchoixville3.add(ville2_3);
			choixville3.setNoeuds(nextchoixville3);
			
			ArrayList<Node> nextchoixville4 = new ArrayList<Node>();
			nextchoixville4.add(ville2_1);
			nextchoixville4.add(ville2_2);
			nextchoixville4.add(ville2_3);
			choixville4.setNoeuds(nextchoixville4);
			
			ArrayList<Node> nextville2_1 = new ArrayList<Node>();
			nextville2_1.add(choixplanque2_1);
			ville2_1.setNoeuds(nextville2_1);
			
			ArrayList<Node> nextville2_2 = new ArrayList<Node>();
			nextville2_2.add(choixplanque2_2);
			ville2_2.setNoeuds(nextville2_2);
			
			ArrayList<Node> nextville2_3 = new ArrayList<Node>();
			nextville2_3.add(choixplanque2_3);
			ville2_3.setNoeuds(nextville2_3);
			
			ArrayList<Node> nextchoixplanque2_1 = new ArrayList<Node>();
			nextchoixplanque2_1.add(planque2_1);
			nextchoixplanque2_1.add(planque2_2);
			nextchoixplanque2_1.add(planque2_3);
			nextchoixplanque2_1.add(planque2_4);
			choixplanque2_1.setNoeuds(nextchoixplanque2_1);
			
			ArrayList<Node> nextchoixplanque2_2 = new ArrayList<Node>();
			nextchoixplanque2_2.add(planque2_1);
			nextchoixplanque2_2.add(planque2_2);
			nextchoixplanque2_2.add(planque2_3);
			nextchoixplanque2_2.add(planque2_4);
			choixplanque2_2.setNoeuds(nextchoixplanque2_2);
			
			ArrayList<Node> nextchoixplanque2_3 = new ArrayList<Node>();
			nextchoixplanque2_3.add(planque2_1);
			nextchoixplanque2_3.add(planque2_2);
			nextchoixplanque2_3.add(planque2_3);
			nextchoixplanque2_3.add(planque2_4);
			choixplanque2_3.setNoeuds(nextchoixplanque2_3);
			
			ArrayList<Node> nextplanque2_1 = new ArrayList<Node>();
			nextplanque2_1.add(fin1_8);
			planque2_1.setNoeuds(nextplanque2_1);
			
			ArrayList<Node> nextplanque2_2 = new ArrayList<Node>();
			nextplanque2_2.add(choixenquete2_1);
			planque2_2.setNoeuds(nextplanque2_2);
			
			ArrayList<Node> nextplanque2_3 = new ArrayList<Node>();
			nextplanque2_3.add(choixenquete2_2);
			planque2_3.setNoeuds(nextplanque2_3);
			
			ArrayList<Node> nextplanque2_4 = new ArrayList<Node>();
			nextplanque2_4.add(choixenquete2_3);
			planque2_4.setNoeuds(nextplanque2_4);
			
			ArrayList<Node> nextchoixenquete2_1 = new ArrayList<Node>();
			nextchoixenquete2_1.add(enquete2_1);
			nextchoixenquete2_1.add(enquete2_2);
			nextchoixenquete2_1.add(enquete2_3);
			nextchoixenquete2_1.add(enquete2_4);
			choixenquete2_1.setNoeuds(nextchoixenquete2_1);
			
			ArrayList<Node> nextchoixenquete2_2 = new ArrayList<Node>();
			nextchoixenquete2_2.add(enquete2_1);
			nextchoixenquete2_2.add(enquete2_2);
			nextchoixenquete2_2.add(enquete2_3);
			nextchoixenquete2_2.add(enquete2_4);
			choixenquete2_2.setNoeuds(nextchoixenquete2_2);
			
			ArrayList<Node> nextchoixenquete2_3 = new ArrayList<Node>();
			nextchoixenquete2_3.add(enquete2_1);
			nextchoixenquete2_3.add(enquete2_2);
			nextchoixenquete2_3.add(enquete2_3);
			nextchoixenquete2_3.add(enquete2_4);
			choixenquete2_3.setNoeuds(nextchoixenquete2_3);
			
			ArrayList<Node> nextenquete2_1 = new ArrayList<Node>();
			nextenquete2_1.add(choixconfrontation2_1);
			enquete2_1.setNoeuds(nextenquete2_1);
			
			ArrayList<Node> nextenquete2_2 = new ArrayList<Node>();
			nextenquete2_2.add(choixconfrontation2_2);
			enquete2_2.setNoeuds(nextenquete2_2);
			
			ArrayList<Node> nextenquete2_3 = new ArrayList<Node>();
			nextenquete2_3.add(choixconfrontation2_3);
			enquete2_3.setNoeuds(nextenquete2_3);
			
			ArrayList<Node> nextenquete2_4 = new ArrayList<Node>();
			nextenquete2_4.add(choixconfrontation2_4);
			enquete2_4.setNoeuds(nextenquete2_4);
			
			ArrayList<Node> nextchoixconfrontation2_1 = new ArrayList<Node>();
			nextchoixconfrontation2_1.add(confrontation2_1);
			nextchoixconfrontation2_1.add(confrontation2_2);
			nextchoixconfrontation2_1.add(confrontation2_3);
			choixconfrontation2_1.setNoeuds(nextchoixconfrontation2_1);
			
			ArrayList<Node> nextchoixconfrontation2_2 = new ArrayList<Node>();
			nextchoixconfrontation2_2.add(confrontation2_1);
			nextchoixconfrontation2_2.add(confrontation2_2);
			nextchoixconfrontation2_2.add(confrontation2_3);
			choixconfrontation2_2.setNoeuds(nextchoixconfrontation2_2);
			
			ArrayList<Node> nextchoixconfrontation2_3 = new ArrayList<Node>();
			nextchoixconfrontation2_3.add(confrontation2_1);
			nextchoixconfrontation2_3.add(confrontation2_2);
			nextchoixconfrontation2_3.add(confrontation2_3);
			choixconfrontation2_3.setNoeuds(nextchoixconfrontation2_3);
			
			ArrayList<Node> nextchoixconfrontation2_4 = new ArrayList<Node>();
			nextchoixconfrontation2_4.add(confrontation2_1);
			nextchoixconfrontation2_4.add(confrontation2_2);
			nextchoixconfrontation2_4.add(confrontation2_3);
			choixconfrontation2_4.setNoeuds(nextchoixconfrontation2_4);
			
			ArrayList<Node> nextconfrontation2_1 = new ArrayList<Node>();
			nextconfrontation2_1.add(combat2_1);
			nextconfrontation2_1.add(combat2_2);
			nextconfrontation2_1.add(combat2_3);
			confrontation2_1.setNoeuds(nextconfrontation2_1);
			
			ArrayList<Node> nextconfrontation2_2 = new ArrayList<Node>();
			nextconfrontation2_2.add(fuite2_1);
			nextconfrontation2_2.add(fuite2_2);
			nextconfrontation2_2.add(fuite2_3);
			confrontation2_2.setNoeuds(nextconfrontation2_2);
			
			ArrayList<Node> nextconfrontation2_3 = new ArrayList<Node>();
			nextconfrontation2_3.add(nego2_1);
			nextconfrontation2_3.add(nego2_2);
			nextconfrontation2_3.add(nego2_3);
			confrontation2_3.setNoeuds(nextconfrontation2_3);
			
			ArrayList<Node> nextcombat2_1 = new ArrayList<Node>();
			nextcombat2_1.add(fin1_12);
			nextcombat2_1.add(choixville5);
			combat2_1.setNoeuds(nextcombat2_1);
			
			ArrayList<Node> nextcombat2_2 = new ArrayList<Node>();
			nextcombat2_2.add(fin1_12);
			nextcombat2_2.add(choixville5);
			combat2_2.setNoeuds(nextcombat2_2);
			
			ArrayList<Node> nextcombat2_3 = new ArrayList<Node>();
			nextcombat2_3.add(fin1_12);
			nextcombat2_3.add(choixville5);
			combat2_3.setNoeuds(nextcombat2_3);
			
			ArrayList<Node> nextfuite2_1 = new ArrayList<Node>();
			nextfuite2_1.add(fin1_13);
			nextfuite2_1.add(choixville6);
			fuite2_1.setNoeuds(nextfuite2_1);
			
			ArrayList<Node> nextfuite2_2 = new ArrayList<Node>();
			nextfuite2_2.add(fin1_13);
			nextfuite2_2.add(choixville6);
			fuite2_2.setNoeuds(nextfuite2_2);
			
			ArrayList<Node> nextfuite2_3 = new ArrayList<Node>();
			nextfuite2_3.add(fin1_13);
			nextfuite2_3.add(choixville6);
			fuite2_3.setNoeuds(nextfuite2_3);
			
			ArrayList<Node> nextnego2_1 = new ArrayList<Node>();
			nextnego2_1.add(arg2_1);
			nextnego2_1.add(arg2_2);
			nextnego2_1.add(arg2_3);
			nego2_1.setNoeuds(nextnego2_1);
			
			ArrayList<Node> nextnego2_2 = new ArrayList<Node>();
			nextnego2_2.add(arg2_1);
			nextnego2_2.add(arg2_2);
			nextnego2_2.add(arg2_3);
			nego2_2.setNoeuds(nextnego2_2);
			
			ArrayList<Node> nextnego2_3 = new ArrayList<Node>();
			nextnego2_3.add(arg2_1);
			nextnego2_3.add(arg2_2);
			nextnego2_3.add(arg2_3);
			nego2_3.setNoeuds(nextnego2_3);
			
			ArrayList<Node> nextarg2_1 = new ArrayList<Node>();
			nextarg2_1.add(fin1_14);
			nextarg2_1.add(choixville7);
			arg2_1.setNoeuds(nextarg2_1);
			
			ArrayList<Node> nextarg2_2 = new ArrayList<Node>();
			nextarg2_2.add(fin1_14);
			nextarg2_2.add(choixville7);
			arg2_2.setNoeuds(nextarg2_2);
			
			ArrayList<Node> nextarg2_3 = new ArrayList<Node>();
			nextarg2_3.add(fin1_14);
			nextarg2_3.add(choixville7);
			arg2_3.setNoeuds(nextarg2_3);
			
			ArrayList<Node> nextchoixville5 = new ArrayList<Node>();
			nextchoixville5.add(choixconfrontation3_1);
			nextchoixville5.add(choixconfrontation3_2);
			nextchoixville5.add(choixconfrontation3_3);
			choixville5.setNoeuds(nextchoixville5);
			
			ArrayList<Node> nextchoixville6 = new ArrayList<Node>();
			nextchoixville6.add(choixconfrontation3_1);
			nextchoixville6.add(choixconfrontation3_2);
			nextchoixville6.add(choixconfrontation3_3);
			choixville6.setNoeuds(nextchoixville6);
			
			ArrayList<Node> nextchoixville7 = new ArrayList<Node>();
			nextchoixville7.add(choixconfrontation3_1);
			nextchoixville7.add(choixconfrontation3_2);
			nextchoixville7.add(choixconfrontation3_3);
			choixville7.setNoeuds(nextchoixville7);
			
			ArrayList<Node> nextchoixconfrontation3_1 = new ArrayList<Node>();
			nextchoixconfrontation3_1.add(confrontation3_1);
			nextchoixconfrontation3_1.add(confrontation3_2);
			nextchoixconfrontation3_1.add(confrontation3_3);
			choixconfrontation3_1.setNoeuds(nextchoixconfrontation3_1);
			
			ArrayList<Node> nextchoixconfrontation3_2 = new ArrayList<Node>();
			nextchoixconfrontation3_2.add(confrontation3_1);
			nextchoixconfrontation3_2.add(confrontation3_2);
			nextchoixconfrontation3_2.add(confrontation3_3);
			choixconfrontation3_2.setNoeuds(nextchoixconfrontation3_2);
			
			ArrayList<Node> nextchoixconfrontation3_3 = new ArrayList<Node>();
			nextchoixconfrontation3_3.add(confrontation3_1);
			nextchoixconfrontation3_3.add(confrontation3_2);
			nextchoixconfrontation3_3.add(confrontation3_3);
			choixconfrontation3_3.setNoeuds(nextchoixconfrontation3_3);
			
			ArrayList<Node> nextconfrontation3_1 = new ArrayList<Node>();
			nextconfrontation3_1.add(combat3_1);
			confrontation3_1.setNoeuds(nextconfrontation3_1);
			
			ArrayList<Node> nextconfrontation3_2 = new ArrayList<Node>();
			nextconfrontation3_2.add(fuite3_1);
			confrontation3_2.setNoeuds(nextconfrontation3_2);
			
			ArrayList<Node> nextconfrontation3_3 = new ArrayList<Node>();
			nextconfrontation3_3.add(nego3_1);
			confrontation3_3.setNoeuds(nextconfrontation3_3);
			
			ArrayList<Node> nextcombat3_1 = new ArrayList<Node>();
			nextcombat3_1.add(echec);
			nextcombat3_1.add(reussitetotale);
			combat3_1.setNoeuds(nextcombat3_1);
			
			ArrayList<Node> nextfuite3_1 = new ArrayList<Node>();
			nextfuite3_1.add(echec);
			fuite3_1.setNoeuds(nextfuite3_1);
			
			ArrayList<Node> nextnego3_1 = new ArrayList<Node>();
			nextnego3_1.add(arg3_1);
			nextnego3_1.add(arg3_2);
			nextnego3_1.add(arg3_3);
			nego3_1.setNoeuds(nextnego3_1);
			
			ArrayList<Node> nextarg3_1 = new ArrayList<Node>();
			nextarg3_1.add(echec);
			nextarg3_1.add(reussitetotale);
			arg3_1.setNoeuds(nextarg3_1);
			
			ArrayList<Node> nextarg3_2 = new ArrayList<Node>();
			nextarg3_2.add(echec);
			nextarg3_2.add(reussitepartielle);
			arg3_2.setNoeuds(nextarg3_2);
			
			ArrayList<Node> nextarg3_3 = new ArrayList<Node>();
			nextarg3_3.add(echec);
			arg3_3.setNoeuds(nextarg3_3);
			
			
			//lancer la partie depuis le premier node
			Game partie = new Game(debut);
			partie.play();
		}
}
