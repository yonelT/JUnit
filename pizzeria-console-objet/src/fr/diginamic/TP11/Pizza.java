package fr.diginamic.TP11;

public class Pizza {
	private int id = 0;
	private String code = null;
	private String libelle = null;
	private double prix = 0;

	/* Constructeur */
	public Pizza() {

	}

	public Pizza(String code, String libelle, double prix) {
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		this.id = this.id + 1;
	}

	public Pizza(int lIdentifiant, String leCode, String leLibelle, double lePrix) {
		this.id = lIdentifiant;
		this.code = leCode;
		this.libelle = leLibelle;
		this.prix = lePrix;
	}

	/* Fin des Constructeurs */

	public void setId(int identifiant) {
		this.id = identifiant;
	}

	public int getId() {
		return this.id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return code + " -> " + libelle + " (" + prix + " €)";
	}

	public void modif(String codePizza, String nomPizza, double prixPizza2) {
		

	}
}