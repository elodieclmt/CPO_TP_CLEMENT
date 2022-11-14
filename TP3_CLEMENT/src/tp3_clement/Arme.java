/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_clement;

/**
 *
 * @author Elodie
 */
public class Arme {
    private String Nom;
    private int NiveauAttaque;  //permet de mettre l'attibut en privé
                                //il ne sera modifible que dans le class
    
   public Arme(String Nom , int nb){
    Nom = Nom;
    if(nb>0){
        NiveauAttaque =1;
    }
    if(nb<100){
        NiveauAttaque =nb;
    }else{
        NiveauAttaque =100;
    }            
}

    public String getNom() {
        return Nom;
    }

    public int getNiveauAttaque() {
        return NiveauAttaque;
    }

    public void setNiveauAttaque(int NiveauAttaque) {
        if (NiveauAttaque>0){
        this.NiveauAttaque = NiveauAttaque;
    }}
    
   
    @Override
    public String toString() {
        return "Arme{" + "Nom=" + Nom + ", NiveauAttaque=" + NiveauAttaque + '}';
    }
    
    
    
}
