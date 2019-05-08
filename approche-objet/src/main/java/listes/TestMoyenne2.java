package listes;

public class TestMoyenne2 {

	public static void main(String[] args) {
		Moyenne moyenne = new Moyenne();
		moyenne.ajout(10);
		moyenne.ajout(10);
		moyenne.ajout(10);

		double result = moyenne.calcul();
		System.out.println(result);
	}

}
