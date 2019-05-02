package fr.diginamic.TP11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		List<Pizza> listePizza = new ArrayList<Pizza>();
		Menu monMenu = new Menu();
		Scanner sc = new Scanner(System.in);
		String choix = null;

		// Initialisation des Pizzas
		listePizza.add(new Pizza(0, "PEP", "Pépéroni", 12.50));
		listePizza.add(new Pizza(1, "MAR", "Margherita", 12.50));
		listePizza.add(new Pizza(2, "REIN", "La Reine", 11.50));
		listePizza.add(new Pizza(3, "FRO", "La 4 fromages", 12.00));
		listePizza.add(new Pizza(4, "CAN", "La cannibale", 12.50));
		listePizza.add(new Pizza(5, "SAV", "La savoyarde", 13.00));
		listePizza.add(new Pizza(6, "ORI", "L’orientale", 13.50));
		listePizza.add(new Pizza(7, "IND", "L’indienne", 14.00));

		do {
			monMenu.afficher();
			choix = sc.nextLine();

			switch (choix) {

			case "1":
				System.out.println("Liste des pizzas\n");
				System.out.println("CODE -> LIBELLE (PRIX)");
				System.out.println("-------------------------");

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
				listePizza.add(new Pizza(codePizza1, nomPizza1, prixPizza1));
				System.out.println("CODE -> LIBELLE (PRIX)");
				System.out.println("-------------------------");
				for (Pizza piz : listePizza) {
					System.out.println(piz);
				}
				break;
			case "3":
				System.out.println("Mise à jour d'une pizza");
				System.out.println("\nCODE -> LIBELLE (PRIX)");
				System.out.println("-------------------------");
				for (Pizza piz : listePizza) {
					System.out.println(piz);
				}
				System.out.println("Veuillez choisir le code de la pizza à modifier");
				String codePizza2 = sc.nextLine();

				for (int i = 0; i < listePizza.size(); i++) {
					if (codePizza2.equals(listePizza.get(i).getCode())) {
						System.out.println("Veuillez saisir le nouveau code");
						codePizza2 = sc.nextLine();
						System.out.println("Veuillez saisir le nouveau nom (sans espace)");
						String nomPizza2 = sc.nextLine();
						System.out.println("Veuillez saisir le nouveau prix");
						String prixPizza2Str = sc.nextLine();
						double prixPizza2 = Double.parseDouble(prixPizza2Str);

						listePizza.get(i).setCode(codePizza2);
						listePizza.get(i).setLibelle(nomPizza2);
						listePizza.get(i).setPrix(prixPizza2);

						for (Pizza piz : listePizza) {
							System.out.println(piz);
						}

					}
				}
				break;
			case "4":
				System.out.println("Suppression d'une pizza");
				System.out.println("CODE -> LIBELLE (PRIX)");
				System.out.println("-------------------------");

				for (Pizza piz : listePizza) {
					System.out.println(piz);
				}

				Iterator<Pizza> iter = listePizza.iterator();
				System.out.println("Veuillez choisir le code de la pizza à supprimer :");
				String pizzaSuppr = sc.nextLine();

				while (iter.hasNext()) {
					if (pizzaSuppr.equals(iter.next().getCode())) {
						iter.remove();
					}
				}
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