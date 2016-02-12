package adapter;

import billet.Billet;
import billet.Voyageur;
import jedi.Jedi;

public class VoyageurGalactique extends Voyageur {
	private Jedi jedi;
	
	public VoyageurGalactique(Jedi jedi) {
		this.setJedi(jedi);
	}
	
	public boolean reserver(Billet b) {
		if (b.getVoyageur() == null) {
			b.setVoyageur(this);
			b.setPrix(b.getPrix() + 100 * getJedi().getSabres().size());
			this.addBillet(b);
			return true;
		}
		return false;
	}

	public Jedi getJedi() {
		return jedi;
	}

	public void setJedi(Jedi jedi) {
		this.jedi = jedi;
	}
	
}
