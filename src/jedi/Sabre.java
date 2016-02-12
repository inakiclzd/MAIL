package jedi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
    private static Set<String> couleurs = new HashSet<>(Arrays.asList("bleu", "vert", "rouge", "jaune", "violet"));

    /**
     * Constructor for objects of class Sabre
     */
    public Sabre(String couleur) throws WrongColorException {
    	if (couleurs.contains(couleur)) {
    		this.couleur = couleur;
    	} else {
    		throw new WrongColorException();
    	}
    }

    public String getCouleur() {
        return this.couleur;
    }

    public Jedi getProprietaire() {
        return this.proprietaire;
    }

    public void setProprietaire(Jedi jedi) {
    	if (jedi == null || (this.proprietaire != null && this.proprietaire.getNom() == jedi.getNom())) {
    		this.proprietaire = jedi;
    	} else {
    		if (this.proprietaire != null) {
        		this.getProprietaire().removeSabre(this);
        	}
    		this.proprietaire = jedi;
            jedi.addSabre(this);
            jedi.levelUp();
    	}
    }
}
