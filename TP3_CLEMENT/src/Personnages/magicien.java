package Personnages;

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
    
    
    
    
    
}
