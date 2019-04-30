
package fr.diginamic.TP11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		List<Pizza> listePizza = new ArrayList<Pizza>();
		Menu monMenu = new Menu();
		Scanner sc = new Scanner(System.in);
		String choix = null;

		listePizza.add(new Pizza(0, "PEP", "Pépéroni", 12.50));
		listePizza.add(new Pizza(1, "MAR", "Margherita", 12.50));
		listePizza.add(new Pizza(2, "REIN", "La Reine", 11.50));
		listePizza.add(new Pizza(3, "FRO", "La 4 fromages", 12.00));
		listePizza.add(new Pizza(4, "CAN", "La cannibale", 12.50));
		listePizza.add(new Pizza(5, "SAV", "La savoyarde", 13.00));
		listePizza.add(new Pizza(6, "ORI", "L’orientale", 13.50));
		listePizza.add(new Pizza(7, "IND", "L’indienne", 14.00));

		monMenu.afficher();
		choix = sc.nextLine();

		while (!choix.equals("1") && !choix.equals("2") && !choix.equals("3") && !choix.equals("4")
				&& !choix.equals("99")) {
			System.out.println("Choix inexistant!\nFaite un choix valide");
			choix = sc.nextLine();
		}

		switch (choix) {

		case "1":
			System.out.println("Liste des pizzas");

			for (Pizza piz : listePizza) {
				System.out.println(piz);
			}

			// Iterator<Pizza> iter = new Iterator<Pizza>();
			break;
		case "2":
			System.out.println("Ajout d'une nouvelle pizza");
			// listePizza.add(new Pizza(0, "PEP", "Pépéroni", 12.50));
			// listePizza.add(new Pizza(1, "MAR", "Margherita", 12.50));

			break;
		case "3":
			System.out.println("Mise à jour d'une pizza");
			break;
		case "4":
			System.out.println("Suppression d'une pizza");
			break;
		case "99":
			System.out.println("Au revoir :(");
			break;

		default:
			System.out.println("Choix inexistant!");
			break;
		}
		monMenu.afficher();

		sc.close();
	}

}
