package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleService {

	public CercleService() {

	}

	public double doubler(Cercle monCercle) {
		Cercle circle = new Cercle(8);

		return (circle.rayon * 2);
	}

}
