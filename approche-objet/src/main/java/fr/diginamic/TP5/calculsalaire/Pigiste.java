package fr.diginamic.TP5.calculsalaire;

public class Pigiste extends Intervenant {
	int nbJoursMois = 0;
	double prixJours = 0;
	double salairePigMens = 0;

	public Pigiste(int joursMois, double prixJrs) {
		this.nbJoursMois = joursMois;
		this.prixJours = prixJrs;
		this.salairePigMens = joursMois * prixJrs;
	}

	public double getSalaire() {
		return this.salairePigMens;
	}

	public void afficherDonnees() {
		super.afficherDonnees();
		System.out.println("Statut: Pigiste");
	}

}
