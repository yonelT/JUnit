package fr.diginamic.TP11;

import java.util.List;

public class ListerPizzasService { // extends MenuService {

	public ListerPizzasService() {
		// TODO Auto-generated constructor stub
	}

	public static void executeUC(PizzaMemDao dao) {

		System.out.println("Liste des pizzas\n");

		List<Pizza> listePizza = dao.findAllPizzas();

		Menu.entete();
		for (Pizza piz : listePizza) {
			System.out.println(piz);
		}

	}

}
