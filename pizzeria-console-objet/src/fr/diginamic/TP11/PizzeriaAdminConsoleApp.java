
package fr.diginamic.TP11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		Menu monMenu = new Menu();
		Scanner sc = new Scanner(System.in);
		int choix = 0;
		Pizza maPizza = new Pizza(1,"MARG","Margharita",11.99); //arraylist de pizza?
		Pizza maPizza2 = new Pizza(2,"VEG","Vegetarienne",13.99);
		List<Pizza> liste = new ArrayList<Pizza>();
		
		monMenu.afficher();
		choix = sc.nextInt();
		//A modif : boucle while à rajouter
		switch (choix) {
		
		case 1:
			System.out.println("Liste des pizzas");
			liste.add(maPizza); //a modif
			liste.add(maPizza2); //a modif
			for (Pizza piz : liste) {
				System.out.println(piz);
			}
			break;
		case 2:
			System.out.println("Ajout d’une nouvelle pizza");
			liste.add(maPizza);
			liste.add(maPizza2);
			//maPizza.ajouter(new Pizza(1,"MARG","Margharita",11.99)); a modif
			break;
		case 3:
			System.out.println("Mise à jour d'une pizza");
			break;
		case 4:
			System.out.println("Suppression d'une pizza");
			break;
		case 99:
			System.out.println("Au revoir :(");
			break;
		
		default:
			System.out.println("Choix inexistant!");
			break;
		}
		monMenu.afficher();
		
		sc.close();
	}

}
