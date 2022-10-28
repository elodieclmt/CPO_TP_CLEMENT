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
        
        Tratiflette assiette1 = new Tratiflette(500) ;
        Tratiflette assiette2 = new Tratiflette(600) ;
        Tratiflette assiette3 = assiette2 ;
        
        //Il y a 2 tartiflettes mais l'assiette 2 et 3 donne la meme tratiflette
        
        System.out.println("nb de calories de Assiette 2 : " +
assiette2.nbCalories) ;
System.out.println("nb de calories de Assiette 3 : " +
assiette3.nbCalories) ;

assiette2.nbCalories += 3;

System.out.println("nb de calories de Assiette 2 : " +
assiette2.nbCalories) ;
System.out.println("nb de calories de Assiette 3 : " +
assiette3.nbCalories) ;

int temps;

temps=assiette1.nbCalories ;
assiette1.nbCalories=assiette2.nbCalories;
assiette2.nbCalories=temps;

System.out.println("nb de calories de Assiette 1 : " +
assiette1.nbCalories) ;
System.out.println("nb de calories de Assiette 2 : " +
assiette2.nbCalories) ;

    }
    
}
