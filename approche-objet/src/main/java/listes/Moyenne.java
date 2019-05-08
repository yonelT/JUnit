package listes;

import java.util.ArrayList;
import java.util.List;

public class Moyenne {

	List<Double> liste = new ArrayList<Double>();

	public Moyenne() {

	}

	public void ajout(double aAjouter) {

		liste.add(new Double(aAjouter));

	}

	public double calcul() {
		int index = 0;
		double somme = 0;

		for (index = 0; index < liste.size(); index++) {
			somme = somme + liste.get(index);
		}

		return (somme / liste.size());
	}

}
