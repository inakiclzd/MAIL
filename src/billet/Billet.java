package billet;

public class Billet {
    private int numeroBillet;
    private static int numero = 1;
    private int prix;
    private Voyageur voyageur;

    public Billet(int prix) {
    	this.numeroBillet = numero++;
    	this.prix = prix;
    }

    public int getNumeroBillet() {
        return numeroBillet;
    }

    public int getPrix() {
        return prix;
    }

    public void setNumeroBillet(int numero) {
        this.numeroBillet = numero;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

	public Voyageur getVoyageur() {
		return voyageur;
	}

	public void setVoyageur(Voyageur voyageur) {
		this.voyageur = voyageur;
	}
}
