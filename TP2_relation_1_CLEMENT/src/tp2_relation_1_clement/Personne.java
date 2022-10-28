/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_clement;

/**
 *
 * @author Elodie
 */
public class Personne {
  
    String Nom;
    String Prenom;
    int nbVoitures ;
    Voiture [] liste_voitures ;
    
    public  Personne(String Nom1, String Prenom1){
     Nom=Nom1;
     Prenom=Prenom1;
     liste_voitures = new Voiture [3] ;
     nbVoitures=0;
    }
    
    @Override
public String toString () {
return ("prénom: "+Prenom+" Nom: "+Nom+"Nombre de voiture "+nbVoitures);

}
}

