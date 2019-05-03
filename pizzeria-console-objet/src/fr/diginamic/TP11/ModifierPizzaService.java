package fr.diginamic.TP11;

import java.util.Scanner;

import Exceptions.ModifierPizzaException;

public class ModifierPizzaService extends MenuService {

	public void executeUC(Scanner scanner, IPizzaDao dao) throws ModifierPizzaException {
		System.out.println("Mise à jour d'une pizza");
		Menu.entete();
		for (Pizza piz : dao.findAllPizzas()) {
			System.out.println(piz);
		}
		System.out.println("Veuillez choisir le code de la pizza à modifier");
		String codePizza2 = scanner.nextLine();
		System.out.println("Veuillez saisir le nouveau code");
		String newCodePizza = scanner.nextLine();
		if (newCodePizza.length() > 4 || (newCodePizza.length() < 3)) {
			throw new ModifierPizzaException("Le nouveau code ne peut pas dépasser 3 ou 4 caractères");
		}
		System.out.println("Veuillez saisir le nouveau nom (sans espace)");
		String nomPizza2 = scanner.nextLine();
		System.out.println("Veuillez saisir le nouveau prix");
		String prixPizza2Str = scanner.nextLine();
		double prixPizza2 = Double.parseDouble(prixPizza2Str);

		Pizza pizzaModif = new Pizza(newCodePizza, nomPizza2, prixPizza2);
		dao.updatePizza(codePizza2, pizzaModif);

		for (Pizza piz : dao.findAllPizzas()) {
			System.out.println(piz);
		}
	}

}
