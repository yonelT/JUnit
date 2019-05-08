package fr.diginamic.TP5;

public class Rectangle extends Forme {
	double longueur = 0;
	double largeur = 0;
	int i;

	public Rectangle(double lonng, double laarg) {
		this.longueur = lonng;
		this.largeur = laarg;
		System.out.println("Vous venez de créer un rectangle");
	}

	public double calculerSurface() {
		double surfaceRect = 0;

		surfaceRect = (this.longueur + this.largeur) * 2;
		return surfaceRect;
	}

	public double calculerPerimetre() {
		double perimetreRect = 0;

		perimetreRect = this.longueur * this.largeur;
		return perimetreRect;
	}

}
