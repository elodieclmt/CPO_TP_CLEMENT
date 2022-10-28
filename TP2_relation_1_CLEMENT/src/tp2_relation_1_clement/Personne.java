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
return (" Prénom: "+Prenom+" Nom: "+Nom+" Nombre de voiture: "+nbVoitures);
}

public boolean ajouter_voiture(Voiture voiture_a_ajouter) {     
    
        //on verifie que la personne n'a pas déja 3 voitures et que la voiture 
        //n'a pas été volé
        if (nbVoitures < 3 & voiture_a_ajouter.proprietaire == null){ 
            
            //on vérifie s'il y y a un emplacement libre et où il se situe pour mettre la voiture
            for(int k = 0; k < 3; k ++){    
              if(liste_voitures[k] == null){
                    liste_voitures[k] = voiture_a_ajouter;
                    nbVoitures ++;
                    voiture_a_ajouter.proprietaire = this;
                    return true;          
                }                       //Si la condition est respectée alors on
            }                          // renvoie vrai sinon faux 
        }return false; 
}

}
