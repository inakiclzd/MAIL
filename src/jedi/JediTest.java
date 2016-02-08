package jedi;

import org.junit.Test;

import junit.framework.TestCase;

public class JediTest extends TestCase
{
	
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
	public void testProprietaire() throws DuplicateNameException {
		Sabre sab = new Sabre("Bleu");
		Jedi luke = new Jedi("Luke");
		
		sab.setProprietaire(luke);
		testAcquisitionSabre(sab,luke);
		
		Jedi anakin = new Jedi("Anakin");
		sab.setProprietaire(anakin);
		assertFalse(luke.getSabres().contains(sab));
		testAcquisitionSabre(sab,anakin);
	}
	
	private void testAcquisitionSabre(Sabre sab, Jedi jed) {
		assertTrue(jed.getSabres().contains(sab));
		assertEquals(jed.getNiveau(), 2);
	}

}
