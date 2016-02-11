package billet;

import java.util.ArrayList;

public class Voyageur {
    private int codeVoyageur;
    private static int code = 1;
    private ArrayList<Billet> billets;
    
    public Voyageur() {
    	this.codeVoyageur = code++;
    	this.setBillets(new ArrayList<>());
    }

    public int getCodeVoyageur() {
        return codeVoyageur;
    }

    public void setCodeVoyageur(int codeV) {
        this.codeVoyageur = codeV;
    }

	public ArrayList<Billet> getBillets() {
		return billets;
	}

	public void setBillets(ArrayList<Billet> billets) {
		this.billets = billets;
	}
	
	public boolean reserver(Billet b) {
		if (b.getVoyageur() == null) {
			b.setVoyageur(this);
			this.getBillets().add(b);
			return true;
		}
		return false;
	}
}

