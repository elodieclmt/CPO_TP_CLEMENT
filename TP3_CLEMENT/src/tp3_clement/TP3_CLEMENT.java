/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_clement;

import java.util.ArrayList;

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
        
    }
    
}
