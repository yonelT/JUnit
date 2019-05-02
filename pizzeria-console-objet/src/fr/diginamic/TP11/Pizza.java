package fr.diginamic.TP11;

/**
 * @author Yonel TOUSSAY
 *
 */
public class Pizza {
	private int id = 0;
	private String code = null;
	private String libelle = null;
	private double prix = 0;
	private static int compteur = 0;

	/** Constructeur par défaut */
	public Pizza() {

	}

	/**
	 * Constructor
	 * 
	 * @param code: code de la pizza
	 * @param libelle: nom de la pizza
	 * @param prix: prix de la pizza
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
	 * @param lIdentifiant: identifiant de la pizza
	 * @param leCode: code de la pizza
	 * @param leLibelle: nom de la pizza
	 * @param lePrix: prix de la pizza
	 */
	public Pizza(int lIdentifiant, String leCode, String leLibelle, double lePrix) {
		this.id = lIdentifiant;
		this.code = leCode;
		this.libelle = leLibelle;
		this.prix = lePrix;
	}

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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

}