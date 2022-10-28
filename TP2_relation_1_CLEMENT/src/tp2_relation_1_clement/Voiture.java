/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_clement;

/**
 *
 * @author Elodie
 */
public class Voiture {
 
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire ;
    
    public Voiture (String Modele1, String Marque1, int PuissanceCV1){
        Modele= Modele1;
        Marque=Marque1;
        PuissanceCV=PuissanceCV1;
        proprietaire=null;
    }
    
    
    @Override
    public String toString () {
    return ("Modele: "+Modele+ " Marque: "+Marque+ "Puissance CV"+ PuissanceCV+
            "Proriétaire: "+proprietaire);
    }
}
