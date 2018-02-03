package sn.ept.calcul;

import junit.framework.TestCase;

public class CalculMetierTest extends TestCase {

	private CalculMetier calcul;
	
	/**
	 * Void setUp
	 */
	protected void setUp() throws Exception {
		
		super.setUp();
		calcul=new CalculMetier();
	}
	
	/**
	 * test de la somme 
	 */
	public void testSomme() {
		assertTrue(calcul.somme(6, 9)==15);
	}
	
	/**
	 * test de la méthode produit 
	 */
	public void testProduit() {
		assertTrue(calcul.produit(7, 4)==28);
	}
}
