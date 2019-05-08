package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		List<String> liste = new ArrayList<String>();

		liste.add("Nice");
		liste.add("Carcassonne");
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille");
		liste.add("Tarbes");

		Iterator<String> iter = liste.iterator();

		int max = liste.get(0).length();
		String nomVille = null;
		for (int i = 0; i < liste.size(); i++) {

			if (liste.get(i).length() > max) {
				nomVille = liste.get(i);
				max = liste.get(i).length();

			}

		}
		System.out.println("Le plus grand nombre de lettre: " + nomVille);

		for (int i = 0; i < liste.size(); i++) {
			liste.set(i, liste.get(i).toUpperCase());
		}

		for (int i = 0; i < liste.size(); i++) {

		}

		while (iter.hasNext()) {
			String valeurDansListe = iter.next();
			if (valeurDansListe.startsWith("N")) {
				iter.remove();
			}
		}

		System.out.println(liste);

	}

}
