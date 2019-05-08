package listes;

import fr.diginamic.TP5.immobilier.Chambre;
import fr.diginamic.TP5.immobilier.Cuisine;
import fr.diginamic.TP5.immobilier.SalleDeBain;
import fr.diginamic.TP5.immobilier.WC;

public class TestMaison2 {

	public static void main(String[] args) {
		Maison2 mais = new Maison2();
		Chambre cham = new Chambre(6, 1);
		Cuisine cuis = new Cuisine(4, 0);
		SalleDeBain salbain = new SalleDeBain(5, 1);
		WC wc = new WC(3, 0);
		Chambre cham2 = new Chambre(4, 0);

		mais.ajouterPiece(cham);
		mais.ajouterPiece(cuis);
		mais.ajouterPiece(salbain);
		mais.ajouterPiece(wc);
		mais.ajouterPiece(cham2);

		System.out.println("Superficie Total: " + mais.calculerSurface());
		System.out.println("Superficie de l'étage: " + mais.superficieEtage(0));

	}

}
