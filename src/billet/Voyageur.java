package billet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Voyageur {
    private int codeVoyageur;
    private static int code = 1;
    private ArrayList<Billet> billets;
    
    public Voyageur() {
    	this.codeVoyageur = code++;
    	this.billets = new ArrayList<>();
    }

    public int getCodeVoyageur() {
        return codeVoyageur;
    }

    public void setCodeVoyageur(int codeV) {
        this.codeVoyageur = codeV;
    }

	public List<Billet> getBillets() {
		return Collections.unmodifiableList(billets);
	}
	
	protected void addBillet(Billet b) {
		this.billets.add(b);
	}
	
	public boolean reserver(Billet b) {
		if (b.getVoyageur() == null) {
			b.setVoyageur(this);
			this.addBillet(b);
			return true;
		}
		return false;
	}
}

