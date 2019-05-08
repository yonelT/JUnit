package fr.diginamic.approche_objet;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.diginamic.TP5.immobilier.Chambre;
import fr.diginamic.TP5.immobilier.Maison;

public class MaisonTest {
	
	private Maison mais = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		mais = new Maison(1);
		Chambre cham = new Chambre(5, 1);
		
		mais.ajouterPiece(cham);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAjouterPiece() {
		
		assertNotNull(mais.getPiec()[0]);
		
	}
	
	@Test
	public void testSuperficieEtage() {

		
		double superficieEtage1 = mais.superficieEtage(1);
		
		assertEquals(5, superficieEtage1, 0);
		assertNotEquals(6, superficieEtage1, 0);
		
		
		superficieEtage1 = mais.superficieEtage(2);
		
		assertEquals(0, superficieEtage1, 0);
		

		
	}


}
