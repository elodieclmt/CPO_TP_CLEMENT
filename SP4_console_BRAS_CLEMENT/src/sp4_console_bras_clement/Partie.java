/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_bras_clement;

import java.util.Random;

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
        Random couleur = new Random();
        int choix = couleur.nextInt(1);
        if (choix==1){
            listeJoueurs[1].affecterCouleur("Jaune");
            listeJoueurs[2].affecterCouleur("Rouge");
        }
        else{
            listeJoueurs[2].affecterCouleur("Jaune");
            listeJoueurs[1].affecterCouleur("Rouge");
        }
    
    }
    
    public void creerEtAffecterJeton(joueur J1){
       String couleur = J1.LireCouleur();
       for(int i=0; i<30 ; i++){
          Jeton jeton = new Jeton(couleur);
          J1.ajouterJeton(jeton);
          i+=1;
       }
        
    }
    
    public void initialiserPartie(){
        attribuerCouleurAuxJoueurs();
        creerEtAffecterJeton(listeJoueurs[1]);
        creerEtAffecterJeton(listeJoueurs[2]);
    }
    
    
}
