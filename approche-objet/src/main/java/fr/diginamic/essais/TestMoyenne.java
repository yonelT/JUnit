package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne note = new CalculMoyenne(-3);
		double result;

		note.ajout(17);
		note.ajout(15);
		note.ajout(16);

		result = note.calcul();
		System.out.println("Voici la moyenne: " + result);

	}

}
