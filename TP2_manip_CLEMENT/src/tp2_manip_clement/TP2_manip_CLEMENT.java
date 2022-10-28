/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_clement;

/**
 *
 * @author Elodie
 */
public class TP2_manip_CLEMENT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //referencement des objets
        Tratiflette assiette1 = new Tratiflette(500) ;
        Tratiflette assiette2 = new Tratiflette(600) ;
        Tratiflette assiette3 = assiette2 ;
        
        
        
System.out.println("nb de calories de Assiette 2 : " +
assiette2.nbCalories) ;
System.out.println("nb de calories de Assiette 3 : " +
assiette3.nbCalories) ;
//Il y a 2 tartiflettes mais l'assiette 2 et 3 donne la meme tratiflette(apres vérification)

assiette2.nbCalories += 3;

System.out.println("nb de calories de Assiette 2 : " +
assiette2.nbCalories) ;
System.out.println("nb de calories de Assiette 3 : " +
assiette3.nbCalories) ;
//incrémentation des assiettes 2 et 3 puisqu'elle represente la meme tratiflette

//initialisation d'une variable qui nous permettra déchanger deux valeurs ensemble
int temps;

temps=assiette1.nbCalories ;
assiette1.nbCalories=assiette2.nbCalories;
assiette2.nbCalories=temps;

System.out.println("nb de calories de Assiette 1 : " +
assiette1.nbCalories) ;
System.out.println("nb de calories de Assiette 2 : " +
assiette2.nbCalories) ;

//Moussaka assiette666 = assiette1 ;
//Moussaka assiette667 = new Tartiflette() ;
//Les deux sont fausse car il n'y a pas le paramètre d'entré nbCalories
//+ dans la deuxième il faudrait qu'il y est Moussaka à la place de Tratiflette
// Donc non on ne peut pas creer un objet qui appartient à une classe et l'associer à une autre classe

//referencement d'un tableau de 10 places + son remplissage avec 10 plats contenat 10 
//valeur de calories différentes
Moussaka tabMoussaka[] = new Moussaka [10];

for (int i=0; i <= tabMoussaka.length; i++) {
    
    tabMoussaka[i] = new Moussaka (i+2576);
    }
    }
    
}
