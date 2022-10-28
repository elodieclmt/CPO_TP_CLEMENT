/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_clement;

/**
 *
 * @author Elodie
 */
public class Voiture {  //création classe
 //création des attribut dont proprietaire qui respresent un relation avec la 
 //classe Personne   
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire ;
    
    //Constructeur qui initialse les attributs
    public Voiture (String Modele1, String Marque1, int PuissanceCV1){
        Modele= Modele1;
        Marque=Marque1;
        PuissanceCV=PuissanceCV1;
        proprietaire=null;
    }
    
    
    @Override   //methode de mis en forme d'un return
    public String toString () {
    return ("Modele: "+Modele+ " Marque: "+Marque+ "Puissance CV"+ PuissanceCV+
            "Proriétaire: "+proprietaire);
    }
}
