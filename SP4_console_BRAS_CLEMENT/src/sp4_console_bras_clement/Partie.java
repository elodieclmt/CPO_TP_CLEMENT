/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_bras_clement;

/**
 *
 * @author Elodie
 */
public class Partie {
    
    private joueur [] listeJoueurs = new joueur [2];
    private joueur joueurCourant;
    private PlateauDeJeu plateau;

    public Partie(joueur joueurCourant1, joueur joueurCourant2) {
        
        listeJoueurs[1]= joueurCourant1;
        listeJoueurs[2]=joueurCourant2;
        plateau = new PlateauDeJeu();
    }
    
    public void attribuerCouleurAuxJoueurs(){
        
    
    }
    
    
}
