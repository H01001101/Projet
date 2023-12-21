package representation;

import java.io.*;

/**
 * Cette classe permet de sauvegarder à un moment dans la partie et de charger ensuite cette sauvegarde
 */
public class Sauvegarde implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/**
	 * Cette méthode permet de sauvegarder une partie
	 * 
	 * @param fichier Nom du fichier de la sauvegarde
	 * @param nodeActuel Avancement de la partie sauvegardée
	 */
	public static void sauvegarderPartie(String fichier, Node nodeActuel) {
        try (ObjectOutputStream outS = new ObjectOutputStream(new FileOutputStream(new File (fichier)))) {
            outS.writeObject(nodeActuel);
            outS.close();
            System.out.println("Sauvegarde réussie !");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Erreur lors de la sauvegarde.");
        }
    }
 
	/**
	 * Cette méthode permet de charger une partie sauvegardée
	 * 
	 * @param fichier Nom du fichier de la sauvegarde
	 * @return le noeud auquel le joueur s'était arrêté
	 */
    public static Node chargerPartie(String fichier) {
        try (ObjectInputStream inS = new ObjectInputStream(new FileInputStream(new File (fichier)))) {
            Node node = (Node) inS.readObject();
            inS.close();
            System.out.println("Chargement réussi !");
            return node;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("Erreur lors du chargement.");
            return null;
        }
    }

}
