package jedi;

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
    

    /**
     * Constructor for objects of class Jedi
     */
    public Jedi(String nom)
    {
        this.nom = nom;
        this.niveau = 1;
        sabres=new HashSet<Sabre>();
    }

    public String getNom() {
        return this.nom;
    }
    
    public int getNiveau() {
        return this.niveau;
    }
    
    public Set<Sabre> getSabres() {
    	return this.sabres;
    }
    
    public void addSabre(Sabre s) {
    	sabres.add(s);
    }
    
    public void removeSabre(Sabre s) {
    	sabres.remove(s);
    }
    
    public int levelUp() {
        return ++this.niveau;
    }
    
}
