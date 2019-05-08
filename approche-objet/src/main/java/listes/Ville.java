package listes;

public class Ville {
	String nom;
	int nbHab;

	public Ville(String nomVille, int nbH) {
		this.setNom(nomVille);
		this.setNbHab(nbH);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHab() {
		return nbHab;
	}

	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}

	public static void main(String[] args) {

	}
}
