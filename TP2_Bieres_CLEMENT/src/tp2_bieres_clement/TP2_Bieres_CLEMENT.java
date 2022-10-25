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
      BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
        7.0 ,"Dubuisson") ;
        //uneBiere.nom = "Cuvée des trolls";
        //uneBiere.degreAlcool = 7.0 ;
        //uneBiere.brasserie = "Dubuisson" ;  
        //uneBiere.ouverte = false;
        
        uneBiere.lireEtiquette();
        
    BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 , "Abbaye de Leffe");
        //autreBiere.nom = "Leffe";
        //autreBiere.degreAlcool = 6.6 ;
        //autreBiere.brasserie = "Abbaye de Leffe" ;  
        
        autreBiere.lireEtiquette();
        
        BouteilleBiere autreBiere2 = new BouteilleBiere("Corana", 6.4 , "bio");
        
        autreBiere2.lireEtiquette();
        
    BouteilleBiere autreBiere3 = new BouteilleBiere("Heinken", 7.2 , "ami");
    
    autreBiere3.lireEtiquette();
    
    uneBiere.Décapsuler();
    System.out.println("La bière est " + uneBiere.ouverte );
    }
    

}
