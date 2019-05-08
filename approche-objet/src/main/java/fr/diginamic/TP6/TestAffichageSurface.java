package fr.diginamic.TP6;

import fr.diginamic.TP5.immobilier.Maison;

public class TestAffichageSurface {

	public static void main(String[] args) {
		Maison maison = new Maison(4);

		System.out.println("La surface de la maison: " + maison.calculerSurface());

	}

}
