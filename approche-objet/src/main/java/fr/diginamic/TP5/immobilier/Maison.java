package fr.diginamic.TP5.immobilier;

import fr.diginamic.TP6.ISurface;

public class Maison implements ISurface {
	Piece[] piec;
	int i;

	public Maison(int nbP) {
		piec = new Piece[nbP];

	}

	public void ajouterPiece(Piece maNewPiece) {
		this.piec[i] = maNewPiece;
		i++;
	}

	public double superficieEtage(int choixEtage) {
		double superficieEtage = 0;

		for (int i = 0; i < piec.length; i++) {
			if (choixEtage == this.piec[i].getNumEtage()) {
				superficieEtage = superficieEtage + this.piec[i].getSuperficie();
			}
		}

		return superficieEtage;
	}

	public double calculerSurface() {
		double superficieTot = 0;
		int i;

		for (i = 0; i < piec.length; i++) {
			superficieTot = superficieTot + this.piec[i].getSuperficie();
		}

		return superficieTot;
	}

	public Piece[] getPiec() {
		return piec;
	}
	
	

}
