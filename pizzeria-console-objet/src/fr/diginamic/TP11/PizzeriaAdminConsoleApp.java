package fr.diginamic.TP11;

import java.util.List;
import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		Menu monMenu = new Menu();
		Scanner sc = new Scanner(System.in);
		String choix = null;
		PizzaMemDao dao = new PizzaMemDao();
		List<Pizza> listePizza = dao.findAllPizzas();

		do {
			monMenu.afficher();
			choix = sc.nextLine();

			switch (choix) {

			case "1":
				System.out.println("Liste des pizzas\n");
				monMenu.entete();
				for (Pizza piz : listePizza) {
					System.out.println(piz);
				}
				break;
			case "2":
				System.out.println("Ajout d'une nouvelle pizza");
				System.out.println("\nVeuillez saisir le code :");
				String codePizza1 = sc.nextLine();
				System.out.println("Veuillez saisir le nom (sans espace) :");
				String nomPizza1 = sc.nextLine();
				System.out.println("Veuillez saisir le prix :");
				String prixPizza1Str = sc.nextLine();
				double prixPizza1 = Double.parseDouble(prixPizza1Str);
				Pizza newPiz = new Pizza(codePizza1, nomPizza1, prixPizza1);
				dao.saveNewPizza(newPiz);
				monMenu.entete();
				for (Pizza piz : listePizza) {
					System.out.println(piz);
				}
				break;
			case "3":
				System.out.println("Mise à jour d'une pizza");
				monMenu.entete();
				for (Pizza piz : listePizza) {
					System.out.println(piz);
				}
				System.out.println("Veuillez choisir le code de la pizza à modifier");
				String codePizza2 = sc.nextLine();
				System.out.println("Veuillez saisir le nouveau code");
				String newCodePizza = sc.nextLine();
				System.out.println("Veuillez saisir le nouveau nom (sans espace)");
				String nomPizza2 = sc.nextLine();
				System.out.println("Veuillez saisir le nouveau prix");
				String prixPizza2Str = sc.nextLine();
				double prixPizza2 = Double.parseDouble(prixPizza2Str);

				Pizza pizzaModif = new Pizza(newCodePizza, nomPizza2, prixPizza2);
				dao.updatePizza(codePizza2, pizzaModif);

				for (Pizza piz : listePizza) {
					System.out.println(piz);
				}
				break;
			case "4":
				System.out.println("Suppression d'une pizza");
				monMenu.entete();
				for (Pizza piz : listePizza) {
					System.out.println(piz);
				}

				System.out.println("Veuillez choisir le code de la pizza à supprimer :");
				String codePizzaSuppr = sc.nextLine();
				dao.deletePizza(codePizzaSuppr);

				System.out.println("Nouvelle liste");
				for (Pizza piz : listePizza) {
					System.out.println(piz);
				}

				break;
			case "99":
				System.out.println("Au revoir :(");
				continue;
			}
		} while (!choix.equals("99"));
		sc.close();
	}

}