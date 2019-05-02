package fr.diginamic.TP11;

public class Menu {

	public Menu() {

	}

	/**
	 * Méthode pour afficher le menu
	 * 
	 */
	public void afficher() {
		System.out.println("\n***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir");
		System.out.println("\nFaite un choix");
	}

	public void entete() {
		System.out.println("CODE -> LIBELLE (PRIX)");
		System.out.println("-------------------------");
	}

}
