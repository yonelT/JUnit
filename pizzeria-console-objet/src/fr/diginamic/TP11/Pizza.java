package fr.diginamic.TP11;

public class Pizza {
	int id = 0;
	String code = null;
	String libelle = null;
	double prix = 0;
	
	/* Constructeur */
	public Pizza() {
		
	}
	
	public Pizza(String code, String libelle, double prix) {
		this.id = this.id + 1;
	}
	
	public Pizza(int lIdentifiant, String leCode, String leLibelle, double lePrix) {
		
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
		return "Pizza [id=" + id + ", code=" + code + ", libelle=" + libelle + ", prix=" + prix + "]";
	}
	
//	public void ajouter(int id, String code, String libelle, double prix) {
//		System.out.println("Methode \"ajouter\"");
//	} A modif
	


}
