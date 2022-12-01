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
    
    private String couleur;   //couleur affecter au jeton, rouge ou jaune

    /**
     *initialise la couleur du jeton
     * @param couleur
     */
    public Jeton(String couleur) {
        this.couleur = couleur;  //on utilise le mot this car le nom du parramètre et le meme que celui de l'atribut
    }

    /**
     * accesseur de lecture, qui permet de lire la couleur d'un jeton
     * @return
     */
    public String lireCouleur() {
        return couleur;
    }

    /**
     * on retourne seulement un R ou un J pour désigner la couleur du jeton afin de
     * faciliter la lecture de la console
     * @return
     */
    @Override
    public String toString() {
        if(couleur=="jaune"){
            return "J";
        }else{
            return "R";
        }
     
    }
    
    
    
    
}
