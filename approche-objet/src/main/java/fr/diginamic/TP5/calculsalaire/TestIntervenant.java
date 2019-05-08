package fr.diginamic.TP5.calculsalaire;

public class TestIntervenant {

	public static void main(String[] args) {

		Salarie sal1 = new Salarie(750000);
		Pigiste sal2 = new Pigiste(14, 2000);

		System.out.println("\"Salarie\": " + sal1.getSalaire());
		System.out.println("\"Pigiste\": " + sal2.getSalaire());
		sal1.afficherDonnees();
		sal2.afficherDonnees();

	}

}
