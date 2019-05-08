package fr.diginamic.entites;

public class AdressePostale {
	private int numeroRue;
	private String libelleRue;
	private int codePostale;
	private String ville;
	public int nbDepartements = 103;

	public AdressePostale(int numeroRue, String libelleRue, int codePostale, String ville) {
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostale = codePostale;
		this.ville = ville;
		System.out.println(this.nbDepartements);
	}

	public int getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getLibelleRue() {
		return libelleRue;
	}

	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	public int getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getNbDepartements() {
		return nbDepartements;
	}

	public void setNbDepartements(int nbDepartements) {
		this.nbDepartements = nbDepartements;
	}

}
