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
        7.0 ,"Dubuisson" + false) ;
        //referencenement de l'objet uneBiere
        
        uneBiere.lireEtiquette();
        //utilisation d'une méthode creer dans la classe
    BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 , "Abbaye de Leffe" + true);
          //referencenement de l'objet uneBiere
        
        autreBiere.lireEtiquette();
        
        BouteilleBiere autreBiere2 = new BouteilleBiere("Corana", 6.4 , "bio" + false);
        
        autreBiere2.lireEtiquette();
        
    BouteilleBiere autreBiere3 = new BouteilleBiere("Heinken", 7.2 , "ami" + true);
    
    autreBiere3.lireEtiquette();
    
    uneBiere.Décapsuler();
    
    System.out.println("La bière est " + uneBiere.ouverte );
    System.out.println(uneBiere) ;
    System.out.println(autreBiere) ;
    uneBiere.Décapsuler();
    //utilisation et verification de la methode decapsuler
    }
    

}
