package fr.diginamic.operations;

public class Operations {

	public Operations() {
		// Constructeur par defaut
	}

	public static double calcul(double a, double b, char op) {
		double resultat = a + b;
		if (op == '-') {
			resultat = a - b;
		} else if (op == '+') {
			resultat = a + b;
		} else if (op == '*') {
			resultat = a * b;
		} else if (op == '/') {
			resultat = a / b;
		} else {
			System.out.println("Mauvais operateur!");
		}
		return resultat;
	}

}