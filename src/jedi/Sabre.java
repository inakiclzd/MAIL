package jedi;
/**
 * Write a description of class Sabre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sabre
{
    // instance variables - replace the example below with your own
    private String couleur;
    private Jedi proprietaire;

    /**
     * Constructor for objects of class Sabre
     */
    public Sabre(String couleur)
    {
        this.couleur = couleur;
    }

    public String getCouleur() {
        return this.couleur;
    }
    
    public Jedi getProprietaire() {
        return this.proprietaire;
    }
    
    public void setProprietaire(Jedi propJedi) {
    	if(this.proprietaire!=null)
    		this.proprietaire.removeSabre(this);
        this.proprietaire = propJedi;
        propJedi.addSabre(this);
        propJedi.levelUp();
    }
}
