package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {

	public static Cercle creerCercle(double pRayon) {

		Cercle cer = new Cercle(pRayon);
		return cer;
	}

}
