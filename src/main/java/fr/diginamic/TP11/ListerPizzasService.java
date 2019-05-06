package fr.diginamic.TP11;

import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Service de listage des pizzas
 * 
 * @author Diginam
 *
 */
public class ListerPizzasService extends MenuService {

	private static final Logger logListage = LoggerFactory.getLogger(ListerPizzasService.class);

	@Override
	public void executeUC(Scanner scanner, IPizzaDao dao) {

		System.out.println("Liste des pizzas\n");

		List<Pizza> listePizza = dao.findAllPizzas();

		Menu.entete();
		for (Pizza piz : listePizza) {
			System.out.println(piz);
		}

		/**
		 * Logging pour les pizzas modifiées
		 */
		logListage.info("Vous avez lister toutes les pizzas");

	}

}
