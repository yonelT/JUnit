package fr.diginamic.TP11;

import java.util.List;

/**
 * Interface des méthodes d'une pizza
 * 
 * @author Diginam
 *
 */
public interface IPizzaDao {
	List<Pizza> findAllPizzas();

	void saveNewPizza(Pizza pizza);

	void updatePizza(String codePizza, Pizza pizza);

	void deletePizza(String codePizza);

	Pizza findPizzaByCode(String codePizza);

	boolean pizzaExists(String codePizza);
}
