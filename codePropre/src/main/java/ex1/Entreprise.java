package ex1;

import java.util.Date;

/**
 * @author Diginamic
 *
 */

public class Entreprise {

	/** int siret: le numero de siret de l'entreprise */
	public int siret;

	/** String nom: le nom de l'entreprise */
	public String nom;

	/** String adresse: l'adresse de l'entreprise */
	public String adresse;

	/** Date date_Creation: la date de creation de l'entreprise */
	public Date date_Creation;

	/** int capitalMax: le capital maximum de l'entreprise */
	public static final int capitalMax = 3000000;

	/** Constructeur par defaut de la classe Entreprise
	 */
	public Entreprise() {

	}

	/** Permet d'afficher le statut de l'entreprise
	 */
	public void Afficher_statut() {

	}

	/** Getter
	 * @return Recupere le numero de siret de l'entreprise
	 */
	public int getSiret() {
		return siret;
	}

	/** Setter
	 * @param int siret: Pour definir le numero de siret de l'entreprise
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}
	
	/** Getter
	 * @return Recupere le nom de l'entreprise
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param String nom: Pour definir le nom de l'entreprise
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return Recupere l'adresse de l'entreprise
	 */
	public String getAdresse() {
		return adresse;
	}

	/** Setter
	 * @param String adresse: Pour definir l'adresse de l'entreprise
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/** Getter
	 * @return: Recupere la date de creation de l'entreprise
	 */
	public Date getDate_Creation() {
		return date_Creation;
	}

	/** Setter
	 * @param Date date_Creation: Pour definir la date de creation de l'entreprise
	 */
	public void setDate_Creation(Date date_Creation) {
		this.date_Creation = date_Creation;
	}

	/** Getter
	 * @return Recupere le capital maximum de l'entreprise
	 */
	public static int getCapitalmax() {
		return capitalMax;
	}
}
