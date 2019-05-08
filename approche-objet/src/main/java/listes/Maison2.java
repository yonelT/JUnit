package listes;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.TP5.immobilier.Piece;

public class Maison2 {
	List<Piece> liste = new ArrayList<Piece>();
	int i;

	public Maison2() {

	}

	public void ajouterPiece(Piece maNewPiece) {
		liste.add(maNewPiece);
	}

	public double superficieEtage(int choixEtage) {
		double superficieEtage = 0;
		int i = 0;

		for (i = 0; i < liste.size(); i++) {
			if (choixEtage == liste.get(i).getNumEtage()) {
				superficieEtage = superficieEtage + liste.get(i).getSuperficie();
			}
		}

		return superficieEtage;
	}

	public double calculerSurface() {
		double superficieTota = 0;
		int i;

		for (i = 0; i < liste.size(); i++) {
			superficieTota = superficieTota + liste.get(i).getSuperficie();
		}

		return superficieTota;
	}

}