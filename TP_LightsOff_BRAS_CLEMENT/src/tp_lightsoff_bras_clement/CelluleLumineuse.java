package tp_lightsoff_bras_clement;

import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elodie
 */
public class CelluleLumineuse {
    
    boolean etat;

    /**
     * Initialisation de la valeur de la cellule (allumée ou éteinte)
     * @param etat
     */
    public CelluleLumineuse() {
        Random ran = new Random();
        int choix = ran.nextInt(2);
        if( choix ==1 ){
            etat = true;
        }
        else{
            etat=false;
        }
    }

    /**
     * retourne l'état (vrai pour allumé et faux pour éteint)
     * @return
     */
    public boolean LireEtat() {
        return etat;
    }
    
    /**
     * donne la valeur vrai (allumé) à la case
     */
    public void AllumeToi(){
        etat=true;
    }
    
    /**
     *donne la valeur faux (éteint) à la case
     */
    public void EteintToi(){
        etat=false;
    }
    
    /**
     * change la valeur de la case
     * passe les cellules allumées à éteintes et inversement
     * @param valeur
     */
    public void ChangeTonEtat(){
        if (etat == true){
            etat = false;
        }
        else{
            etat = true;
        } 
    }

    /**
     * affiche l'etat de la cellule
     * @return
     */
    @Override
    public String toString() {
        if (etat == true){
            return "A";
        }
        else{
            return "E";
        }
        
    }
    
    
    
    
    
}
