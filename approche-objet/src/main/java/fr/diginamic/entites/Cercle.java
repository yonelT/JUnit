package fr.diginamic.entites;

public class Cercle {

	public double rayon;

	public Cercle(double pRayon) {
		this.rayon = pRayon;
	}

	public double perimetre() {
		return (2 * Math.PI * rayon);
	}

	public double surface() {
		return (Math.PI * Math.pow(rayon, 2));
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
