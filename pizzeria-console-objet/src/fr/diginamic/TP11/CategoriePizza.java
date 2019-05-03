package fr.diginamic.TP11;

/**
 * Enumeration du type de pizza
 * 
 * @author Diginam
 *
 */
public enum CategoriePizza {

	VIANDE("Viande"), POISSON("Poisson"), SANS_VIANDE("Sans Viande");

	private String catego;

	private CategoriePizza(String catego) {
		this.catego = catego;
	}

	public String getCatego() {
		return catego;
	}

	public void setCatego(String catego) {
		this.catego = catego;
	}

}
