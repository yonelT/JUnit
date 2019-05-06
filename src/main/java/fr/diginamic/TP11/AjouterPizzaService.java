package fr.diginamic.TP11;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Exceptions.AjouterPizzaException;

/**
 * Service d'ajout d'une pizza
 * 
 * @author Diginam
 *
 */
public class AjouterPizzaService extends MenuService {

	private static final Logger logAjout = LoggerFactory.getLogger(AjouterPizzaService.class);

	@Override
	public void executeUC(Scanner scanner, IPizzaDao dao) throws AjouterPizzaException {

		System.out.println("Ajout d'une nouvelle pizza");
		System.out.println("\nVeuillez saisir le code :");
		String codePizza1 = scanner.nextLine();

		if (codePizza1.length() > 4 || codePizza1.length() < 3) {
			throw new AjouterPizzaException("Vous devez saisir un code pizza sur 3 ou 4 caractères.");
		}

		System.out.println("Veuillez saisir le nom (sans espace) :");
		String nomPizza1 = scanner.nextLine();
		System.out.println("Veuillez saisir le prix :");
		String prixPizza1Str = scanner.nextLine();
		double prixPizza1 = Double.parseDouble(prixPizza1Str);

		Pizza newPiz = new Pizza(codePizza1, nomPizza1, prixPizza1);
		dao.saveNewPizza(newPiz);

		/**
		 * Logging pour les pizzas ajoutées
		 */
		logAjout.info("Vous avez ajouter la pizza: " + newPiz.getCode());

	}

}
