package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(new Integer(-1));
		list.add(new Integer(5));
		list.add(new Integer(7));
		list.add(new Integer(3));
		list.add(new Integer(-2));
		list.add(new Integer(4));
		list.add(new Integer(8));
		list.add(new Integer(5));

		Iterator<Integer> iter = list.iterator();

		while (iter.hasNext()) {
			Integer valeur = iter.next();
			System.out.println(valeur);
		}

		iter = list.iterator();
		int max = list.get(0);
		while (iter.hasNext()) {
			Integer valeur = iter.next();

			if (valeur >= max) {
				max = valeur;
			}
		}
		System.out.println("\nLa valeur maximal de l'ArrayList: " + max);

		iter = list.iterator();

		int min = list.get(0);
		while (iter.hasNext()) {

			Integer valeur = iter.next();

			if (valeur < min) {
				iter.remove();
			}

		}
		iter = list.iterator();

		while (iter.hasNext()) {
			Integer valeur = iter.next();
			if (valeur < 0) {
				valeur = -valeur;
			}
		}

		iter = list.iterator();
		while (iter.hasNext()) {
			Integer valeur = iter.next();
			System.out.println(valeur);
		}

	}

}
