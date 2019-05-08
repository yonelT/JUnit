package sets;

public class Pays {
	String nomP;
	long nbHabitants;
	int habitantPIB;

	/**
	 * Constructor
	 * 
	 * @param nomPays
	 * @param nbHab
	 * @param pIBHabitant
	 */
	public Pays(String nomPays, long nbHab, int pIBHabitant) {
		this.nomP = nomPays;
		this.nbHabitants = nbHab;
		this.habitantPIB = pIBHabitant;
	}

	/**
	 * Getters
	 * 
	 * @return the nomP
	 */
	public String getNomP() {
		return nomP;
	}

	/**
	 * Setters
	 * 
	 * @param nomP
	 *            the nomP to set
	 */
	public void setNomP(String nomP) {
		this.nomP = nomP;
	}

	/**
	 * Getters
	 * 
	 * @return the nbHabitants
	 */
	public long getNbHabitants() {
		return nbHabitants;
	}

	/**
	 * Setters
	 * 
	 * @param nbHabitants
	 *            the nbHabitants to set
	 */
	public void setNbHabitants(long nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	/**
	 * Getters
	 * 
	 * @return the habitantPIB
	 */
	public int getHabitantPIB() {
		return habitantPIB;
	}

	/**
	 * Setters
	 * 
	 * @param habitantPIB
	 *            the habitantPIB to set
	 */
	public void setHabitantPIB(int habitantPIB) {
		this.habitantPIB = habitantPIB;
	}

}
