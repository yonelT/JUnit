package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {
		Set<String> pays = new HashSet<String>();

		pays.add("USA");
		pays.add("France");
		pays.add("Allemagne");
		pays.add("UK");
		pays.add("Italie");
		pays.add("Japon");
		pays.add("Chine");
		pays.add("Russie");
		pays.add("Inde");

		int max = pays.iterator().next().length();
		Iterator<String> iter = pays.iterator();
		String nomPays = null;

		while (iter.hasNext()) {
			String paysCourant = iter.next();
			int longueurNomPays = paysCourant.length();
			if (longueurNomPays > max) {
				nomPays = paysCourant;

			}
		}
		System.out.println("Pays qui à le plus grand nombre de lettre: " + nomPays);

	}

}
