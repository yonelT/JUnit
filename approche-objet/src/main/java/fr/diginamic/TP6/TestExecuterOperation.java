package fr.diginamic.TP6;

public class TestExecuterOperation {

	public static void main(String[] args) {
		Addition objAddition = new Addition();
		Multiplication objMultiplication = new Multiplication();
		int premier = 4;
		int deuxieme = 5;

		System.out.println("Voici le résultat de l'objet \"Addition\": " + objAddition.calcul(premier, deuxieme));
		System.out.println(
				"Voici le résultat de l'objet \"Multiplication\": " + objMultiplication.calcul(premier, deuxieme));

	}

}
