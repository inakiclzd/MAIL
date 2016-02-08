package jedi;

import org.junit.Test;

import junit.framework.TestCase;

public class JediTest extends TestCase
{
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
	public void testLevelUp() {
		Jedi luke = new Jedi("Luke");
		assertEquals(luke.levelUp(), 2);
	}

	@Test
	public void testProprietaire() throws WrongColorException {
		Sabre sab = new Sabre("bleu");
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
