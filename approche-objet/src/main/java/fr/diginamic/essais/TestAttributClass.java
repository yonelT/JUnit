package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;

public class TestAttributClass {

	public static void main(String[] args) {
		AdressePostale a = new AdressePostale(5, "rue de marchaud", 4, "44100 nantes");
		AdressePostale b = new AdressePostale(2, "rue du quai", 7, "44880 sautron");

		System.out.println(a.nbDepartements);
		System.out.println(b.nbDepartements);

	}

}
