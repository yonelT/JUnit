package fr.diginamic.TP11;

import java.util.Scanner;

import Exceptions.AjouterPizzaException;
import Exceptions.ModifierPizzaException;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PizzaMemDao dao = new PizzaMemDao();

		String choix = null;

		do {
			Menu.afficher();
			choix = sc.nextLine();

			switch (choix) {

			case "1":
				ListerPizzasService service1 = new ListerPizzasService();
				service1.executeUC(sc, dao);
				break;
			case "2":
				AjouterPizzaService service2 = new AjouterPizzaService();
				try {
					service2.executeUC(sc, dao);
				} catch (AjouterPizzaException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "3":
				ModifierPizzaService service3 = new ModifierPizzaService();
				try {
					service3.executeUC(sc, dao);
				} catch (ModifierPizzaException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "4":
				SupprimerPizzaService service4 = new SupprimerPizzaService();
				try {
					service4.executeUC(sc, dao);
				} catch (DeletePizzaException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "99":
				System.out.println("Au revoir :(");
				continue;
			}
		} while (!choix.equals("99"));
		sc.close();
	}

}