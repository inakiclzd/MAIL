package adapter;

import java.util.ArrayList;

import org.junit.Test;

import billet.Billet;
import billet.Voyageur;
import jedi.DuplicateNameException;
import jedi.Jedi;
import jedi.Sabre;
import jedi.WrongColorException;
import junit.framework.TestCase;

public class VoyageurGalactiqueTest extends TestCase {
	

	@Test
	public void testReservation() throws DuplicateNameException, WrongColorException {
		ArrayList<Voyageur> voyageurs = new ArrayList<>();
		Jedi luke = new Jedi("Luke");
		Jedi leia = new Jedi("Leia");
		VoyageurGalactique vLuke = new VoyageurGalactique(luke);
		VoyageurGalactique vLeia = new VoyageurGalactique(leia);
		Sabre s1 = new Sabre("bleu");
		Sabre s2 = new Sabre("vert");
		Voyageur v1 = new Voyageur();
		Voyageur v2 = new Voyageur();
		voyageurs.add(v1);
		voyageurs.add(vLuke);
		voyageurs.add(v2);
		voyageurs.add(vLeia);
		
		s1.setProprietaire(luke);
		s2.setProprietaire(luke);
		
		for (Voyageur v : voyageurs) {
			v.reserver(new Billet(100));
			assertTrue(v.getBillets().size() == 1);
		}
		
		assertEquals(v1.getBillets().get(0).getPrix(), 100);
		assertEquals(vLuke.getBillets().get(0).getPrix(), 300);
		assertEquals(vLeia.getBillets().get(0).getPrix(), 100);
	}
	
	@Test
	public void testGetJedi() throws DuplicateNameException  {
		VoyageurGalactique vg = new VoyageurGalactique(new Jedi("Yoda"));
		assertEquals(vg.getJedi().getNom(), "Yoda");
	}
	
	@Test
	public void testSetJedi() throws DuplicateNameException  {
		VoyageurGalactique vg = new VoyageurGalactique(new Jedi("Obiwan"));
		vg.setJedi(new Jedi("Anakin"));
		assertEquals(vg.getJedi().getNom(), "Anakin");
	}
	
	

}
