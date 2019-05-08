package fr.diginamic.TP5;

public class TestForme {

	public static void main(String[] args) {
		Cercle cer = new Cercle(10);
		Rectangle rect = new Rectangle(4, 5);
		Carre car = new Carre(5);
		AffichageForme aff = new AffichageForme();

		aff.afficher(cer);
		aff.afficher(rect);
		aff.afficher(car);

	}

}
