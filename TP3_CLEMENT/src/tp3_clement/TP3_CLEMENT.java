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
        
        //test des personnges avec leur arme
        magicien Jaq = new magicien (true , "Jaque", 65);
        guerrier Mich = new guerrier (false , "Michel", 78);
        
        Epee arme1 = new Epee(5, "arme1",7);
        Epee arme2 = new Epee(7, "arme2", 4);
        Epee arme3 = new Epee(5, "arme3",7);
        
        Baton arme4 = new Baton("arme4", 4, 5);
        Baton arme5 = new Baton("arme5", 5, 6);
        Baton arme6 = new Baton("arme6", 4, 5);
     //ajout des armes pour le guerrier + choix de l'amre en main
        Mich.gestion(arme1);
        Mich.gestion(arme2);
        Mich.gestion(arme4);
        
        Mich.equiper(arme2);
        Mich.getArme_en_main();
        
        //ajout des armes pour le magicien + choix de l'amre en main
        Jaq.gestion(arme3);
        Jaq.gestion(arme5);
        Jaq.gestion(arme6);
        
        Jaq.equiper(arme3);
        Jaq.getArme_en_main();
        Jaq.NbArmePref();
        
        System.out.println(Jaq.toString());
        System.out.println(Mich.toString());
        
    }
    
}
