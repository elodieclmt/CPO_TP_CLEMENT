/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_bras_clement;

import java.util.ArrayList;

/**
 *
 * @author Elodie
 */
public class joueur {
    
    private String nom;
    private String couleur;
    private ArrayList<Jeton> reserveJeton = new ArrayList<Jeton>();

    public joueur(String nom) {
        this.nom = nom;
    }
    
    public void affecterCouleur(String couleur){
        this.couleur = couleur;
    }
    
    public int nombreDeJeton(){
        return reserveJeton.size();
    }
    
    public void ajouterJeton(Jeton ajoutJeton){
        reserveJeton.add(ajoutJeton);
    }
    
    public Jeton jouerJeton(){
        Jeton j=reserveJeton.remove(0);
        return j;
    }

    public String LireCouleur() {
        return couleur;
    }
}
