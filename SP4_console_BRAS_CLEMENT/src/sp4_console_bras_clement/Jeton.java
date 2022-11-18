package sp4_console_bras_clement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elodie
 */
public class Jeton {
    
    private String couleur;

    public Jeton(String couleur) {
        this.couleur = couleur;
    }

    public String lireCouleur() {
        return couleur;
    }

    @Override
    public String toString() {
        if(couleur=="jaune"){
            return "J";
        }else{
            return "R";
        }
     
    }
    
    
    
    
}
