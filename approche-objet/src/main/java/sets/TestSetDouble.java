package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {
		Set<Double> set = new HashSet<Double>();

		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		set.add(13.3);

		for (double index : set) {
			System.out.println(index);
		}

		double max = set.iterator().next();
		Iterator<Double> iter = set.iterator();
		while (iter.hasNext()) {
			double val = iter.next();

			if (val > max) {
				max = val;
			}
		}
		System.out.println("Le plus grand élément de la collection: " + max);
	}
}
