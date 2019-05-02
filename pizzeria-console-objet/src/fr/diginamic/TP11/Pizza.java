package fr.diginamic.TP11;

/**
 * @author Yonel T
 *
 */
public class Pizza {
	private int id = 0;
	private String code = null;
	private String libelle = null;
	private double prix = 0;
	private static int compteur = 0;

	/* Constructeur par défaut */
	public Pizza() {

	}

	/*
	 * Constructeur
	 * 
	 * @params code: code de la pizza
	 * 
	 * @params libelle: le nom de la pizza
	 * 
	 * @params prix: le prix de la pizza
	 *
	 */

	public Pizza(String code, String libelle, double prix) {
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		Pizza.compteur = Pizza.compteur + 1;
	}

	/*
	 * Constructeur
	 * 
	 * @params lIdentifiant
	 * 
	 * @params leCode: code de la pizza
	 * 
	 * @params leLibelle: le nom de la pizza
	 * 
	 * @params lePrix: le prix de la pizza
	 *
	 */

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

	// public void modif(String codePizza, String nomPizza, double prixPizza2) {
	//
	// }
	//
	// List<Pizza> listPizza = new ArrayList<Pizza>();
	// Scanner sc = new Scanner(System.in);
	//
	// public void ajouter() {
	// System.out.println("\nVeuillez saisir le code :");
	// String codePizza1 = sc.nextLine();
	// System.out.println("Veuillez saisir le nom (sans espace) :");
	// String nomPizza1 = sc.nextLine();
	// System.out.println("Veuillez saisir le prix :");
	// double prixPizza1 = sc.nextDouble();
	// listPizza.add(new Pizza(codePizza1, nomPizza1, prixPizza1));
	// System.out.println("CODE -> LIBELLE (PRIX)");
	// System.out.println("-------------------------");
	// for (Pizza piz : listPizza) {
	// System.out.println(piz);
	// }
	//
	// }
}