package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elodie
 */
public class Personnage {
    public static int nbPersonnages=0; //attribut propre à la classe qui
                                       //compte le nombre de personnages créer
    
    private String Nom;
    private int NiveauVie;  //permet de mettre l'attibut en privé
                                //il ne sera modifible que dans le class
    ArrayList<Arme> inventaire = new ArrayList<Arme>();
    Arme arme_en_main = null;
    

    public Personnage(String Nom, int NiveauVie) {
        if(NiveauVie<0){
            NiveauVie = 1;
        }
        if(NiveauVie<100){
        NiveauVie =NiveauVie;
    }else{
        NiveauVie =100;
    }  
        this.Nom = Nom;
        this.NiveauVie = NiveauVie;
        nbPersonnages++;
    }

    public String getNom() {
        return Nom;
    }

    public int getNiveauVie() {
        return NiveauVie;
    }

    public void setNiveauVie(int NiveauVie) {
        this.NiveauVie = NiveauVie;
    }

    @Override
    public String toString() {
        return "Personnage{" + "Nom=" + Nom + ", NiveauVie=" + NiveauVie + " arme en mains : "+ arme_en_main +'}';
    }
    
   public void gestion(Arme arme){  //methode qui ajoute des armes
       if (inventaire.size()<5){
           inventaire.add(arme);
       }   
   }
   
   public void equiper (Arme arme){  //méthodes qui vérifie qi l'arme voulu
                                            //existe
      boolean result =  inventaire.contains(arme);
if (result == true) {
   System.out.println("Votre arme en mains est "+ arme);  
    arme_en_main = arme;
} else {
   System.out.println("Cette arme n'existe pas"); 
   arme_en_main= null;
} 
       
   }

    public Arme getArme_en_main() {
        return arme_en_main;
    }
   
   
   
}
