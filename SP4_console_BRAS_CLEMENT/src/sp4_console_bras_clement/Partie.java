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
    
    private joueur [] listeJoueurs = new joueur [0];
    private joueur joueurCourant;
    private PlateauDeJeu plateau;

    public Partie(joueur joueurCourant1, joueur joueurCourant2) {
        
        listeJoueurs[0]= joueurCourant1;
        listeJoueurs[1]=joueurCourant2;
        plateau = new PlateauDeJeu();
    }
    
    public void attribuerCouleurAuxJoueurs(){
        Random couleur = new Random();
        int choix = couleur.nextInt(1);
        if (choix==1){
            listeJoueurs[0].affecterCouleur("Jaune");
            listeJoueurs[1].affecterCouleur("Rouge");
        }
        else{
            listeJoueurs[1].affecterCouleur("Jaune");
            listeJoueurs[0].affecterCouleur("Rouge");
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
    
    public void placerTrousNoirsEtDesintegrateur(){
        Random ran = new Random();
        int ligne = ran.nextInt(6);
        int colonne = ran.nextInt(7);
        int i=0;
        int j=0;
        int k=0;
        
        while(i<3){
        while(plateau.presenceTrouNoir(ligne,colonne) == true || plateau.presenceDesintegrateur(ligne,colonne)== true){
            ligne = ran.nextInt(6);
            colonne = ran.nextInt(7);    
        }
        plateau.placerTrouNoir(ligne, colonne);
        plateau.placerDesintegrateur(ligne, colonne);
        i+=1;
    }
    
     while(j<2){
        while(plateau.presenceTrouNoir(ligne,colonne) == true || plateau.presenceDesintegrateur(ligne,colonne)== true){
            ligne = ran.nextInt(6);
            colonne = ran.nextInt(7);    
        }
        plateau.placerTrouNoir(ligne, colonne);
        
        j+=1;
    }
     
     while(k<2){
        while(plateau.presenceTrouNoir(ligne,colonne) == true || plateau.presenceDesintegrateur(ligne,colonne)== true){
            ligne = ran.nextInt(6);
            colonne = ran.nextInt(7);    
        }
        plateau.placerDesintegrateur(ligne, colonne);
        
        k+=1;
    }
    }
    
    public void lancerPartie(){
        while(plateau.grilleRemplie()==false || plateau.etreGagnantePourCouleur("Jaune")==false || plateau.etreGagnantePourCouleur("Rouge")==false ){
            joueurCourant=listeJoueurs[0];
            
            
        }
    }
    
}
