/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_clement;

/**
 *
 * @author Elodie
 */
public class TP2_Bieres_CLEMENT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      BouteilleBiere uneBiere = new BouteilleBiere() ;
        uneBiere.nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0 ;
        uneBiere.brasserie = "Dubuisson" ;  
        uneBiere.ouverte = false;
        uneBiere.lireEtiquette();
    BouteilleBiere uneBiere2 = new BouteilleBiere();
        uneBiere2.nom = "Leffe";
        uneBiere2.degreAlcool = 6.6 ;
        uneBiere2.brasserie = "Dubuisson" ;  
        uneBiere2.ouverte = false;
    
    }
    

}
