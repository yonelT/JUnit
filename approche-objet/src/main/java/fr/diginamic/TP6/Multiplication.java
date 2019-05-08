package fr.diginamic.TP6;

public class Multiplication implements IOperation {

	public Multiplication() {

	}

	public int calcul(int a, int b) {
		int resultat = 0;

		resultat = a * b;
		return resultat;
	}

}
