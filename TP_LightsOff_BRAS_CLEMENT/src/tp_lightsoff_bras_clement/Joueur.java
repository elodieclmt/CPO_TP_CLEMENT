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

    public Joueur(String nom, int score) {
        this.nom = nom;
        this.score = 0;
    }
    
    public void NbScore(){
        score += 1;
    }
    
    
}
