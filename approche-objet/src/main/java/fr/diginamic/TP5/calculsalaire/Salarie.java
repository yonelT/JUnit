package fr.diginamic.TP5.calculsalaire;

public class Salarie extends Intervenant {
	double salaireMensuel = 0;

	public Salarie(double salaire) {
		this.salaireMensuel = salaire;
	}

	public double getSalaire() {
		return this.salaireMensuel;
	}

	public void afficherDonnees() {
		super.afficherDonnees();
		System.out.println("Statut: Salarié");
	}

}
