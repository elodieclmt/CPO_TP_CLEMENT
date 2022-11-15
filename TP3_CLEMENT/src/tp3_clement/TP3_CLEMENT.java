/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_clement;

import Personnages.guerrier;
import Personnages.magicien;
import Personnages.Personnage;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;
import Armes.*;

/**
 *
 * @author Elodie
 */
public class TP3_CLEMENT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //création de 4 objet (2 épées et 2 batons)
        Epee exp = new Epee(5, "Excalibur",7);
        Epee dur = new Epee(7, "Durandal", 4);
        
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);
        
        ArrayList<Arme> Tab = new ArrayList<Arme>(); //création tableau dynamique
        Tab.add(exp);
        Tab.add(dur);
        Tab.add(chene);
        Tab.add(charme);
        
        //Affichage des éléments du tableau
        int taille = Tab.size();
        
        for (int i=0; i<taille ; i++){
            System.out.println("votre amre est : " + Tab.get(i));
        }
        
        //création des personnages
        magicien Gand = new magicien (true , "Gandalf", 65);
        magicien Garci = new magicien (false , "Garcimore", 44);
        
        guerrier Con = new guerrier (false , "Conan", 78);
        guerrier Lan = new guerrier (true , "Lannister", 45);
        
        
        ArrayList<Personnage> Tab2 = new ArrayList<Personnage>(); //création tableau dynamique
        Tab2.add(Gand);
        Tab2.add(Garci);
        Tab2.add(Con);
        Tab2.add(Lan);
        
        //Affichage des éléments du tableau
        int taille2 = Tab2.size();
        
        for (int j=0; j<taille2 ; j++){
            System.out.println("votre Personnage est : " + Tab2.get(j));
        }
    }
    
}
