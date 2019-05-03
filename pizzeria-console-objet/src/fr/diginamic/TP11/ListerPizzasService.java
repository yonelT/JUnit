package fr.diginamic.TP11;

import java.util.List;
import java.util.Scanner;

/**
 * Service de listage des pizzas
 * 
 * @author Diginam
 *
 */
public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, IPizzaDao dao) {

		System.out.println("Liste des pizzas\n");

		List<Pizza> listePizza = dao.findAllPizzas();

		Menu.entete();
		for (Pizza piz : listePizza) {
			System.out.println(piz);
		}

	}

}
