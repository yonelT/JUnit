package fr.diginamic.TP11;

/**
 * @author Yonel TOUSSAY
 *
 */

public class Pizza {
	/** id : id de la pizza */
	private int id = 0;
	/** code : de la pizza */
	private String code = null;
	/** libelle : de la pizza */
	private String libelle = null;
	/** prix : de la pizza */
	private double prix = 0;
	/** compteur : int */
	private static int compteur = 0;

	/** Constructeur par défaut */
	public Pizza() {

	}

	/**
	 * Constructor
	 * 
	 * @param code:
	 *            code de la pizza
	 * @param libelle:
	 *            nom de la pizza
	 * @param prix:
	 *            prix de la pizza
	 */
	public Pizza(String code, String libelle, double prix) {
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		Pizza.compteur = Pizza.compteur + 1;
	}

	/**
	 * Constructor
	 * 
	 * @param lIdentifiant:
	 *            identifiant de la pizza
	 * @param leCode:
	 *            code de la pizza
	 * @param leLibelle:
	 *            nom de la pizza
	 * @param lePrix:
	 *            prix de la pizza
	 */
	public Pizza(int lIdentifiant, String leCode, String leLibelle, double lePrix) {
		this.id = lIdentifiant;
		this.code = leCode;
		this.libelle = leLibelle;
		this.prix = lePrix;
	}

	@Override
	public String toString() {
		return code + " -> " + libelle + " (" + prix + " €)";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pizza other = (Pizza) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (id != other.id)
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		if (Double.doubleToLongBits(prix) != Double.doubleToLongBits(other.prix))
			return false;
		return true;
	}

	/**
	 * Getters
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setters
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getters
	 * 
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Setters
	 * 
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Getters
	 * 
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setters
	 * 
	 * @param libelle
	 *            the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Getters
	 * 
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * Setters
	 * 
	 * @param prix
	 *            the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

	/**
	 * Getters
	 * 
	 * @return the compteur
	 */
	public static int getCompteur() {
		return compteur;
	}

	/**
	 * Setters
	 * 
	 * @param compteur
	 *            the compteur to set
	 */
	public static void setCompteur(int compteur) {
		Pizza.compteur = compteur;
	}

}