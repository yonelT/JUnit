package fr.diginamic.utils;

public class TriTableau {
	int[] tab = { 14, 5, 4, 7, 3 };
	int max;

	public TriTableau() {
		System.out.println("Constructeur");
	};

	public void triTab(int[] array) {
		int i = 0;

		while ((i < array.length) || (array[i] > array[i + 1])) {

			i++;
		}
	}

}
