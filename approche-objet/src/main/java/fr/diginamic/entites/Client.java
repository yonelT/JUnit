package fr.diginamic.entites;

public class Client {
	int numeroCompte = 0;
	String nom = null;
	String prenom = null;
	AdressePostale adresse = null;

	public Client(int param1, String pNom, String pPrenom) {
		System.out.println("Nouvelle instance créée");
		numeroCompte = param1;
		nom = pNom;
		prenom = pPrenom;
		System.out.println("Numero Compte = " + numeroCompte);
		System.out.println("Nom = " + nom);
		System.out.println("Prenom = " + prenom);
	}

	public Client(int param1, String pNom, String pPrenom, AdressePostale adresse) {
		this(param1, pNom, pPrenom);
		this.adresse = adresse;
	}

	public void affichPreNomMaj() {
		System.out.println(this.prenom);
		System.out.println(this.nom.toUpperCase());
	}

	public void modifNom(String pNom) {
		this.nom = pNom;
	}

	public void modifPrenom(String pPrenom) {
		this.prenom = pPrenom;
	}

	public void modifNumCompte(int numCompte) {
		this.numeroCompte = numCompte;
	}

	public String recupPrenom() {
		return this.prenom;
	}

	public String recupNom() {
		return this.nom;
	}

	public int recupNumCompte() {
		return this.numeroCompte;
	}

}
