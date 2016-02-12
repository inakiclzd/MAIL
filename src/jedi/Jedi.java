package jedi;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Write a description of class Jedi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jedi
{
    // instance variables - replace the example below with your own
    private String nom;
    private int niveau;
    private Set<Sabre> sabres;
    private static Set<String> noms = new HashSet<>();
    

    /**
     * Constructor for objects of class Jedi
     */
    public Jedi(String nom) throws DuplicateNameException
    {
    	if (noms.contains(nom)) {
    		throw new DuplicateNameException();
    	}
    	noms.add(nom);
        this.nom = nom;
        this.niveau = 1;
        sabres = new HashSet<Sabre>();
    }

    public String getNom() {
        return this.nom;
    }
    
    public int getNiveau() {
        return this.niveau;
    }
    
    public Set<Sabre> getSabres() {
    	return Collections.unmodifiableSet(this.sabres);
    }
    
    public void addSabre(Sabre s) {
    	if (!this.sabres.contains(s)) {
    		this.sabres.add(s);
    		s.setProprietaire(this);
    	}
    }
    
    public void removeSabre(Sabre s) {
    	sabres.remove(s);
    	s.setProprietaire(null);
    }
    
    public void levelUp() {
        ++this.niveau;
    }
    
}
