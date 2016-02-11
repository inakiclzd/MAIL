package jedi;

import org.junit.Test;

import junit.framework.TestCase;

public class JediTest extends TestCase {
	@Test
	public void testBonneCouleur() {
		try {
			Sabre s = new Sabre("blanc");
			fail("Mauvaise couleur de sabre");
		} catch (Exception e) {
			assertTrue(e instanceof WrongColorException);
		}
	}
	
	@Test
	public void testUniciteNom() throws DuplicateNameException {
		Jedi obiwan1 = new Jedi("Obiwan");
		try {
			Jedi obiwan2 = new Jedi("Obiwan");
	        fail("Devrait retourner une exception de duplication de nom.");
	    } catch (Exception e) {
	    	assertTrue(e instanceof DuplicateNameException);
	    }
	}
	
	@Test
	public void testLevelUp() throws DuplicateNameException {
		Jedi yoda = new Jedi("Yoda");
		yoda.levelUp();
		assertEquals(yoda.getNiveau(), 2);
	}

	@Test
	public void testProprietaire() throws WrongColorException, DuplicateNameException {
		Sabre sab = new Sabre("bleu");
		Jedi luke = new Jedi("Luke");
		
		sab.setProprietaire(luke);
		testAcquisitionSabre(sab,luke);
		
		Jedi anakin = new Jedi("Anakin");
		sab.setProprietaire(anakin);
		assertFalse(luke.getSabres().contains(sab));
		testAcquisitionSabre(sab,anakin);
	}
	
	@Test
	public void testGetCouleur() throws WrongColorException {
		Sabre s = new Sabre("bleu");
		assertEquals(s.getCouleur(), "bleu");
	}
	
	@Test
	public void testGetProprietaire() throws WrongColorException, DuplicateNameException {
		Sabre s = new Sabre("bleu");
		assertNull(s.getProprietaire());
		Jedi anakin2 = new Jedi("Anakin2");
		s.setProprietaire(anakin2);
		assertEquals(s.getProprietaire(), anakin2);
	}
	
	@Test
	public void testGetNom() throws DuplicateNameException {
		Jedi anakin3 = new Jedi("Anakin3");
		assertEquals(anakin3.getNom(), "Anakin3");
	}
	
	@Test
	public void testGetNiveau() throws DuplicateNameException {
		Jedi anakin4 = new Jedi("Anakin4");
		assertEquals(anakin4.getNiveau(), 1);
	}
	
	@Test
	public void testGetSabres() throws DuplicateNameException {
		Jedi anakin5 = new Jedi("Anakin5");
		assertEquals(anakin5.getSabres().size(), 0);
	}
	
	@Test
	public void testJedi() throws DuplicateNameException {
		Jedi anakin6 = new Jedi("Anakin6");
		assertEquals(anakin6.getNiveau(), 1);
		assertEquals(anakin6.getNom(), "Anakin6");
		assertEquals(anakin6.getSabres().size(), 0);
	}
	
	@Test
	public void testSabre() throws WrongColorException {
		Sabre s = new Sabre("bleu");
		assertEquals(s.getCouleur(), "bleu");
		assertNull(s.getProprietaire());
	}
	
	private void testAcquisitionSabre(Sabre sab, Jedi jed) {
		assertTrue(jed.getSabres().contains(sab));
		assertEquals(jed.getNiveau(), 2);
	}

}
