package fr.diginamic.operations;

public class CalculMoyenne {
	double[] tab;
	int i = 0;

	public CalculMoyenne(int longueur) {
		if (longueur < 1) {
			longueur = -(longueur);
		}

		this.tab = new double[longueur];
	}

	public void ajout(double aAjouter) {
		this.tab[i] = aAjouter;
		System.out.println(this.tab[i]);
		i++;
	}

	public double calcul() {
		int index = 0;
		double somme = 0;

		for (index = 0; index < this.tab.length; index++) {
			somme = somme + this.tab[index];
		}

		return (somme / this.tab.length);
	}

}
