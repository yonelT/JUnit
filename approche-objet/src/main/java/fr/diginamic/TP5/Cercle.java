package fr.diginamic.TP5;

public class Cercle extends Forme {
	double rayon = 0;

	public Cercle(int ray) {
		System.out.println("Vous venez de créer un cercle de rayon " + ray);
		this.rayon = ray;
	}

	public double calculerSurface() {
		double surfaceCercle = 0;

		surfaceCercle = Math.PI * Math.pow(this.rayon, 2);
		return surfaceCercle;
	}

	public double calculerPerimetre() {
		double perimetreCercle = 0;

		perimetreCercle = (2 * Math.PI * rayon);
		return perimetreCercle;
	}

}
