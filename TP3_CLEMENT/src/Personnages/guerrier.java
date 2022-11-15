package Personnages;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elodie
 */
public class guerrier extends Personnage {
    public static int nbGuerrier = 0;
    private boolean cheval;

    public guerrier(boolean cheval, String Nom, int NiveauVie) {
        super(Nom, NiveauVie);
        this.cheval = cheval;
        nbGuerrier++;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }

    
    
}
