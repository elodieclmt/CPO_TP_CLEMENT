package Personnages;

import Armes.Arme;
import Armes.Baton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elodie
 */
public class magicien extends Personnage{
    
    private boolean confirme;

    public magicien(boolean confirme, String Nom, int NiveauVie) {
        
        super(Nom, NiveauVie);
        this.confirme = confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }
    
    //choix des armes préférer du magicien
    Arme arme;
    int nbArme = 0;
    public int NbArmePref(){
        for (int i=0; i< inventaire.size();i++){
          arme = inventaire.get(i);
          if( arme instanceof Baton){
              nbArme += 1; 
          }
        }
        System.out.println("le nombre d'armes préférer est : "+ nbArme);
        return nbArme;
    }
    
    
    
}
