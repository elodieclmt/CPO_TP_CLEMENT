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
    
    public  Personne(String Nom1, String Prenom1){
     Nom=Nom1;
     Prenom=Prenom1;
    }
    
    @Override
public String toString () {
return ("prénom: "+Prenom+" Nom: "+Nom);
}
}

