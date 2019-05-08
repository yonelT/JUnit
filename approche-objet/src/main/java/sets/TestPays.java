package sets;

import java.util.HashSet;
import java.util.Set;

public class TestPays {

	public static void main(String[] args) {

		Pays usa = new Pays("USA", 327167434, 55805);
		Pays france = new Pays("France", 67795000, 38476);
		Pays allemagne = new Pays("Allemagne", 82979100, 47589);
		Pays uk = new Pays("UK", 65105246, 43770);
		Pays italie = new Pays("Italie", 60483973, 29866);
		Pays japon = new Pays("Japon", 126330302, 39058);
		Pays chine = new Pays("Chine", 1417913092, 7989);
		Pays russie = new Pays("Russie", 146780700, 11099);
		Pays inde = new Pays("Inde", 1296834042, 1626);

		Set<Pays> listePays = new HashSet<Pays>();
		listePays.add(usa);
		listePays.add(france);
		listePays.add(allemagne);
		listePays.add(uk);
		listePays.add(italie);
		listePays.add(japon);
		listePays.add(chine);
		listePays.add(russie);
		listePays.add(inde);

		for (Pays parcour : listePays) {
			System.out.println(parcour.getHabitantPIB());
		}

	}

}
