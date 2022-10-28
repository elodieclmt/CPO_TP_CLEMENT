/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_clement;

/**
 *
 * @author Elodie
 */
public class TP2_relation_1_CLEMENT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        
Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;

Personne bob = new Personne("Bobby", "Sixkiller");
Personne reno = new Personne("Reno", "Raines");

System.out.println("liste des voitures disponibles "+ uneClio +
"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;


        bob.liste_voitures[0] = uneClio ;
        bob.nbVoitures = 1;
        uneClio.proprietaire = bob;
        
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] ) ;

bob.liste_voitures[1] = une2008;
        bob.nbVoitures ++;
        une2008.proprietaire = bob;
        
        reno.liste_voitures[0] = uneMicra;
        reno.nbVoitures ++;
        uneMicra.proprietaire = reno;
        
        reno.liste_voitures[1] = uneAutreClio;
        reno.nbVoitures ++;
        uneAutreClio.proprietaire = reno;
        
        System.out.println(bob.toString() + reno.toString());
        
        Voiture testvoiture = new Voiture( "RS3", "Audi",294);
        bob.ajouter_voiture(testvoiture);
        System.out.println(bob.toString() + testvoiture.toString());
    }
    
}
