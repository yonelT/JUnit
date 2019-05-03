package fr.diginamic.TP11;

import java.util.Scanner;

public class AjouterPizzaService { // extends MenuService {

	public AjouterPizzaService() {
		// TODO Auto-generated constructor stub
	}

	public void executeUC(PizzaMemDao dao) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ajout d'une nouvelle pizza");
		System.out.println("\nVeuillez saisir le code :");
		String codePizza1 = sc.nextLine();
		System.out.println("Veuillez saisir le nom (sans espace) :");
		String nomPizza1 = sc.nextLine();
		System.out.println("Veuillez saisir le prix :");
		String prixPizza1Str = sc.nextLine();
		double prixPizza1 = Double.parseDouble(prixPizza1Str);

		Pizza newPiz = new Pizza(codePizza1, nomPizza1, prixPizza1);
		dao.saveNewPizza(newPiz);
		sc.close();

	}

}
