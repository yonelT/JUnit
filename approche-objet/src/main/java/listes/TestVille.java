package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestVille {

	public static void main(String[] args) {
		List<Ville> liste = new ArrayList<Ville>();

		// liste.addAll(Arrays.asList(new Ville ("Nice",56895));
		// liste.add(Arrays.asList(ville1);
		liste.add(new Ville("Nice", 343000));
		liste.add(new Ville("Carcassonne", 47800));
		liste.add(new Ville("Narbonne", 53400));
		liste.add(new Ville("Lyon", 484000));
		liste.add(new Ville("Foix", 9700));
		liste.add(new Ville("Pau", 77200));
		liste.add(new Ville("Marseille", 850700));
		liste.add(new Ville("Tarbes", 40600));
		// Iterator<Ville> iter = liste.iterator();

		// Recherchez la ville la plus peuplée
		int max = liste.get(0).getNbHab();
		int indexDuMax = 0;
		for (int i = 0; i < liste.size(); i++) {

			if (liste.get(i).getNbHab() >= max) {
				max = liste.get(i).getNbHab();
				indexDuMax = i;
			}
		}
		System.out.println("La ville la plus peuplée: " + liste.get(indexDuMax).getNom() + " avec "
				+ liste.get(indexDuMax).getNbHab() + " habitants");

		// Supprimez la ville la moins peuplée
		int min = liste.get(0).getNbHab();
		int indexDuMin = 0;
		String nomDuMin = null;
		Iterator<Ville> iter = liste.iterator();

		for (int i = 0; i < liste.size(); i++) {

			if (liste.get(i).getNbHab() <= min) {
				min = liste.get(i).getNbHab();
				indexDuMin = i;
				nomDuMin = liste.get(i).getNom();
			}
		}
		System.out.println("La ville la moins peuplée: " + liste.get(indexDuMin).getNom() + " avec "
				+ liste.get(indexDuMin).getNbHab() + " habitants");

		while (iter.hasNext()) {
			Ville val = iter.next();
			if (val.getNom().equals(nomDuMin)) {
				iter.remove();
				System.out.println("Elle a été supprimer de la liste");

			}
		}

		for (Ville var : liste) {
			if (var.getNbHab() > 100000) {
				var.setNom(var.getNom().toUpperCase());
				System.out.println(var.getNom());
			}

		}

	}

}
