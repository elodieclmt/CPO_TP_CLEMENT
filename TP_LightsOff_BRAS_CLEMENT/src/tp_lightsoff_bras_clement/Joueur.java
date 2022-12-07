/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_lightsoff_bras_clement;

/**
 *
 * @author Elodie
 */
public class Joueur {
    
    String nom;
    int score;

    /**
     * Initialisation du nom du joueur et de son score à 0(car il n'a pas encore joué)
     * @param nom
     * @param score
     */
    public Joueur() {
        //this.nom = nom;
        this.score = 0;
    }
    
    /**
     *Incrementation de son score
     */
    public void NbScore(){
        score += 1;
    }

   
    
    
}
