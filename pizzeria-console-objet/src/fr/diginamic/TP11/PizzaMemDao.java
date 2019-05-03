package fr.diginamic.TP11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PizzaMemDao implements IPizzaDao {

	private List<Pizza> listePizza;

	public PizzaMemDao() {
		listePizza = new ArrayList<>();

		// Initialisation des Pizzas
		listePizza.add(new Pizza(0, "PEP", "Pépéroni", 12.50));
		listePizza.add(new Pizza(1, "MAR", "Margherita", 12.50));
		listePizza.add(new Pizza(2, "REIN", "La Reine", 11.50));
		listePizza.add(new Pizza(3, "FRO", "La 4 fromages", 12.00));
		listePizza.add(new Pizza(4, "CAN", "La cannibale", 12.50));
		listePizza.add(new Pizza(5, "SAV", "La savoyarde", 13.00));
		listePizza.add(new Pizza(6, "ORI", "L’orientale", 13.50));
		listePizza.add(new Pizza(7, "IND", "L’indienne", 14.00));
	}

	public List<Pizza> findAllPizzas() {
		return listePizza;
	}

	public void saveNewPizza(Pizza pizza) {
		listePizza.add(pizza);

	}

	public void updatePizza(String codePizza, Pizza pizza) {

		Pizza pizzaAModif = findPizzaByCode(codePizza);
		if (pizzaAModif == null) {
			System.out.println("\nPizza introuvable !\n");
		} else {
			pizzaAModif.setCode(pizza.getCode());
			pizzaAModif.setLibelle(pizza.getLibelle());
			pizzaAModif.setPrix(pizza.getPrix());
		}
	}

	public void deletePizza(String codePizza) {
		Iterator<Pizza> iter = listePizza.iterator();
		Pizza pizzaADelete = findPizzaByCode(codePizza);

		if (pizzaADelete == null) {
			System.out.println("\nPizza introuvable !\n");

		}
		while (iter.hasNext()) {
			if (codePizza.equals(iter.next().getCode())) {
				iter.remove();
			}
		}

	}

	public Pizza findPizzaByCode(String codePizza) {
		for (int i = 0; i < listePizza.size(); i++) {
			if (codePizza.equals(listePizza.get(i).getCode())) {

				return listePizza.get(i);
			}
		}
		return null;

	}

	public boolean pizzaExists(String codePizza) {
		for (Pizza laPizza : listePizza) {
			if (codePizza.equals(laPizza.getCode())) {
				return true;
			}
		}
		return false;
	}

}