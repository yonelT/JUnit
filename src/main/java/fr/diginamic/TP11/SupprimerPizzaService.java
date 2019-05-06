package fr.diginamic.TP11;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SupprimerPizzaService extends MenuService {

	private static final Logger logSuppr = LoggerFactory.getLogger(SupprimerPizzaService.class);

	public void executeUC(Scanner scanner, IPizzaDao dao) throws DeletePizzaException {
		System.out.println("Suppression d'une pizza");
		Menu.entete();
		for (Pizza piz : dao.findAllPizzas()) {
			System.out.println(piz);
		}

		System.out.println("Veuillez choisir le code de la pizza à supprimer :");
		String codePizzaSuppr = scanner.nextLine();
		if (dao.pizzaExists(codePizzaSuppr) == false) {
			throw new DeletePizzaException("Ce code pizza n'existe pas!");
		}
		dao.deletePizza(codePizzaSuppr);

		/**
		 * Logging pour les pizzas supprimées
		 */
		logSuppr.info("Vous avez supprimer la pizza:" + codePizzaSuppr);

		System.out.println("Nouvelle liste");
		for (Pizza piz : dao.findAllPizzas()) {
			System.out.println(piz);
		}
	}

}
