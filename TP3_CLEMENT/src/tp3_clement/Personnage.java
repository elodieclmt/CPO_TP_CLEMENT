package tp3_clement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elodie
 */
public class Personnage {
    
    private String Nom;
    private int NiveauVie;  //permet de mettre l'attibut en privé
                                //il ne sera modifible que dans le class

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
        return "Personnage{" + "Nom=" + Nom + ", NiveauVie=" + NiveauVie + '}';
    }
    
    
    
}
