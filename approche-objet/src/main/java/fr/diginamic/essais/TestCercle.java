package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;
import fr.diginamic.utils.CercleService;

public class TestCercle {

	public static void main(String[] args) {
		double resultat;
		Cercle monCercle = new Cercle(15);
		double resultat2;
		Cercle monCercle2 = new Cercle(14);
		Cercle monCercle3 = new Cercle(10);
		double rayonDouble = 0;

		resultat = monCercle.perimetre();
		System.out.println("Perimètre: " + resultat);
		System.out.println("Surface: " + monCercle.surface());

		resultat2 = monCercle2.perimetre();
		System.out.println("Perimètre cercle 2: " + resultat2);
		System.out.println("Surface cercle 2: " + monCercle2.surface());
		Cercle c = CercleFactory.creerCercle(15);
		System.out.println(c.surface());

		CercleService cs = new CercleService();
		rayonDouble = cs.doubler(monCercle3);
		System.out.println(rayonDouble);

	}
}
