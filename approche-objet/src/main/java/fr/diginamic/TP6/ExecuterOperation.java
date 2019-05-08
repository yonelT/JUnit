package fr.diginamic.TP6;

public class ExecuterOperation {

	public ExecuterOperation() {

	}

	public int execute(IOperation linterface, int lePremier, int leDeuxieme) {
		int result = 0;

		result = linterface.calcul(lePremier, leDeuxieme);
		return result;
	}

}
