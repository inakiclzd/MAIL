package billet;

import static org.junit.Assert.*;

import org.junit.Test;

import jedi.Sabre;
import jedi.WrongColorException;

public class BilletTest {
	
	@Test
	public void testGetNumeroBillet() {
		Billet b = new Billet(100);
		assertEquals(b.getNumeroBillet(), 1);
	}
	
	@Test
	public void testSetNumeroBillet() {
		Billet b = new Billet(100);
		b.setNumeroBillet(4);
		assertEquals(b.getNumeroBillet(), 4);
	}
	
	@Test
	public void testGetPrix() {
		Billet b = new Billet(100);
		assertEquals(b.getPrix(), 100);
	}
	
	@Test
	public void testSetPrix() {
		Billet b = new Billet(100);
		b.setPrix(300);
		assertEquals(b.getPrix(), 300);
	}
	
	@Test
	public void testGetVoyageur() {
		Billet b = new Billet(100);
		Voyageur v = new Voyageur();
		v.reserver(b);
		assertEquals(b.getVoyageur().getCodeVoyageur(), 4);
	}
	
	@Test
	public void testSetVoyageur() {
		Billet b = new Billet(100);
		Voyageur v = new Voyageur();
		v.reserver(b);
		b.setVoyageur(new Voyageur());
		assertEquals(b.getVoyageur().getCodeVoyageur(), 3);
	}
	
	@Test
	public void testSetCodeVoyageur() {
		Voyageur v = new Voyageur();
		v.setCodeVoyageur(100);
		assertEquals(v.getCodeVoyageur(), 100);
	}

}
