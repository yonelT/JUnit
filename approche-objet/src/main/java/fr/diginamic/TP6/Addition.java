package fr.diginamic.TP6;

public class Addition implements IOperation {

	public Addition() {

	}

	public int calcul(int a, int b) {
		int resultat = 0;

		resultat = a + b;
		return resultat;
	}

}
