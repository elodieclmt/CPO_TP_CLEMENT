/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_bras_clement;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Elodie
 */
public class cellule_graphique extends JButton {
    CelluleDeGrille CelluleAssociee;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"));
    ImageIcon img_desint = new javax.swing.ImageIcon(getClass().getResource("/images/desintegrateur.png"));
    ImageIcon img_jetonJaune = new javax.swing.ImageIcon(getClass().getResource("/images/jetonJaune.png"));
    ImageIcon img_jetonRouge = new javax.swing.ImageIcon(getClass().getResource("/images/jetonRouge.png"));
    ImageIcon img_trouNoir = new javax.swing.ImageIcon(getClass().getResource("/images/trouNoir.png"));
    
    public cellule_graphique(CelluleDeGrille uneCellule){
     CelluleAssociee =  uneCellule;  
    }
    
    @Override
    public void paintComponent(Graphics G){
      super.paintComponent(G);
      
      if (CelluleAssociee.presenceTrouNoir() == true){
           setIcon(img_trouNoir);
      }else if (CelluleAssociee.presenceDesintegrateur() == true){
           setIcon(img_desint);
      }else{
          String couleur_jeton = CelluleAssociee.lireCouleurDuJeton();
          switch(couleur_jeton){
              case "vide":
                  setIcon(img_vide); //attribut l'image celluleVide.png qui 
                                   //represente une cellule vide
                  break;
              case "jaune":
                  setIcon(img_jetonJaune);
                  break;
              case "rouge":
                  setIcon(img_jetonRouge);
                  break;
          }
      }
      
       

    }
}
