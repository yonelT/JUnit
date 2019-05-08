package fr.diginamic.TP5;

public class AffichageForme {

	public AffichageForme() {

	}

	public void afficher(Forme form) {
		System.out.println("Périmètre de la forme: " + form.calculerPerimetre());
		System.out.println("Surface de la forme: " + form.calculerSurface() + "\n");
	}

}
