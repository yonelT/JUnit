package fr.diginamic.TP5.calculsalaire;

public abstract class Intervenant {
	private String nom = "toussay";
	private String prenom = "yonel";

	public Intervenant() {

	}

	public abstract double getSalaire();

	public void afficherDonnees() {
		System.out.println("Nom: " + getNom());
		System.out.println("Prenom: " + getPrenom());
		System.out.println("Salaire: " + getSalaire());
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
