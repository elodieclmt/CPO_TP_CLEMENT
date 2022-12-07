/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_lightsoff_bras_clement;

import java.util.Scanner;

/**
 *
 * @author Elodie
 */
public class Partie {
    
    Grille plateau;
    Joueur j1;

    public Partie() {
        plateau = new Grille();
         j1 = new Joueur();
    }
    
    public void LancerPartie(){
        //on affiche le plateau de jeu
        plateau.afficherGrilleSurConsole();
        
        //demmande au joueur de choisir son nom
        System.out.println("Renter votre nom de joueur");
        Scanner reponse = new Scanner(System.in);
        String Nom = reponse.next();
        j1.nom = Nom;
        
        while (plateau.grilleGagnante()==false){
            //on demande au joueur la case qu'il souhaite cliquer
            System.out.println("Renseigner la ligne souhaitee");
            Scanner ligne = new Scanner(System.in);
            int lgn = ligne.nextInt();

            System.out.println("Renseigner la colonne souhaitee ");
            Scanner colonne = new Scanner(System.in);
            int cln = colonne.nextInt();
            
            plateau.CliqueCellule(lgn, cln);
            j1.NbScore();
        }
        
        System.out.println("Bravo vous avez gagne en "+ j1.score + "clics !!");
    }
    
    
}
